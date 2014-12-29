package com.shinowit.test;

import org.apache.log4j.Logger;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Created by daihui on 2014-12-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:application-context.xml"})
public class Test extends AbstractJUnit4SpringContextTests {

    protected final Logger logger=Logger.getLogger(getClass());


    public class LoginInterceptor implements HandlerInterceptor {

        @Override
        public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
            String uri = httpServletRequest.getRequestURI();
            if (uri.endsWith("/login") || (uri.endsWith("/html/login.html"))) {
                //处理登陆操作的url,放行
                return true;
            }

            HttpSession session = httpServletRequest.getSession();
            if ((null == session) || (null == session.getAttribute("current_user"))) {
                //用户未登录
                httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/html/login.html");
                return false;
            } else {
                return true;//放行
            }
        }

        @Override
        public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

        }

        @Override
        public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

        }
    }


}
