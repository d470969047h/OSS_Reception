package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.dao.mapper.TmeStockinfoMapper;
import com.shinowit.dao.mapper.TmeUnitinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

/**
 * Created by daihui on 2014-12-29.
 */
@Controller
@RequestMapping("/innerpage")
public class InnerpageController {

    @Resource
    private TmeMerchandiseinfoMapper merInfoDAO;

    @Resource
    private TmeStockinfoMapper stockInfoDAO;

    @Resource
    private TmeUnitinfoMapper unitDAO;

    @RequestMapping(value = "/merDetail")
    public ModelAndView merDetailInfo(@RequestParam(value = "merDeatilID") String  merDeatilID){
        ModelAndView result=new ModelAndView("innerpage");

        //查询商品信息
        TmeMerchandiseinfo merInfo=merInfoDAO.selectByPrimaryKey(merDeatilID);

        TmeUnitinfo unitInfo=unitDAO.selectByPrimaryKey(merInfo.getUnitid());
//        TmeStockinfoExample example=new TmeStockinfoExample();
//        example.createCriteria().andMerchandiseidEqualTo(merInfo.getMerchandiseid());

        //查询商品库存信息
        TmeStockinfo merStockInfo=stockInfoDAO.selectByPrimaryKey(merInfo.getId());
        result.addObject("merInfo",merInfo);
        result.addObject("unitInfo",unitInfo);
        result.addObject("merStockInfo",merStockInfo);
        return result;
    }


}
