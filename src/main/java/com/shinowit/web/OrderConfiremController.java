package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by daihui on 2014-12-29.
 */
@Controller
@RequestMapping("/order")
public class OrderConfiremController {


    //进入配送地址页
    @RequestMapping(value = "/order")
    public ModelAndView orderSubmit(HttpServletRequest request) {
        ModelAndView reslut = new ModelAndView("chartorder");

        return reslut;
    }


    //进入订单最后一页
    @RequestMapping(value = "/orderOver")
    public ModelAndView orderEnd(HttpServletRequest request) {
        ModelAndView reslut = new ModelAndView("chartover");

        return reslut;
    }
}
