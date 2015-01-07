<%--
  Created by IntelliJ IDEA.
  User: SC
  Date: 2014/12/24
  Time: 20:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%String path = request.getContextPath();%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>收货地址管理</title>
    <%@ include file="/common/commonhead.jsp" %>
    <script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="<%=path%>/js/liandong.js"></script>
    <script type="text/javascript">
        var _path='${ctx}'
    </script>
</head>

<body>
<div id="box">
<!--top start -->
<div id="top">
    <a href="index.html"><img src="<%=path%>/images/logo.gif" alt="Estimation" width="255" height="58" border="0"
                              class="logo"/></a>

    <p class="topDiv"></p>

    <p class="navLeft"></p>
    <ul>
        <li><a href="index.html" class="hover">首页</a></li>
        <li><a href="#">关于我们</a></li>
        <li><a href="#">在线客服</a></li>
        <li class="chart"><a href="chart.html">购物车</a></li>
    </ul>
    <p class="navRight"></p>

    <p class="topDiv"></p>

    <form name="serch" action="#" method="post">
        <input type="text" name="txtbox" value="购物搜索" class="txtBox"/>
        <input type="submit" name="go" value="搜" class="go"/>
    </form>
</div>
<!--top end -->
<div class="nav">
    <ul>
        <li class="first"><a href="#">新品上架</a></li>
        <li><a href="#">坚果炒货</a></li>
        <li><a href="#">补血大枣</a></li>
        <li><a href="#">经典肉类</a></li>
        <li><a href="#">进口零食</a></li>
        <li><a href="#">美味糖果</a></li>
        <li><a href="#">天然干果</a></li>
        <li><a href="#">蒙古奶酪</a></li>
        <li><a href="#">台湾牛轧糖</a></li>
        <li><a href="#">蜜饯果脯</a></li>
        <li class="last">
            <div id="welcome" class="welmsgdiv2"><span>您好，欢迎光临果果香。</span><a href="login.html">登录</a><span
                    class="Lloginfg">&nbsp;</span><a href="reg.html">注册</a></div>
        </li>
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
<DIV id="gwc">
<div id="step_" align="left">结算步骤: <span class="" id="shoppingstep_0">1.登录注册</span> &gt;&gt; <span
        class="shoppingstepcontrol" id="shoppingstep_2">2.填写核对订单信息</span> &gt;&gt; <span class=""
                                                                                         id="shoppingstep_3">3.提交订单</span>
</div>
<div id="onEdit"></div>
<DIV class="title"><SPAN id="transferSpan"></SPAN></DIV>
<DIV id="divPointError" style="DISPLAY: none; FLOAT: left; MARGIN: 0px 0px 10px">
    <DIV class="pointErrorMsg">您目前的积分为：<SPAN id="myPointNumber">0</SPAN>分，本次购物需支付：<SPAN
            id="needPointNumber">0</SPAN>分，请修改购物车中的积分换购产品。
    </DIV>
    <IMG id="imgPointError"
         src="<%=path%>/images/jifenbuzhu.gif" useMap=#Map border=0>
    <MAP id="Map"
         name=Map>
        <AREA shape=RECT coords=962,9,972,19
              href="javascript:ClosePointError();">
    </MAP>
</DIV>
<DIV id=OffProductList></DIV>
<TABLE cellSpacing=0 cellPadding=0 width=100% border=0>
    <TBODY>
    <TR>
        <TD vAlign=center align=left><SPAN
                id="TenPayNotice"></SPAN></TD>
    </TR>
    </TBODY>
