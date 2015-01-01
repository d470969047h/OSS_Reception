//package com.shinowit.web;
//
//import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
//import com.shinowit.entity.TmeMerchandisecinfoExample;
//import com.shinowit.entity.TmeMerchandiseinfo;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import java.io.UnsupportedEncodingException;
//import java.sql.Types;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
///**
// * Created by daihui on 2014-12-26.
// */
//@Controller
//@RequestMapping("/index")
//public class AjaxController {
//
//    @Resource
//    private TmeMerchandiseinfoMapper merDAO;
//
//    private JdbcTemplate jt;
//
//    //访问主页时展示的商品分类
//    @ResponseBody
//    public Map<String,Object> list1(@ModelAttribute TmeMerchandiseinfo tmemerchandise, @RequestParam(value = "name", required = false) String name,
//                                    Model model, @RequestParam(value = "page", required = false) Integer page, HttpServletRequest request) {
//
//        Map<String,Object> result_map=new HashMap<String, Object>();
//
//        if (page == null) {
//            page = 0;
//        }
//
//        String sql = "SELECT TOP 8 * FROM ( SELECT ROW_NUMBER() OVER (ORDER BY id) AS RowNumber,* FROM TMe_MerchandiseInfo) A WHERE RowNumber > ?";
//        String sql2 = "select count(*)as totalnum from TMe_MerchandiseInfo where 1=1";
//        List<Map<String, Object>> data_list;
//        int a = 0;
//        if (name != null) {
//            try {
//                byte[] bb = name.getBytes("ISO-8859-1");
//                name = new String(bb, "UTF-8");
//            } catch (UnsupportedEncodingException e) {
//                e.printStackTrace();
//            }
//            sql += " and UnitID=?";
//            sql2 += " and UnitID=?";
//            model.addAttribute("totalnum", a);
//            TmeMerchandisecinfoExample ex = new TmeMerchandisecinfoExample();
//            ex.createCriteria().andMerchandisecnameEqualTo(name);
//            String s = merchandisecdao.selectByExample(ex).get(0).getMerchandisecid();
//            data_list = jt.queryForList(sql, new Object[]{page, s}, new int[]{Types.INTEGER, Types.VARCHAR});
//
//            result_map.put("data_list",data_list);
//
//            a = jt.queryForInt(sql2, new Object[]{s}, new int[]{Types.INTEGER});
//
//            result_map.put("num",a);
//            return result_map;
//        }
//        a = jt.queryForInt(sql2);
//        data_list = jt.queryForList(sql, new Object[]{1}, new int[]{Types.INTEGER});
//        result_map.put("data_list", data_list);
//        result_map.put("num",a);
//        return result_map;
//
//
//}
