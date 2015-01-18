package com.shinowit.web;

import com.shinowit.dao.mapper.CityMapper;
import com.shinowit.dao.mapper.DistrictMapper;
import com.shinowit.dao.mapper.ProvinceMapper;
import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.entity.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    @Resource
    private TbaMembeaddrinfoMapper membeaddrinfoDAO;


    //进入配送地址页
    @RequestMapping(value = "/address")
    public ModelAndView merDetailInfo(HttpServletRequest request) {
        ModelAndView reslut = new ModelAndView("chartadderss");
        String currentUser = (String) request.getSession(true).getAttribute("userName");

        TbaMembeaddrinfoExample membeaddrinfoExample = new TbaMembeaddrinfoExample();
        membeaddrinfoExample.createCriteria().andUsernameEqualTo(currentUser);
        List<TbaMembeaddrinfo> membeaddrinfoList = null;
        try {
            membeaddrinfoList = membeaddrinfoDAO.selectByExample(membeaddrinfoExample);
        } catch (Exception e) {
            e.printStackTrace();
        }
        reslut.addObject("memberAddrList", membeaddrinfoList);
        return reslut;
    }

    /**
     * **********Start：省 市 区*****************
     */
    @RequestMapping(value = "/provnice")
    @ResponseBody
    public List<Province> selectProvince() {
        ProvinceExample provinceExample = new ProvinceExample();
        provinceExample.createCriteria().andIdIsNotNull();
        List<Province> proList = provinceDAO.selectByExample(provinceExample);
        return proList;
    }

    @RequestMapping(value = "/city")
    @ResponseBody
    public List<City> selectCity(@RequestParam("provinceid") String provinceid) {
        CityExample cityExample = new CityExample();
        cityExample.createCriteria().andProvinceidEqualTo(provinceid);
        List<City> cityList = cityDAO.selectByExample(cityExample);
        return cityList;
    }

    @RequestMapping(value = "/area")
    @ResponseBody
    public List<District> selectArea(@RequestParam("cityid") String cityid) {
        DistrictExample districtExample = new DistrictExample();
        districtExample.createCriteria().andCityidEqualTo(cityid);
        List<District> districtList = districtDAO.selectByExample(districtExample);
        return districtList;
    }

    /**
     * **********End：省 市 区*****************
     */

    //修改默认地址
    @RequestMapping(value = "/updateDefaultAddr/{id}")
    public String updateTolleyItem(@PathVariable("id") Integer id, HttpServletRequest request, RedirectAttributes redirectAttributes) {
        String currentUser = (String) request.getSession(true).getAttribute("userName");

        TbaMembeaddrinfoExample membeaddrinfoExample = new TbaMembeaddrinfoExample();
        // membeaddrinfoExample.createCriteria().andIdEqualTo(id);
        membeaddrinfoExample.createCriteria().andIsdefaultEqualTo(true);
        List<TbaMembeaddrinfo> membeaddrinfoList = null;
        try {
            membeaddrinfoList = membeaddrinfoDAO.selectByExample(membeaddrinfoExample);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (membeaddrinfoList.size() > 0) {
            Integer isUpdate = 0;
            for (TbaMembeaddrinfo detail : membeaddrinfoList) {
                detail.setIsdefault(false);
                try {
                    isUpdate = membeaddrinfoDAO.updateByPrimaryKey(detail);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                if (isUpdate > 0) {
                    TbaMembeaddrinfo defaultAddr = membeaddrinfoDAO.selectByPrimaryKey(id);
                    Integer isUpdateDefault = 0;
                    defaultAddr.setIsdefault(true);
                    try {

                        isUpdateDefault = membeaddrinfoDAO.updateByPrimaryKey(defaultAddr);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (isUpdateDefault > 0) {
                        redirectAttributes.addFlashAttribute("someMsg", "亲！您的宝贝已经被你修改成功了哦！");
                        return "redirect:/address/address";
                    }
                }
            }
        }
        return "redirect:/address/address";
    }

}
