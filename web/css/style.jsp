<%--
  Created by IntelliJ IDEA.
  User: SC
  Date: 2014/12/24
  Time: 21:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/css; charset=utf-8" pageEncoding="utf-8"%>

/* CSS Document */
ul,ol{list-style-type:none;}
select,input,img,select{vertical-align:middle;}

a{color:#000; text-decoration:none;}
a:hover{color:#c00; text-decoration:underline;}
body{
    padding:0 0 30px 0;
    margin:0;
    font:normal normal 12px/1.6 Verdana, Geneva, sans-serif,"宋体" ;
    background:#ffd06b url(<%=request.getContextPath()%>/images/main_bg.gif) 0 0 repeat-x;
    color:#000;
}
div, h1, h2, h3, h4, p, form, label, input, textarea, img, span{
    margin:0; padding:0;
}

ul{
    margin:0;
    padding:0;
    list-style-type:none;
}
.spacer{
    clear:both;
    font-size:0;
    line-height:0;

}
/*------------------------------------------------main--------------------*/

/*------------------------------------------------top--------------------*/
#box{ width:973px; margin:0 auto; background:#fff;}
#welcome{ text-align:right;}
#top{
    width:949px;
    background:url(<%=request.getContextPath()%>/images/top_bg.gif) 0 0 no-repeat;
    height:60px;
    padding:1px 20px 0px 4px;
}
#top img.logo{
    display:block;
    margin:0 26px 0 0;
    float:left;
}
#top p.topDiv{
    display:block;
    width:1px;
    height:46px;
    background:url(<%=request.getContextPath()%>/images/top_div.gif) 0 0 repeat-y;
    float:left;
    margin-right:20px;
    margin-top:6px;
}
#top p.navLeft{
    background:url(<%=request.getContextPath()%>/images/nav_left.gif) 0 0 no-repeat;
    width:7px;
    height:24px;
    float:left;
    margin:18px 0 0 0;
}
#top ul{
    width:277px;
    height:24px;
    background:url(<%=request.getContextPath()%>/images/nav_bg.gif) 0 0 repeat-x;
    float:left;
    margin:18px 0 0 0;
}
#top ul li{
    float:left;
    border-right:#F8F6B2 solid 1px;
}
#top ul li a{
    display:block;
    padding:4px 12px 0 12px;
    color:#fff;
    background-color:inherit;
    text-decoration:none;

}
#top ul li a:hover{
    background:url(<%=request.getContextPath()%>/images/nav_arrow.gif) center top no-repeat;
    color:#fff;
    background-color:inherit;
}
#top ul li a.hover{
    display:block;
    padding:4px 12px 0 12px;
    background:url(<%=request.getContextPath()%>/images/nav_arrow.gif) center top no-repeat;
    color:#fff;
    background-color:inherit;
    text-decoration:none;

}
#top ul li.chart{
    border:none;
    background:url(<%=request.getContextPath()%>/images/chart.gif) 6px 6px no-repeat;
    padding-left:14px;
}
#top p.navRight{
    background:url(<%=request.getContextPath()%>/images/nav_right.gif) 0 0 no-repeat;
    width:7px;
    height:24px;
    float:left;
    margin:18px 20px 0 0;
}
#top form{
    width:262px;
    height:25px;
    background:url(<%=request.getContextPath()%>/images/serch_icon.gif) 0 0 no-repeat;
    float:right;
    margin:18px 0 0 0;
    padding:0 0 0 36px;
}
#top form input.txtBox{
    width:191px;
    height:19px;
    border-left:#808080 solid 1px;
    border-top:#808080 solid 1px;
    border-right:#D4D0C8 solid 1px;
    border-bottom:#D4D0C8 solid 1px;
    float:left;
    color:#000;
    background-color:#fff;
    padding:0 0 0 11px;
}
#top form input.go{
    background:url(<%=request.getContextPath()%>/images/btn_go.gif) 0 0 no-repeat;
    width:50px;
    height:21px;
    float:right;
    color:#fff;
    background-color:#F7F4A1;

    border:none;
    cursor:pointer;
}
/*------------------------------------------------top--------------------*/
.nav{ height:37px; line-height:37px; margin-top:-2px;}
.nav ul{ background:url(<%=request.getContextPath()%>/images/nav01.jpg) 0 0 repeat-x;height:37px; line-height:37px;}
.nav ul li{ float:left; border-right:#ccc 1px solid; padding-left:12px; padding-right:12px;}
.nav ul li.first{background:url(<%=request.getContextPath()%>/images/border.gif) 0 0 no-repeat;}
.nav ul li.last{ float:right; background:url(<%=request.getContextPath()%>/images/border.gif) right top no-repeat; padding-right:10px; color:#c00; border-right:none;}
.recommend{padding:20px; padding-top:8px; background:url(<%=request.getContextPath()%>/images/what_our_policy.gif) right bottom no-repeat; border:#f8b923 1px solid;}
.recommend h2{color:#fd9531; font-size:16px; border-bottom:#ccc 1px dashed; padding-left:55px; background:url(<%=request.getContextPath()%>/images/top_bgc.gif) 0 0 no-repeat;margin-right:260px;}
.recommend p{ margin-top:6px; color:#ff9a95; font-size:14px; font-weight:bold; line-height:18px; margin-right:260px; text-indent:2em;}
/*------------------------------------------------body--------------------*/
#body{
    width:973px;
    margin:0 auto;
}
/*------------------------------------------------left--------------------*/
#leftMain{
    width:191px;
    float:left;
    margin:0 2px 0 0;
}
#left{
    width:191px;
    background:url(<%=request.getContextPath()%>/images/left_bg.gif) 0 0 repeat-y;
    padding:0;
    margin:0;
}
#left h2{ padding-left:8px; font-size:16px;color:#632a0c;}
#left ul{
    width:175px;
    padding:0 0 0 8px;
}
#left ul li{
    margin:0 0 2px 0;
    display:block;
    height:27px;
    line-height:27px;
    background:url(<%=request.getContextPath()%>/images/left_link_bg.gif) 0 0 repeat-x;
}
#left ul li a{
    display:block;
    background:url(<%=request.getContextPath()%>/images/bullet.gif) 12px 9px no-repeat;
    height:27px;
    line-height:27px;
    color:#000;
    text-decoration:none;
    padding-left:28px;
}
#left ul li a:hover{
    color:#BD1515;
    background-color:inherit;
}

