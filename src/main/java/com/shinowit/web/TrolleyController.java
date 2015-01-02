package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.dao.mapper.TmeStockinfoMapper;
import com.shinowit.dao.mapper.TmeUnitinfoMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by daihui on 2014-12-29.
 */
@Controller
@RequestMapping("/trolley")
public class TrolleyController {

    @Resource
    private TmeMerchandiseinfoMapper merInfoDAO;

    @Resource
    private TmeStockinfoMapper stockInfoDAO;

    @Resource
    private TmeUnitinfoMapper unitDAO;

    @RequestMapping(value = "/trolley")
    public ModelAndView merDetailInfo(@RequestParam(value = "merDeatilID",required = false) String  merDeatilID){
        ModelAndView result=new ModelAndView("chart");

        return result;
    }


}
