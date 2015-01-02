package com.shinowit.web;

import com.shinowit.framework.dao.UpdateUserInfoDAO;
import com.shinowit.tools.SendHtmlEmail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.io.UnsupportedEncodingException;
import java.util.Date;
import java.util.List;

/**
 * Created by daihui on 2014-12-26.
 */
@Controller
@RequestMapping("/reg")
public class UserRegController {

    @Resource
    private UpdateUserInfoDAO userInfoDAO;

    @Resource
    private TbaMemberinfoMapper memberDAO;

    @Resource
    private SendHtmlEmail email;

    //访问注册页
    @RequestMapping(value = "/reg")
    public String Reg(@ModelAttribute("member") TbaMemberinfo tbaMemberinfo) {
        return "reg";
    }

    //验证码
    @RequestMapping(value = "/validCode")
    public String validCode() {
        return "validCode";
    }

    //用户注册
    @RequestMapping(value = "/userReg")
    public String userReg(@Valid @ModelAttribute("member") TbaMemberinfo tbaMemberinfo, BindingResult bindingResult, @RequestParam("password") String password,
                          @RequestParam("validCode") String validCode, RedirectAttributes redirectAttributes, Model model, HttpServletRequest request) {

        //判断用户是否存在
        TbaMemberinfoExample example = new TbaMemberinfoExample();
        example.createCriteria().andUsernameEqualTo(tbaMemberinfo.getUsername());
        example.createCriteria().andEmailEqualTo(tbaMemberinfo.getEmail());
        List<TbaMemberinfo> memberinfoList = memberDAO.selectByExample(example);
        if (memberinfoList.size() > 0) {
            return "/reg";
        }

        //判断两次密码是否相同
        if (!tbaMemberinfo.getPwd().equals(password)) {
            return "/reg";
        }
        //判断验证码是否正确
        HttpSession session = request.getSession(true);
        if (!(session.getAttribute("rand")).equals(validCode)) {
            return "/reg";
        }

        //验证框架
        if (bindingResult.hasErrors()) {
            return "/reg";
        }
        String valid_string = request.getSession(true).getId();
        tbaMemberinfo.setRemark(valid_string);

        tbaMemberinfo.setActivedate(new Date());
        tbaMemberinfo.setRegdate(new Date());
        tbaMemberinfo.setBalance(0.0f);
        tbaMemberinfo.setStatus(false);
        int isSuccess = memberDAO.insert(tbaMemberinfo);
        if (isSuccess > 0) {
            String valid_url = "<a href='http://10.2.25.51:8080/reg/valid?username=" + tbaMemberinfo.getUsername() + "&validString=" + valid_string + "' target='_balnk'>点击我激活账号</a>";
            try {
                email.sendMessage(tbaMemberinfo.getEmail(), "用户激活", valid_url);
            } catch (MessagingException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            request.setAttribute("some_msg", "注册成功，请登录邮箱激活账号！");
            return "/login";
        } else {
            request.setAttribute("some_msg", "注册失败！");
            return "/reg";
        }
    }

    @RequestMapping("/valid")
    public String sendHtmlMail(@ModelAttribute("member") TbaMemberinfo tbaMemberinfo, @RequestParam("validString") String valid_string) {
        TbaMemberinfo validUser = memberDAO.selectByPrimaryKey(tbaMemberinfo.getUsername());//查出要激活的用户
        String old_valid_string = validUser.getRemark();//获取备注
        if (old_valid_string.equals(valid_string)) {
            userInfoDAO.updateUserStatus(validUser.getUsername());
        }
        System.out.println("用户名：" + tbaMemberinfo.getUsername() + "验证码：" + valid_string);
        return "redirect:/index/index";
    }
}
