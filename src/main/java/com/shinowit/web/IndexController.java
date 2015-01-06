package com.shinowit.web;

import com.shinowit.dao.mapper.TmeMerchandisecinfoMapper;
import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
import com.shinowit.entity.TmeMerchandisecinfo;
import com.shinowit.entity.TmeMerchandisecinfoExample;
import com.shinowit.entity.TmeMerchandiseinfo;
import com.shinowit.entity.TmeMerchandiseinfoExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @Resource
    private TmeMerchandiseinfoMapper merDAO;

    //访问主页时展示的商品分类
    @RequestMapping(value = "/index")
    public ModelAndView index(@RequestParam(value = "ajaxMerInfo", required = false) Integer MerCpageIndex,
                              @RequestParam(value = "merDispageIndex", required = false) Integer merDispageIndex,
                              @ModelAttribute TmeMerchandisecinfo tmemerchandisec) {

        TmeMerchandiseinfoExample exampleMerDisplay = new TmeMerchandiseinfoExample();
        List<TmeMerchandiseinfo> merchandiseinfoDisplayList;
        ModelAndView result = new ModelAndView("index");

        if (null == MerCpageIndex) {
            MerCpageIndex = 1;
        }

        if(null==tmemerchandisec.getMerchandisecid()){
            if (null == merDispageIndex) {
                merDispageIndex = 1;
            }
        }else{
            if(null==merDispageIndex){
                merDispageIndex=1;
            }
            //商品信息展示
            result.addObject("tmemerchandisec", tmemerchandisec);
            exampleMerDisplay.createCriteria().andMerchandisecidEqualTo(tmemerchandisec.getMerchandisecid());
        }


        int record;
        int disRecord;
        int totalPage;
        int merDisTotalPage;

        //商品分类
        TmeMerchandisecinfoExample example = new TmeMerchandisecinfoExample();
        TmeMerchandisecinfoExample example1 = new TmeMerchandisecinfoExample();
        List<TmeMerchandisecinfo> merchandisecinfoList;
        example.setPageIndex(MerCpageIndex);
        example.setPageSize(10);
        example1.createCriteria().andMerchandisecidIsNotNull();



        //商品信息
        TmeMerchandiseinfoExample exampleMer = new TmeMerchandiseinfoExample();
        List<TmeMerchandiseinfo> merchandiseinfoList;
        exampleMer.setPageIndex(1);
        exampleMer.setPageSize(16);

        try {
            //商品分类
            merchandisecinfoList = mercDAO.selectPage(example);//分页查询
            record = mercDAO.countByExample(example1);
            totalPage = record / 10;
            if (totalPage % 10 > 0) {
                totalPage = totalPage + 1;
            }
            result.addObject("mserCInfoList", merchandisecinfoList);
            result.addObject("MerCpageIndex", MerCpageIndex);
            result.addObject("totalPage", totalPage);

            //商品信息展示
            exampleMerDisplay.setPageIndex(merDispageIndex);
            exampleMerDisplay.setPageSize(8);
            merchandiseinfoDisplayList = merDAO.selectPage(exampleMerDisplay);//分页查询
            disRecord = merDAO.countByExample(exampleMerDisplay);
            merDisTotalPage = disRecord / 8;
            if (merDisTotalPage % 8 > 0) {
                merDisTotalPage = merDisTotalPage + 1;
            }
            result.addObject("merInfoDisplayList", merchandiseinfoDisplayList);
            result.addObject("merDispageIndex", merDispageIndex);
            result.addObject("merDisTotalPage", merDisTotalPage);

            //商品信息
            merchandiseinfoList = merDAO.selectPage(exampleMer);//分页查询
            result.addObject("mserInfoList", merchandiseinfoList);


        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
