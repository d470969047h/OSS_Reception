<%--
  Created by IntelliJ IDEA.
  User: daihui
  Date: 2014-12-26
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%String path = request.getContextPath();%>
<html>
<head>
    <title></title>
    <!--公共头文件-->
    <%@include file="/common/commonhead.jsp" %>
    <link type="text/css" href="<%=path%>/css/NumAdd.jsp" rel="stylesheet"/>
    <link type="text/css" href="<%=path%>/css/index.jsp" rel="stylesheet"/>
    <script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="<%=path%>/js/jquery.1.4.2-min.js"></script>
    <script type="text/javascript" src="<%=path%>/js/Calculation.js"></script>


    <!--全选，数量加减-->
    <script type="text/javascript">
        $(document).ready(function () {
            //jquery特效制作复选框全选反选取消(无插件)
            // 全选
            $(".allselect").click(function () {
                $(".gwc_tb2 input[name=newslist]").each(function () {
                    $(this).attr("checked", true);
                });
                GetCount();
            });

            //反选
            $("#invert").click(function () {
                $(".gwc_tb2 input[name=newslist]").each(function () {
                    if ($(this).attr("checked")) {
                        $(this).attr("checked", false);
                    } else {
                        $(this).attr("checked", true);
                    }
                });
                GetCount();
            });

            //取消
            $("#cancel").click(function () {
                $(".gwc_tb2 input[name=newslist]").each(function () {
                    $(this).attr("checked", false);
                });
                GetCount();
            });

            // 所有复选(:checkbox)框点击事件
            $(".gwc_tb2 input[name=newslist]").click(function () {
                if ($(this).attr("checked")) {
                } else {
                    $(this).next().css({"background-color": "#ffffff", "color": "#000000"});
                }
            });

            // 输出
            $(".gwc_tb2 input[name=newslist]").click(function () {
                // $("#total2").html() = GetCount($(this));
                GetCount();
            });
        });

        //******************
        function GetCount() {
            var conts = 0;
            var aa = 0;
            $(".gwc_tb2 input[name=newslist]").each(function () {
                if ($(this).attr("checked")) {
                    for (var i = 0; i < $(this).length; i++) {
                        conts += parseInt($(this).val());
                        aa += 1;
                    }
                }
            });
            $("#shuliang").text(aa);
            $("#zong1").html((conts).toFixed(2));
            $("#jz1").css("display", "none");
            $("#jz2").css("display", "block");
        }
    </script>

    <!---总数---->
    <script type="text/javascript">
        $(function () {
            $(".quanxun").click(function () {
                setTotal();
            });
            function setTotal() {
                var len = $(".tot");
                var num = 0;
                for (var i = 0; i < len.length; i++) {
                    num = parseInt(num) + parseInt($(len[i]).text());
                }
                $("#zong1").text(parseInt(num).toFixed(2));
                $("#shuliang").text(len.length);
            }

            //setTotal();
        })
    </script>

    <!---提交选中的商品---->
    <script type="text/javascript">
        $(function () {
            $(".jz2").click(function () {
                var index = 0;
                $(".gwc_tb2 input[name=newslist]").each(function () {
                    if ($($(".gwc_tb2 input[name=newslist]")[index]).attr("checked")) {
                        var trolleyitemid = $($(".gwc_tb2 input[name=newslist]:checked")[index]).attr("dataid");//获取该商品ID
                        var num = $($(".tb1_td5").children("input[type=text]")[index]).val();//获取该商品数量
                        $.ajax({
                            url: "<%=path%>/trolley/updateTolleyItem/" + num + "/" + trolleyitemid + ""
                        });
                    }
                    index = index + 1;
                });
                window.location = "<%=path%>/address/address";
            });
        });
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
                <DIV class="mcar" style="width:774px; margin:auto"><IMG alt=我的购物车
                                                                        src="<%=path%>/images/pic_gwc__r2_c2.jpg">
                </DIV>
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
                <DIV class="bxSty"><!--Product-->
                    <table width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="gwc_tb1"
                           id="shoppingCatTable">
                        <tr class="trSty01">
                            <td class="tb1_td1"><input id="Checkbox1" type="checkbox" class="allselect"/></td>
                            <td class="tb1_td1">全选</td>
                            <td align="center" height="32" class="tb2_td2">商品信息</td>
                            <td align="center" height="32">单价</td>
                            <td align="center" height="32">数量</td>
                            <td align="center" height="32" class="tb2_tdx">小计</td>
                            <td align="center" class="tb2_td7">操作</td>
                        </tr>

                        <%
                            int index = 0;
                        %>
                        <c:forEach items="${trolleyitemList}" var="merShowInfo">
                            <%--<input type="hidden" value="${merShowInfo.trolleyitemid}" id="trolleyitemid<%=index%>"/>--%>
                            <table cellpadding="0" cellspacing="0" class="gwc_tb2">
                                <tr>
                                    <td class="tb2_td1"><input type="checkbox" name="newslist"
                                                               dataid="${merShowInfo.trolleyitemid}"
                                                               id="newslist-<%=index%>"/>
                                    </td>
                                    <td align="center" class="gwcSuit" width="180"><span class="imgw">
                                    <a href="#" target="_blank">
                                        <img width="300" src="<%=path%>/${merShowInfo.picpath}" border="0"/>
                                    </a>
                                </span></td>
                                    <td class="tb2_td3" align="center" height="70"><a href="#" target="_blank"><span
                                            class="STYLE5"
                                            style=";font-weight: bold;">${merShowInfo.merchandisename}</span></a>
                                    </td>
                                    <td class="tb2_td3" align="center" style="font-family:'楷体';font-weight: bold;">
                                        ￥<span
                                            id="unitPrice">${merShowInfo.unitprice}</span>
                                    </td>
                                    <td class="tb1_td5">
                                        <input id="min1<%=index%>" name=""
                                               style=" width:20px; height:18px;border:1px solid #ccc;" type="button"
                                               value="-"/>
                                        <input id="text_box1<%=index%>" name="" type="text" value="${merShowInfo.num}"
                                               style=" width:30px; text-align:center; border:1px solid #ccc;"/>
                                        <input id="add1<%=index%>" name=""
                                               style=" width:20px; height:18px;border:1px solid #ccc;" type="button"
                                               value="+"/>
                                    </td>
                                    <td class="tb2_td3" align="center">￥<label id="total1<%=index%>" class="tot"
                                                                               style="color:#ff5500;font-size:14px; font-weight:bold;"></label>
                                    </td>
                                    <td class="tb2_td7" align="center">
                                        <a href="<%=path%>/trolley/deleteTolleyItem/${merShowInfo.trolleyitemid}"
                                           id="deleteMer" onclick="show_confirm()"
                                           style=";font-weight: bold;">删除</a><br/><br/>
                                        <script type="text/javascript">
                                            function show_confirm() {
                                                var r = confirm("你真的要删？你确定？？？");
                                                if (r == true) {
                                                    alert(" 你牛！不买算！！");
                                                }
                                                else {
                                                    alert("这才对嘛！");
                                                    return;
                                                }
                                            }
                                        </script>
                                    </td>
                                </tr>
                            </table>


                            <!---商品加减算总数---->
                            <script type="text/javascript">
                                $(function () {

                                    var t = $("#text_box1<%=index%>");
                                    $("#add1<%=index%>").click(function () {
                                        t.val(parseInt(t.val()) + 1);
                                        setTotal();
                                        GetCount();
                                    });
                                    $("#min1<%=index%>").click(function () {
                                        var num = t.val(parseInt(t.val()) - 1);
                                        if (num == 0) {
                                            alert("商品数量不能为0！");
                                            return
                                        }
                                        setTotal();
                                        GetCount();
                                    });
                                    function setTotal() {
                                        var unitPrice = parseFloat($("#unitPrice<%=index%>").val());
                                        $("#total1<%=index%>").html((parseInt(t.val()) * ${merShowInfo.unitprice}).toFixed(2));
                                        $("#newslist-<%=index%>").val(parseInt(t.val()) * ${merShowInfo.unitprice});
                                    }

                                    setTotal();
                                })
                            </script>
                            <%
                                index = index + 1;
                            %>
                        </c:forEach>
                    </table>

                    <table cellpadding="0" cellspacing="0" class="gwc_tb3">
                        <tr>
                            <td class="tb1_td1"><input id="checkAll" class="allselect" type="checkbox"/></td>
                            <td class="tb1_td1">全选</td>
                            <td class="tb3_td1">
                                <input id="invert" type="checkbox"/>反选
                                <input id="cancel" type="checkbox"/>取消
                            </td>
                            <td class="tb3_td2">已选商品 <label id="shuliang"
                                                            style="color:#ff5500;font-size:14px; font-weight:bold;">0</label>
                                件
                            </td>
                            <td class="tb3_td3">合计(不含运费):<span>￥</span><span style=" color:#ff5500;"><label id="zong1"
                                                                                                            style="color:#ff5500;font-size:14px; font-weight:bold;"></label></span>
                            </td>
                            <td class="tb3_td4">
                                <span id="jz1">结算</span>
                                <a href="<%=path%>/address/address" style=" display:none;" class="jz2" id="jz2">结算</a>
                            </td>
                        </tr>
                    </table>

                    <!--Product end--></DIV>
                <DIV id=OffProductList></DIV>
                <TABLE cellSpacing=0 cellPadding=0 width=760 border=0>
                    <TBODY>
                    <TR>
                        <TD vAlign=center align=left><SPAN
                                id="TenPayNotice"></SPAN></TD>
                    </TR>
                    </TBODY>
                </TABLE><SPAN
                    id="leavelNotMustPresentLsit"></SPAN>

                <DIV class="sty006 reusableColor3" align=left style="width:774px; padding:0; margin:auto">
                    您在购物过程中有任何疑问，请查阅 <A
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
