<%--
  Created by IntelliJ IDEA.
  User: SC
  Date: 2014/12/24
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%String path = request.getContextPath();%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>密码找回</title>
    <%@ include file="/common/commonhead.jsp" %>
    <style>
        .errorClass {
            color: #ff0000;
            font-weight: bold;
        }
    </style>
</head>

<body>
<div id="box">
    <!--top start -->
    <div id="top">
        <a href="index.html"><img src="<%=path%>/images/logo.jpg" alt="Estimation" width="255" height="58" border="0"
                                  class="logo"/></a>

        <p class="topDiv"></p>

        <p class="navLeft"></p>
        <ul>
            <li><a href="<%=path%>/index/index" class="hover">首页</a></li>
            <li><a href="#">关于我们</a></li>
            <li><a href="#">在线客服</a></li>
            <li class="chart"><a href="<%=path%>/trolley/trolley">购物车</a></li>
        </ul>
        <p class="navRight"></p>

        <p class="topDiv"></p>

        <form name="serch" action="#" method="post">
            <input type="text" name="txtbox" value="购物搜索" class="txtBox"/>
            <input type="submit" name="go" value="搜" class="go"/>
        </form>
    </div>
    <!--top end -->
    <!--header start -->
    <div class="nav">
        <ul>
            <li class="first"><a href="#">新品上架</a></li>
            <li><a href="#">坚果炒货</a></li>
            <li><a href="#">补血大枣</a></li>
            <li><a href="#">经典肉类</a></li>
            <li><a href="#">进口零食</a></li>
            <li><a href="#">美味糖果</a></li>
            <li><a href="#">台湾牛轧糖</a></li>
            <%
                if (null==request.getSession(true).getAttribute("userName")){
            %>
            <li class="last">
                <div id="welcome" class="welmsgdiv2">
                    <span>您好，欢迎光临晖晖在线购物。</span>
                    <a href="<%=path%>/login/login">登录</a>
                    <span class="Lloginfg">&nbsp;</span>
                    <a href="<%=path%>/reg/reg">注册</a>
                </div>
            </li>
            <%}else{%>
            <li class="last">
                <div id="welcome" class="welmsgdiv2">
                    <span style="color: red">您好, <%=request.getSession(true).getAttribute("userName")%></span>
                    <span class="Lloginfg">&nbsp;</span>
                    <a href="<%=path%>/login/layout">注销</a>
                </div>
                    <%}%>
        </ul>
    </div>
    <!--header end -->
    <!--guide01 start -->
    <div class="guide01">
        <img src="<%=path%>/images/guide_01.jpg" width="973" height="62" border="0" usemap="#Map"/>
        <map name="Map" id="Map">
            <area shape="rect" coords="398,11,493,51" href="#"/>
            <area shape="rect" coords="540,12,633,51" href="#"/>
            <area shape="rect" coords="684,12,790,53" href="#"/>
            <area shape="rect" coords="830,10,953,54" href="#"/>
        </map>
    </div>
    <!--guide01 end -->
    <!--body start -->
    <div id="body">
        <div id="Login">
            <h1 align="left" style="width:490px;"><span class="h1"><img src="<%=path%>/images/buttonPassword.gif"
                                                                        alt="找回密码"/></span></h1>

            <div class="Emai">
                <div class="dlTitle">
                </div>
                <div class="dlContent">
                    <label class="errorClass"> ${some_msg}</label>
                    <div class="dlContentC">
                        <p class="colSty1"> 请输入您的用户名和注册时使用的Email地址：</p>
                        <form:form action="${ctx}/password/getPasswordOver" method="post" modelAttribute="member">
                        <p class="hideMsg2" id="emailErrMsg"></p>

                        <p class="pSty1B pSty2B"> 请填写您的用户名：
                            <form:input path="username" cssStyle="margin-left: 20px;"></form:input>
                        </p>
                        <p class="pSty1B pSty2B"> 请填写您的Email地址：
                            <form:input path="email"></form:input>
                        </p>
                        <!-- onchange="EmailGetPwd(false);"-->
                          <input type="submit"
                                 style="width:80px;float: left;margin: 20px 0 0 150px; height:25px; border:0;cursor: pointer; background-image: url(<%=path%>/images/button_next.gif)"
                                 value=""/>
                      </form:form>
                        <p class="pSty4">如果该电子邮箱地址不正确，或者您已经忘记注册时填写的邮箱地址，那我们无法帮您找回密码，建议创建一个新帐户。</p>

                        <p class="pSty7 color3" style="margin-top:20px;">如果有任何疑问，请访问晖晖在线购物<a href="#"
                                                                                          target="_blank">帮助中心</a>，或与口口香客服部取得联系。
                        </p>

                        <p class="pSty7">客服邮箱：service@koukouxiang.com</p>

                        <p class="pSty7">客服热线：400-650-7099 (仅收市话费，客服工作时间：8：00-次日凌晨1：00)</p>

                        <p class="pSty7">客服传真：0315-83607020</p>
                    </div>
                </div>
            </div>
        </div>
        <br class="spacer"/>
    </div>
    <!--footer start -->
    <div id="footer">
        <ul>
            <li><a href="#">首页</a>|</li>
            <li><a href="#">关于我们</a>|</li>
            <li><a href="#">新闻资讯</a>|</li>
            <li><a href="#">价单下载</a>|</li>
            <li><a href="#">联系我们</a>|</li>
        </ul>
        <p class="copyright">Copyright 2010 vancl.com All Rights Reserved 冀ICP证xxxxxx号

        </p>
    </div>
    <!--footer end -->
    <!--body end -->
</div>
<!--box-->
</body>
</html>
