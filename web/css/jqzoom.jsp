<%--
  Created by IntelliJ IDEA.
  User: daihui
  Date: 2014-12-31
  Time: 22:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/css; charset=utf-8" pageEncoding="utf-8"%>

.jqzoom {
    border: 1px solid #CCCCCC;
    float: left;
    position: relative;
    padding: 0px;
    cursor: crosshair;
}

/*Download by http://www.jb51.net*/
.jqzoom {
    float: left;
}

div.zoomdiv {
    z-index: 100;
    position: absolute;
    top: 0px;
    left: 0px;
    width: 200px;
    height: 200px;
    background: #ffffff;
    border: 1px solid #CCCCCC;
    display: none;
    text-align: center;
    overflow: hidden;

}

div.jqZoomPup {
    z-index: 10;
    visibility: hidden;
    position: absolute;
    top: 0px;
    left: 0px;
    /*width                   : 50px;

    height                  : 50px;
    */
    border: 1px solid #aaa;
    background: #ffffff url(<%=request.getContextPath()%>/../images/zoomlens.gif) 50% top no-repeat;
    opacity: 0.3;
    -moz-opacity: 0.3;
    -khtml-opacity: 0.3;
    filter: alpha(Opacity=30);
}