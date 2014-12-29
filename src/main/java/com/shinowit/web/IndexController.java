package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.entity.TmeMerchandisecinfo;
import com.shinowit.entity.TmeMerchandisecinfoExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by daihui on 2014-12-26.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @Resource
    private TmeMerchandisecinfoMapper mercDAO;

    //访问主页
    @RequestMapping(value = "/index")
    public ModelAndView index() {
        ModelAndView result = new ModelAndView("/index");
        TmeMerchandisecinfoExample example = new TmeMerchandisecinfoExample();
        TmeMerchandisecinfoExample example1 = new TmeMerchandisecinfoExample();
        List<TmeMerchandisecinfo> merchandisecinfoListList;
        int record;
        int totalPage;
        example.setPageIndex(1);
        example.setPageSize(10);
        try {
            merchandisecinfoListList = mercDAO.selectPage(example);//分页查询
             record = mercDAO.countByExample(example1);
             totalPage = record / 10;
            if (totalPage % 10 > 0) {
                totalPage = totalPage + 1;
            }
            result.addObject("mserCInfoList", merchandisecinfoListList);
            result.addObject("pageIndex", example.getPageIndex());
            result.addObject("totalPage", totalPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    @RequestMapping(value = "/queryMerC")
    public ModelAndView queryMerCInfo(@ModelAttribute("pageIndex") Integer pageIndex) {
        ModelAndView result = new ModelAndView("/index");
        TmeMerchandisecinfoExample example = new TmeMerchandisecinfoExample();
        TmeMerchandisecinfoExample example1 = new TmeMerchandisecinfoExample();
        List<TmeMerchandisecinfo> merchandisecinfoListList;
        int record;
        int totalPage;
        example.setPageIndex(pageIndex);
        example.setPageSize(10);
        try {
            merchandisecinfoListList = mercDAO.selectPage(example);//分页查询
            record = mercDAO.countByExample(example1);
            totalPage = record / 10;
            if (totalPage % 10 > 0) {
                totalPage = totalPage + 1;
            }
            result.addObject("mserCInfoList", merchandisecinfoListList);
            result.addObject("pageIndex", example.getPageIndex());
            result.addObject("totalPage", totalPage);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


}
