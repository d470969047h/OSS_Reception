package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import com.shinowit.framework.dao.UpdateUserInfoDAO;
import com.shinowit.tools.SendHtmlEmail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;

/**
 * Created by daihui on 2015-02-15.
 */
@Controller
@RequestMapping("/password")
public class PasswordController {

    @Resource
    UpdateUserInfoDAO userInfoDAO;

    @Resource
    private TbaMemberinfoMapper memberDAO;

    @Resource
    private SendHtmlEmail email;

    //进入找回密码页面
    @RequestMapping(value = "/getPassword")
    public String getPassword1(@ModelAttribute("member") TbaMemberinfo tbaMemberinfo) {
        return "/getpwd";
    }

    //验证用户名和邮箱是否匹配并发送邮件都邮箱
    @RequestMapping(value = "/getPasswordOver")
    public String getPassword2(@ModelAttribute("member") TbaMemberinfo tbaMemberinfo, HttpServletRequest request) {
        TbaMemberinfo checkUser = new TbaMemberinfo();
        String valid_string = request.getSession(true).getId();//获取session ID
        try {
            checkUser = memberDAO.selectByPrimaryKey(tbaMemberinfo.getUsername());
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ((null != checkUser) && (checkUser.getEmail().equals(tbaMemberinfo.getEmail()))) {
            String valid_url = "<a href='http://127.0.0.1:10086/password/toUpdatePassword?username=" + tbaMemberinfo.getUsername() + "&validString=" + valid_string + "' target='_balnk'>点击此链接修改您的登陆密码</a>";
            boolean isSuccess = false;
            try {
                isSuccess = userInfoDAO.updateUserRemark(tbaMemberinfo.getUsername(), valid_string);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (true == isSuccess) {
                try {
                    email.sendMessage(tbaMemberinfo.getEmail(), "*晖晖在线购物超市*用户修改密码", valid_url);
                } catch (MessagingException e) {
                    e.printStackTrace();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
                return "/getpwdover";
            }

        }
        request.setAttribute("some_msg", "您的用户名或邮箱地址错误，请确认后重新输入！");
        return "/getpwd";
    }

    //跳转到修改密码页面
    @RequestMapping(value = "/toUpdatePassword")
    public String toUpdatePassword(@ModelAttribute("member") TbaMemberinfo tbaMemberinfo,@RequestParam("validString") String valid_string,HttpServletRequest request) {
        TbaMemberinfo validUser = memberDAO.selectByPrimaryKey(tbaMemberinfo.getUsername());//查出要激活的用户
        String old_valid_string = validUser.getRemark();//获取备注
        if (old_valid_string.equals(valid_string)) {
            return "/updatepwd";
        }else{
            request.setAttribute("some_msg","您的链接已经失效，请重新修改密码！");
            return "/login";
        }
    }

    //修改密码
    @RequestMapping(value = "/updatePassword")
    public String udpatePassword(@ModelAttribute("member") TbaMemberinfo tbaMemberinfo,@RequestParam("password") String password, HttpServletRequest request) {

        //判断两次密码是否相同
        if (!tbaMemberinfo.getPwd().equals(password)) {
            request.setAttribute("some_msg","两次密码输入不一致，请重新输入！");
            return "/updatepwd";
        }

        TbaMemberinfo validUser = memberDAO.selectByPrimaryKey(tbaMemberinfo.getUsername());//查出要修改密码的用户
        if (null!=validUser) {
            boolean isSuccess = false;
            try {
                isSuccess = userInfoDAO.updateUserPassword(tbaMemberinfo.getUsername(), tbaMemberinfo.getPwd());
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (true == isSuccess) {
                request.setAttribute("some_msg", "您的密码已经修改成功！！请登陆吧~");
            }
        }
        return "/login";
    }
}
