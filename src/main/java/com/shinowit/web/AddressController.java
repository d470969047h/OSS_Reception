package com.shinowit.web;

import com.shinowit.dao.mapper.CityMapper;
import com.shinowit.dao.mapper.DistrictMapper;
import com.shinowit.dao.mapper.ProvinceMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by daihui on 2014-12-29.
 */
@Controller
@RequestMapping("/address")
public class AddressController {

    @Resource
    private ProvinceMapper provinceDAO;
    @Resource
    private CityMapper cityDAO;
    @Resource
    private DistrictMapper districtDAO;

    //进入配送地址页
    @RequestMapping(value = "/address")
    public ModelAndView merDetailInfo( HttpServletRequest request) {
        ModelAndView reslut = new ModelAndView("chartadderss");

        return reslut;
    }

    @RequestMapping(value = "/provnice")
    @ResponseBody
    public List<Province> selectProvince(){
        ProvinceExample provinceExample=new ProvinceExample();
        provinceExample.createCriteria().andIdIsNotNull();
        List<Province> proList=provinceDAO.selectByExample(provinceExample);
        return proList;
    }

    @RequestMapping(value = "/city")
    @ResponseBody
    public List<City> selectCity(@RequestParam("provinceid") String provinceid){
        CityExample cityExample=new CityExample();
        cityExample.createCriteria().andProvinceidEqualTo(provinceid);
        List<City> cityList=cityDAO.selectByExample(cityExample);
        return cityList;
    }

    @RequestMapping(value = "/area")
    @ResponseBody
    public List<District> selectArea(@RequestParam("cityid") String cityid){
        DistrictExample districtExample=new DistrictExample();
        districtExample.createCriteria().andCityidEqualTo(cityid);
        List<District> districtList=districtDAO.selectByExample(districtExample);
        return districtList;
    }

}
