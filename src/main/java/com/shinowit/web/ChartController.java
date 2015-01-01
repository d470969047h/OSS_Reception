package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.dao.mapper.TmeStockinfoMapper;
import com.shinowit.dao.mapper.TmeUnitinfoMapper;
import com.shinowit.entity.TmeMerchandiseinfo;
import com.shinowit.entity.TmeStockinfo;
import com.shinowit.entity.TmeUnitinfo;
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
public class ChartController {

    @Resource
    private TmeMerchandiseinfoMapper merInfoDAO;

    @Resource
    private TmeStockinfoMapper stockInfoDAO;

    @Resource
    private TmeUnitinfoMapper unitDAO;

    @RequestMapping(value = "/trolley")
    public ModelAndView merDetailInfo(@RequestParam(value = "merDeatilID") String  merDeatilID){
        ModelAndView result=new ModelAndView("trolley");


        return result;
    }


}
