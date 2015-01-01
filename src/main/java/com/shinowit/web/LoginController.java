package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMemberinfoMapper;
import com.shinowit.entity.TbaMemberinfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by daihui on 2014-12-27.
 */
@Controller
@RequestMapping("/login")
public class LoginController {

    @Resource
    private TbaMemberinfoMapper memberDAO;

    //用户进入登陆页面
    @RequestMapping(value = "/login")
    public String login(@ModelAttribute("member") TbaMemberinfo tbaMemberinfo) {
        return "/login";
    }

    //用户登陆
    @RequestMapping(value = "/userlogin")
    public String userLogin(@ModelAttribute("member") TbaMemberinfo tbaMemberinfo, HttpServletRequest request) {

        TbaMemberinfo currentMember = memberDAO.selectByPrimaryKey(tbaMemberinfo.getUsername());
        if ((null != currentMember) && (currentMember.getPwd().equals(tbaMemberinfo.getPwd()))) {
            if (true == currentMember.getStatus()) {
                request.getSession(true).setAttribute("loginStatus", true);
                return "redirect:/index/index";
            } else {
                request.setAttribute("errMsg", "该用户尚未激活账号，请登录注册邮箱激活账号！");
                return "/login";
            }
        }
        request.setAttribute("errMsg", "您刚才登录的用户不存在，请注册！");
        return "/reg";
    }
}