</TABLE>
<div id="AddressContent">
    <!--begin-->
  <span id="Label_AddressList">
    <div class="bxSty4">
        <table width="100%" cellpadding="0" cellspacing="0" class="addDivTab tabSty01">
            <tbody>
            <tr class="addbgcolor trSty01">
                <td class="reusableColor5 xxSty01" align="left" height="30">
                    &nbsp;&nbsp;&nbsp;&nbsp;<strong>地址簿 </strong>（您以前用过的地址）
                </td>
            </tr>
            <tr>
                <td align="left" valign="top" height="145">
                    <div class="changeAdd" align="center">
                        <ul class="ulSty">
                            <li>收 货 人：刘德华<br/>
                                地　　区：河北生唐山市火车站<br/>
                                收货地址:河北生唐山市火车站<br/>
                                邮政编码：063000<br/>
                                固定电话：<br/>
                                移动电话：138********<br/>
                                <span class="addDeleteSty addFontCol"><a href="#"><span class="addFontCol">修改</span></a><span
                                        class="addFontCol">　|</span>　<a href="#"><span class="addFontCol">删除</span></a></span><span
                                        class="addSpanSty"><a href="<%=path%>/address/conAddress"><img
                                        src="<%=path%>/images/button_pszADd.gif" border="0" onclick=""/></a></span></li>
                            <li class="liSty"></li>
                        </ul>
                        <div style="height:25px!important;color:#fff;"></div>
                    </div>
                    <div id="edit">
                        <div class="bxSty1">
                            <table class="tabSty01" border="0" cellpadding="0" cellspacing="0" width="100%">
                                <tbody>
                                <tr class="trSty01" bgcolor="#7a7f89">
                                    <td class="reusableColor5 xxSty01" align="left" height="30">&nbsp;&nbsp;&nbsp;&nbsp;请输入新的
                                        <strong>配送地址</strong></td>
                                </tr>
                                <tr>
                                    <td align="center" valign="top">
                                        <ul class="psAdd" align="left">
                                            <li>
                                                <p class="pSty01" align="right">收货人姓名：</p>

                                                <p class="pSty02 reusableColor3" align="left">
                                                    <input name="Name" id="Name" size="22"
                                                           onchange="ChecktheForm_Name()" type="text"/>
                                                    &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp;
                                                    请准确填写真实姓名，以便确保商品准确无误送达。</p>
                                            </li>
                                            <li class="conLi1"><span class="errorstring" id="errorName"></span></li>
                                            <li>
                                                <p class="pSty01" align="right">配送省份/直辖市：</p>
                                                <p>
                                                    <select id="provinceID" name="provinceID"  >
                                                        <option selected="selected" value="">--请选择--</option>
                                                    </select>
                                                    &nbsp;&nbsp;市：
                                                    <select id="CityID" name="CityID"  >
                                                        <option selected="selected" value="">--请选择--</option>
                                                    </select>
                                                    &nbsp;&nbsp;县/区：
                                                    <select id="AreaID" name="AreaID" >
                                                        <option selected="selected" value="">--请选择--</option>
                                                    </select>
                                                    &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp; </p>
                                            </li>
                                            <li class="conLi2"><span id="errorArea"></span></li>
                                            <li>
                                                <p class="pSty01" align="right">详细地址：</p>

                                                <p class="pSty02">
                                                    <input name="Address" id="Address" size="40"
                                                           onchange="ChecktheForm_Address()" maxlength="500"
                                                           type="text"/>
                                                    &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp; <br/>
                                                    <span class="fontSty reusableColor3">862城市送货上门，货到付款。&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <span
                                                            class="reusableColor1"><a href="#" target="_blank">
                                                        查看详细的配送范围 </a></span></span></p>
                                            </li>
                                            <li class="conLi3"><span id="errorAddress" class="errorstring"></span></li>
                                            <li>
                                                <p class="pSty01" align="right">邮政编码：</p>

                                                <p class="pSty02 reusableColor3">
                                                    <input name="Zip" id="Zip" size="7" onchange="ChecktheForm_Zip()"
                                                           type="text"/>
                                                    &nbsp;&nbsp;<span class="reusableColor4">*</span>&nbsp;&nbsp; <span
                                                        id="SetPostalCode"></span></p>
                                            </li>
                                            <li class="conLi4"><span id="errorPostal" class="errorstring"></span></li>
                                            <li>
                                                <p class="pSty01" align="right">固定电话：</p>

                                                <p class="pSty02">
                                                    <input name="Tel" id="Tel" onchange="ChecktheForm_Tel()" size="12"
                                                           type="text"/>
                                                    <span id="PhoneCode"></span></p>
                                            </li>
                                            <li class="conLi5"><span id="errorPhone" class="errorstring"></span></li>
                                            <li>
                                                <p class="pSty01" align="right">手机：</p>

                                                <p class="pSty02 reusableColor3">
                                                    <input name="Mobile" id="Mobile" size="22"
                                                           onchange="ChecktheForm_Tel()" type="text"/>
                                                    手机与固定电话至少有一项必填 </p>
                                            </li>
                                            <li class="conLi6"><span id="errorMobile"></span></li>
                                            <li class="conLi7"><span class="addSpanSty"><a
                                                    href="<%=path%>/address/conAddress"><img
                                                    src="<%=path%>/images/button_pszADd.gif" alt="" border="0"
                                                    onclick=""/></a></span></li>
                                        </ul>
                                    </td>
                                </tr>
                                <tr class="trSty01" bgcolor="#dcdfe5">
                                    <td class="reusableColor3 xxSty01" align="left" height="26">&nbsp;&nbsp;&nbsp;&nbsp;接下来您还需要选择
                                        配送方式、支付方式、送货时间。
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
        <div class="addDivPage" id="all_main_down_bottom">
            <div class="pagebtn"><span class="current">1</span>&nbsp;共1页</div>
        </div>
    </div>
    </span><!--end-->
</div>
<SPAN
        id="leavelNotMustPresentLsit"></SPAN>

<DIV class="sty006 reusableColor3" align=left>您在购物过程中有任何疑问，请查阅 <A
        href="#" target=_blank><SPAN
        class="reusableColor1">帮助中心</SPAN></A> 或 <A href="#"
                                                    target=_blank><SPAN
        class="reusableColor1">联系客服</SPAN></A></DIV>
<DL class="dobuleBorder" style="display:none;">
    <DT><STRONG>关于"我的购物车"</STRONG></DT>
    <DD>·为方便您提交订单，您添加至"我的购物车"中已经选择的、尚未提交订单的商品清单，我们将为您保留90天。<BR>·在商品保留期间，您所选择商品的价格、优惠政策、库存、配送时间等信息可能会有所变化，请以网页最新信息为准。
    </DD>
</DL>
</DIV>
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
    <p class="copyright">Copyright 2010 All Rights Reserved 冀ICP证xxxxxx号

    </p>

    <p class="design"><a href="#" target="_blank" class="link">启奥科技</a></p>
</div>
<!--footer end -->
<!--body end -->
</div>
<!--box-->
</body>
</html>
