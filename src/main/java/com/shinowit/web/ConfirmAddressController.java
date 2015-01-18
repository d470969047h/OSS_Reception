package com.shinowit.web;

import com.shinowit.dao.mapper.TbaMembeaddrinfoMapper;
import com.shinowit.entity.TbaMembeaddrinfo;
import com.shinowit.entity.TbaMembeaddrinfoExample;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by daihui on 2014-12-29.
 */
@Controller
@RequestMapping("/address")
public class ConfirmAddressController {

    @Resource
    private TbaMembeaddrinfoMapper membeaddrinfoDAO;

    //进入配送地址页
    @RequestMapping(value = "/conAddress")
    public ModelAndView merDetailInfo(@RequestParam(value = "merDeatilID", required = false) String merDeatilID, HttpServletRequest request) {
        ModelAndView reslut = new ModelAndView("chartinfo");

//        String currentUser = (String) request.getSession(true).getAttribute("userName");

        TbaMembeaddrinfoExample membeaddrinfoExample = new TbaMembeaddrinfoExample();
        membeaddrinfoExample.createCriteria().andIsdefaultEqualTo(true);
//        membeaddrinfoExample.createCriteria().andUsernameEqualTo(currentUser);
        List<TbaMembeaddrinfo> membeaddrinfoList = null;
        try {
            membeaddrinfoList = membeaddrinfoDAO.selectByExample(membeaddrinfoExample);
        } catch (Exception e) {
            e.printStackTrace();
        }
        reslut.addObject("memberAddrList", membeaddrinfoList);
        return reslut;
    }
}
