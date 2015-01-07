package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by daihui on 2014-12-29.
 */
@Controller
@RequestMapping("/address")
public class AddressController {


    //进入配送地址页
    @RequestMapping(value = "/address")
    public ModelAndView merDetailInfo( HttpServletRequest request) {
        ModelAndView reslut = new ModelAndView("chartadderss");

        return reslut;
    }
}
