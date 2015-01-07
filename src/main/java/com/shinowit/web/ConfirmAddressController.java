package com.shinowit.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by daihui on 2014-12-29.
 */
@Controller
@RequestMapping("/address")
public class ConfirmAddressController {


    //进入配送地址页
    @RequestMapping(value = "/conAddress")
    public ModelAndView merDetailInfo(@RequestParam(value = "merDeatilID", required = false) String merDeatilID, HttpServletRequest request) {
        ModelAndView reslut = new ModelAndView("chartinfo");

        return reslut;
    }
}
