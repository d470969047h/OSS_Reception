<%--
  Created by IntelliJ IDEA.
  User: daihui
  Date: 2014-12-30
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/css; charset=utf-8" pageEncoding="utf-8"%>

/*------------------------------------------------mid--------------------*/
.jPaginate {
    height: 34px;
    position: relative;
    color: #a5a5a5;
    font-size: small;
    width: 100%;
}

.jPaginate a {
    line-height: 15px;
    height: 18px;
    cursor: pointer;
    padding: 2px 5px;
    margin: 2px;
    float: left;
}

.jPag-control-back {
    position: absolute;
    left: 0px;
}

.jPag-control-front {
    position: absolute;
    top: 0px;
}

.jPaginate span {
    cursor: pointer;
}

ul.jPag-pages {
    float: left;
    height: 29px;
    list-style-type: none;
    margin: 0px 0px 0px 0px;
    padding: 0px;
}

ul.jPag-pages li {
    display: inline;
    float: left;
    padding: 0px;
    margin: 0px;
}

ul.jPag-pages li a {
    float: left;
    padding: 2px 5px;
}

span.jPag-current {
    cursor: default;
    font-weight: normal;
    line-height: 15px;
    height: 18px;
    padding: 2px 5px;
    margin: 2px;
    float: left;
}

ul.jPag-pages li span.jPag-previous,
ul.jPag-pages li span.jPag-next,
span.jPag-sprevious,
span.jPag-snext,
ul.jPag-pages li span.jPag-previous-img,
ul.jPag-pages li span.jPag-next-img,
span.jPag-sprevious-img,
span.jPag-snext-img {
    height: 22px;
    margin: 2px;
    float: left;
    line-height: 18px;
}

ul.jPag-pages li span.jPag-previous,
ul.jPag-pages li span.jPag-previous-img {
    margin: 2px 0px 2px 2px;
    font-size: 12px;
    font-weight: bold;
    width: 10px;

}

ul.jPag-pages li span.jPag-next,
ul.jPag-pages li span.jPag-next-img {
    margin: 2px 2px 2px 0px;
    font-size: 12px;
    font-weight: bold;
    width: 10px;
}

span.jPag-sprevious,
span.jPag-sprevious-img {
    margin: 2px 0px 2px 2px;
    font-size: 18px;
    width: 15px;
    text-align: right;
}

span.jPag-snext,
span.jPag-snext-img {
    margin: 2px 2px 2px 0px;
    font-size: 18px;
    width: 15px;
    text-align: right;
}

ul.jPag-pages li span.jPag-previous-img {
    background: transparent url(<%=request.getContextPath()%>/../images/previous.png) no-repeat center right;
}

ul.jPag-pages li span.jPag-next-img {
    background: transparent url(<%=request.getContextPath()%>/../images/next.png) no-repeat center left;
}

span.jPag-sprevious-img {
    background: transparent url(<%=request.getContextPath()%>/../images/sprevious.png) no-repeat center right;
}

span.jPag-snext-img {
    background: transparent url(<%=request.getContextPath()%>/../images/snext.png) no-repeat center left;
}

.demo {
    width: 580px;
    padding: 10px;
    margin: 10px auto;
    border: 1px solid #fff;
    background-color: #f7f7f7;
}

/*create by daihui on 2015.2.15*/
/*滚动广告样式*/
.content_right .ad {
    margin-bottom:10px;
    width:780px;
    height:274px;
    overflow:hidden;
    position:relative;
}
.content_right .slider,.content_right .num{
    position:absolute;
}
.content_right .slider li{
    list-style:none;
    display:inline;
}
.content_right .slider img{
    width:780px;
    height:274px;
    display:block;
}
.content_right .num{
    right:5px;
    bottom:5px;
}
.content_right .num li{
    float: left;
    color: #FF7300;
    text-align: center;
    line-height: 16px;
    width: 16px;
    height: 16px;
    font-family: Arial;
    font-size: 12px;
    cursor: pointer;
    overflow: hidden;
    margin: 3px 1px;
    border: 1px solid #FF7300;
    background-color: #fff;
}
.content_right .num li.on{
    color: #fff;
    line-height: 21px;
    width: 21px;
    height: 21px;
    font-size: 16px;
    margin: 0 1px;
    border: 0;
    background-color: #FF7300;
    font-weight: bold;
}

