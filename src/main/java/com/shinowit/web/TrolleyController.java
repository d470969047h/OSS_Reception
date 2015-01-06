package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.dao.mapper.TmeTrolleyMapper;
import com.shinowit.dao.mapper.TmeTrolleyitemMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by daihui on 2014-12-29.
 */
@Controller
@RequestMapping("/trolley")
public class TrolleyController {

//    @Resource
//    private TmeStockinfoMapper stockInfoDAO;

    @Resource
    private TmeMerchandiseinfoMapper merInfoDAO;

    @Resource
    private TmeTrolleyMapper trolleyDAO;

    @Resource
    private TmeTrolleyitemMapper trolleyitemDAO;

    //打开购物车
    @RequestMapping(value = "/trolley")
    public ModelAndView merDetailInfo(@RequestParam(value = "merDeatilID", required = false) String merDeatilID, HttpServletRequest request) {
        ModelAndView result = new ModelAndView("chart");
        HttpSession session = request.getSession(true);
        String userName = (String) session.getAttribute("userName");//获取当前用户的用户名

        List<TmeTrolley> currentTrolley = null;//当前购物车
        List<TmeTrolleyitem> trolleyitemList = null;//购物明细list

        TmeTrolleyExample trolleyExample = new TmeTrolleyExample();//购物车条件
        trolleyExample.createCriteria().andTrolleystateNotEqualTo(false);//未结算完的购物车
        trolleyExample.createCriteria().andUsernameEqualTo(userName);//当前用户的购物车

        try {
            currentTrolley = trolleyDAO.selectByExample(trolleyExample);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (currentTrolley.size() > 0) {
            Integer currentTrolleyID = 0;//当前购物车id
            for (TmeTrolley trolleyDetail : currentTrolley) {
                currentTrolleyID = trolleyDetail.getTrolleyid();
            }
            TmeTrolleyitemExample trolleyitemExample = new TmeTrolleyitemExample();//明细条件
            trolleyitemExample.createCriteria().andIsbuyEqualTo(false);//未付款的商品
            trolleyitemExample.createCriteria().andTrolleyidEqualTo(currentTrolleyID);//当前未成交的购物车
            trolleyitemList = trolleyitemDAO.selectByExample(trolleyitemExample);//查询以上条件的商品
            float totalMoney=0;//总金额
            Integer count=0;
            for(TmeTrolleyitem detail:trolleyitemList){
                totalMoney=totalMoney+detail.getSubtotal();
            }
            result.addObject("trolleyitemList", trolleyitemList);
            result.addObject("totalMoney", totalMoney);
            result.addObject("count", trolleyitemList.size());
        }

        return result;
    }

    //添加到购物车
    @RequestMapping(value = "/addToTrolley")
    public String merInfoAdd(@ModelAttribute("merInfo") TmeMerchandiseinfo merInfo, HttpServletRequest request, @RequestParam(value = "num") Integer num
            , RedirectAttributes redirectAttributes) {
        HttpSession session = request.getSession(true);
        TmeTrolley trolley = new TmeTrolley();
        TmeTrolleyitem trolleyitem = new TmeTrolleyitem();
        String userName = (String) session.getAttribute("userName");//获取当前用户的用户名

        //查询该ID对应商品
        TmeMerchandiseinfo merchandiseinfo = merInfoDAO.selectByPrimaryKey(merInfo.getMerchandiseid());

        TmeTrolleyExample example = new TmeTrolleyExample();//找还没完成购物的购物车
        List<TmeTrolley> EmptyTrolley = null;
        example.createCriteria().andTrolleystateEqualTo(false);
        example.createCriteria().andUsernameEqualTo(userName);

        List<TmeTrolleyitem> trolleyitemList = null;//购物车对应的明细
        TmeTrolleyitemExample itemExample = new TmeTrolleyitemExample();//购物车明细

        try {
            EmptyTrolley = trolleyDAO.selectByExample(example);//未成交的购物车
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (EmptyTrolley.size() > 0) {
            try {
                Integer trolleyID = 0;
                for (TmeTrolley detail : EmptyTrolley) {
                    trolleyID = detail.getTrolleyid();//空购物车的ID

                }
                itemExample.createCriteria().andTrolleyidEqualTo(trolleyID);//该商品对应的购物车
                itemExample.createCriteria().andMerchandisenameEqualTo(merchandiseinfo.getMerchandisename());
                trolleyitemList = trolleyitemDAO.selectByExample(itemExample);//购物车内的商品,查找该商品名称的商品作Update操作，否则作insert操作
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (trolleyitemList.size() > 0) {
                for (TmeTrolleyitem updateDetail : trolleyitemList) {
                    if (updateDetail.getMerchandisename().equals(merchandiseinfo.getMerchandisename())) {//找到该商品
                        Integer merNum = updateDetail.getNum();
                        merNum = merNum + num;
                        updateDetail.setNum(merNum);//更改后的商品数量
                        //单价
                        Float merPrice = updateDetail.getUnitprice();
                        //小计
                        Float subTotal = merNum * merPrice;
                        updateDetail.setSubtotal(subTotal);

                        Integer isSuccess = 0;
                        try {
                            isSuccess = trolleyitemDAO.updateByPrimaryKey(updateDetail);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (isSuccess > 0) {
                            redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你添加到购物车了哦！");
                            return "redirect:/innerpage/merDetail?merDeatilID=" + merInfo.getMerchandiseid();
                        } else {
                            redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你添加到购物车了哦！");
                            return "redirect:/innerpage/merDetail?merDeatilID=" + merInfo.getMerchandiseid();
                        }
                    }
                }
                for (TmeTrolley detail : EmptyTrolley) {
                    Integer trolleyID = detail.getTrolleyid();
                    //添加商品到购物车
                    trolleyitem.setTrolleyid(trolleyID);
                    trolleyitem.setMerchandisename(merchandiseinfo.getMerchandisename());
                    trolleyitem.setPicpath(merchandiseinfo.getPicpath());
                    trolleyitem.setNum(num);
                    trolleyitem.setIsbuy(false);
                    //单价
                    Float merPrice = merchandiseinfo.getPrice();
                    trolleyitem.setUnitprice(merPrice);
                    //小计
                    Float subTotal = num * merPrice;
                    trolleyitem.setSubtotal(subTotal);
                    Integer i = 0;
                    try {

                        i = trolleyitemDAO.insert(trolleyitem);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (i > 0) {
                        redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你添加到购物车了哦！");
                        return "redirect:/innerpage/merDetail?merDeatilID=" + merInfo.getMerchandiseid();
                    } else {
                        redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你添加到购物车了哦！");
                        return "redirect:/innerpage/merDetail?merDeatilID=" + merInfo.getMerchandiseid();
                    }
                }
            }
        } else {
            //创建一个空购物车，默认还没提交购买
            trolley.setUsername(userName);
            trolley.setCreatedate(new Date());
            trolley.setTrolleystate(false);
            Integer isSuccess = 0;
            try {
                isSuccess = trolleyDAO.insert(trolley);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (isSuccess > 0) {
                example.createCriteria().andTrolleystateEqualTo(false);
                example.createCriteria().andUsernameEqualTo(userName);
                try {
                    EmptyTrolley = trolleyDAO.selectByExample(example);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (EmptyTrolley.size() > 0) {
                    for (TmeTrolley detail : EmptyTrolley) {
                        Integer trolleyID = detail.getTrolleyid();
                        //添加商品到购物车
                        trolleyitem.setTrolleyid(trolleyID);
                        trolleyitem.setMerchandisename(merchandiseinfo.getMerchandisename());
                        trolleyitem.setPicpath(merchandiseinfo.getPicpath());
                        trolleyitem.setNum(num);
                        trolleyitem.setIsbuy(false);
                        //单价
                        Float merPrice = merchandiseinfo.getPrice();
                        trolleyitem.setUnitprice(merPrice);
                        //小计
                        Float subTotal = num * merPrice;
                        trolleyitem.setSubtotal(subTotal);
                        Integer i = 0;
                        try {
                            i = trolleyitemDAO.insert(trolleyitem);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        if (i > 0) {
                            redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你添加到购物车了哦！");
                            return "redirect:/innerpage/merDetail?merDeatilID=" + merInfo.getMerchandiseid();
                        } else {
                            redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你添加到购物车了哦！");
                            return "redirect:/innerpage/merDetail?merDeatilID=" + merInfo.getMerchandiseid();
                        }
                    }
                }
            }
        }
        return "redirect:/innerpage/merDetail?merDeatilID=" + merInfo.getMerchandiseid();
    }


    //修改购物车商品数量
    @RequestMapping(value = "/updateTolleyItem/{num}/{trolleyitemid}")
    public String updateTolleyItem(@PathVariable("num") Integer num,@PathVariable("trolleyitemid") Integer trolleyitemid, RedirectAttributes redirectAttributes) {

            TmeTrolleyitem trolleyitem=trolleyitemDAO.selectByPrimaryKey(trolleyitemid);

        trolleyitem.setNum(num);//更改后的商品数量
        //单价
        Float merPrice = trolleyitem.getUnitprice();
        //小计
        Float subTotal = num * merPrice;
        trolleyitem.setSubtotal(subTotal);

        Integer isSuccess = 0;
        try {
            isSuccess = trolleyitemDAO.updateByPrimaryKey(trolleyitem);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (isSuccess > 0) {
            redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你修改成功了哦！");
            return "redirect:/trolley/trolley";
        } else {
            redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝数量修改失败啦！");
            return "redirect:/trolley/trolley" ;
        }
    }


    //删除购物车商品
    @RequestMapping(value = "/deleteTolleyItem/{trolleyitemid}")
    public String deleteTolleyItem(@PathVariable("trolleyitemid") Integer trolleyitemid, RedirectAttributes redirectAttributes) {

        Integer isSuccess = 0;
        TmeTrolleyitem trolleyitem=null;
        try {
             trolleyitem=trolleyitemDAO.selectByPrimaryKey(trolleyitemid);
        }catch (Exception e){
            e.printStackTrace();
        }

        try {
            isSuccess = trolleyitemDAO.deleteByPrimaryKey(trolleyitemid);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (isSuccess > 0) {
            TmeTrolleyitemExample trolleyitemExample=new TmeTrolleyitemExample();
            trolleyitemExample.createCriteria().andTrolleyidEqualTo(trolleyitem.getTrolleyid());
            List<TmeTrolleyitem> trolleyitemList=null;
            try {
                trolleyitemList=trolleyitemDAO.selectByExample(trolleyitemExample);
            }catch (Exception e){
                e.printStackTrace();
            }
            if(trolleyitemList.size()>0){
                redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你删除了哦！");
                return "redirect:/trolley/trolley";
            }else {
                Integer i=0;
                try {
                    i=trolleyDAO.deleteByPrimaryKey(trolleyitem.getTrolleyid());
                }catch (Exception e){
                    e.printStackTrace();
                }
                if(i>0){
                    redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你删除了哦！");
                    return "redirect:/trolley/trolley" ;
                }
            }
        }
        redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你删除了哦！");
        return "redirect:/trolley/trolley" ;
    }
}