/*------------------------------------------------left--------------------*/

/*------------------------------------------------mid--------------------*/
#mid{
    width:780px;
    float:left;
    padding:0;
}
#mid h2{
    background:url(<%=request.getContextPath()%>/images/mid_tit.gif) 0 0 repeat-x;
    height:23px;
    line-height:23px;
    color:#ac5a02;
    font-size:14px;
    padding:3px;
    padding-left:8px;
    padding-bottom:1px;
}
.hotsale{margin:15px auto; width:728px;}
.hotsale dl{ float:left; display:block; width:162px; margin:0; margin-right:20px; margin-top:15px;}
.hotsale dl dt{width:160px; height:160px; border:#ccc 1px solid;}
.hotsale dl dt img{ display:block;width:160px; height:160px;}
.hotsale dl dd{display:block; margin:0; margin-top:5px;}
.viv1{ width:80px; height:24px; display:block; float:left; background: url(<%=request.getContextPath()%>/images/vivioow_b1.jpg) 0 0 no-repeat; color:#fff; font-weight:bold; text-align:center;}
.viv2{ width:80px; height:24px; display:block; float:left;}

/*------------------------------------------------mid--------------------*/

/*------------------------------------------------body--------------------*/

/*------------------------------------------------footer--------------------*/
#footer{
    width:973px;
    height:75px;
    margin:0 auto;
    position:relative;
    background:#3f3f3f url(<%=request.getContextPath()%>/images/footer_bg.gif) right bottom no-repeat;
}
#footer ul{
    width:555px;
    position:absolute;
    left:20px;
    top:17px;
}
#footer ul li{
    float:left;
    color:#FCFABA;
    background-color:inherit;
}
#footer ul li a{
    padding:0 7px;
    color:#FCFABA;
    background-color:inherit;
    text-decoration:none;
}
#footer ul li a:hover{
    text-decoration:underline;
}
#footer p.copyright{
    position:absolute;
    right:15px;
    top:17px;
    <%--width:;--%>
    color:#fff;
    background-color:inherit;
}
#footer p.design{
    display:block;
    width:197px;
    height:18px;
    padding:0;
    position:absolute;
    left:26px;
    top:38px;
    font-weight:bold;
    color:#FB9E2B;
    background-color:inherit;
}
#footer p.design a.link{
    font-weight:bold;
    color:#FB9E2B;
    background-color:inherit;
    text-decoration:none;
}
#footer p.design a.link:hover{
    color:#fff;
    background-color:inherit;
}
/*------------------------------------------------footer--------------------*/


/*-------------zoom---------------------*/
body{
    text-align: center;
}
img{
    border:0px;
}

span.tozoom{
    float:left;
    width:420px;
    margin:5px;
}

span.tozoom img{
    border: 1px solid #EEEEEE;
}


