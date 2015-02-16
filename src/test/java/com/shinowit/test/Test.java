//package com.shinowit.test;
//
//import com.shinowit.dao.mapper.TmeMerchandiseinfoMapper;
//import com.shinowit.entity.TmeMerchandiseinfo;
//import com.shinowit.entity.TmeMerchandiseinfoExample;
//import com.shinowit.tools.LuceneTest;
//import org.apache.log4j.Logger;
//import org.junit.runner.RunWith;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import javax.annotation.Resource;
//import java.util.List;
//
///**
// * Created by daihui on 2014-12-28.
// */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:application-context.xml"})
//public class Test extends AbstractJUnit4SpringContextTests {
//
//    protected final Logger logger = Logger.getLogger(getClass());
//    @Resource
//    public TmeMerchandiseinfoMapper merchandiseinfoDAO;
//
//    @org.junit.Test
//    public void myCreateIndex() throws Exception{
//        TmeMerchandiseinfoExample merchandiseinfoExample=new TmeMerchandiseinfoExample();
//        LuceneTest luceneTest =new LuceneTest();
//
//        merchandiseinfoExample.createCriteria().andMerchandiseidIsNotNull();
//        List<TmeMerchandiseinfo> merchandiseinfoList=merchandiseinfoDAO.selectByExample(merchandiseinfoExample);
//    //  luceneTest.createIndex(merchandiseinfoList);
//       luceneTest.query(10000,1, "玉枣");
//
//    }
//}
