<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%String path = request.getContextPath();%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gb2312"/>
    <title>商品详情</title>
    <%@ include file="/common/commonhead.jsp" %>
    <link type="text/css" href="<%=path%>/css/NumAdd.jsp" rel="stylesheet"/>
    <link type="text/css" href="<%=path%>/css/jqzoom.jsp" rel="stylesheet"/>
    <script type="text/javascript" src="<%=path%>/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="<%=path%>/js/jquery.jqzoom.js"></script>

    <!--zoom-->
    <script type="text/javascript">
        $(document).ready(function(){
            $(".jqzoom").jqueryzoom({
                xzoom: 250, //zooming div default width(default width value is 200)
                yzoom: 250, //zooming div default width(default height value is 200)
                offset: 10, //zooming div default offset(default offset value is 10)
                position: "right" //zooming div position(default position value is "right")
            });
        });
    </script>

    <!--加减按钮-->
    <script type="text/javascript">
        $(document).ready(function () {
            $("#add").click(function () {
                var n = $("#num").val();
                var num = parseInt(n) + 1;
                if (num > ${merStockInfo.num}) {
                    alert("你已经把仓库里的东西都买完了！");
                    return
                }
                $("#num").val(num);
            });
            $("#jian").click(function () {
                var n = $("#num").val();
                var num = parseInt(n) - 1;
                if (num == 0) {
                    alert("商品数量不能为0！");
                    return
                }
                $("#num").val(num);
            });
        });
    </script>

</head>
<body>
<div id="box">
<!--top start -->
<!--top start -->
<div id="top">
    <a href="index.html"><img src="<%=path%>/images/logo.gif" alt="Estimation" width="255" height="58" border="0" class="logo"/></a>

    <p class="topDiv"></p>

    <p class="navLeft"></p>
    <ul>
        <li><a href="index.html" class="hover">首页</a></li>
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
<!--guide02 start-->
<div class="guide02"><a href="#"><img src="<%=path%>/images/guide_02.jpg" width="492" height="107" border="0"/></a><a
        href="#"><img src="<%=path%>/images/guide_03.jpg" width="481" height="107" border="0"/></a></div>
<!--guide02 end -->
<!--body start -->
<div id="body" style="margin-top:1px;">
    <!--leftMain start -->
    <div id="leftMain">
        <!--left start -->
        <div id="left">
            <h2>商品分类</h2>
            <ul>
                <li><a href="#">特级椒盐味</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">壳杏仁 23元/500克 </a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">壳杏仁 23元/500克 </a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">壳杏仁 23元/500克</a></li>
                <li><a href="#">壳杏仁 23元/500克 </a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">壳杏仁 23元/500克</a></li>
            </ul>
            <h2 class="detail">纸皮巴旦木龙果</h2>
            <ul class="leftLink">
                <li><a href="#">特级椒盐味</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">特级椒盐味</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">特级椒盐味</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">特级椒盐味</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
                <li><a href="#">纸皮巴旦木龙果</a></li>
            </ul>
            <br class="spacer"/>
    <span style="color:#f9c441;"><br/><br/>
    </span></div>
        <!--left end -->
    </div>
    <!--leftMain end -->
    <!--mid start -->
    <div id="mid">
        <h6><img height="28" src="<%=path%>/images/cp_1.jpg" width="584" border="0"/></h6>
        <!--pro_price start -->
        <form:form action="${ctx}/trolley/addToTrolley" method="post" modelAttribute="merInfo">
            <div class="pro_price">
                <dl>
                    <dt>
                            <%--<img src="<%=path%>/${merInfo.picpath}" width="310" height="310"/>--%>
                    <input type="hidden" name="merchandiseid" value="${merInfo.merchandiseid}"/>
                    <div class="jqzoom" style='margin-right:5px;'><img src="<%=path%>/${merInfo.picpath}"width="320" height="320"
                                                                       alt="shoe"  jqimg="<%=path%>/${merInfo.picpath}"></div>
                    </dt>
                    <dd>

                        <table height="413" border="1" cellpadding="0" cellspacing="0"
                               style="border-collapse:collapse; border:#ccc 1px solid;">
                            <tbody>
                            <tr>
                                <td valign="top" align="middle" width="323" colspan="2"
                                    height="30"><font
                                        color="#bb1213"
                                        style=" font-size:24px; font-weight:bold;"><strong><form:label path="merchandisename">
                                         ${merInfo.merchandisename}
                                        </form:label></strong></font>
                                </td>
                            </tr>
                            <tr>
                                <td valign="top" align="right" width="111"
                                    height="28" style=" font-size:12px;color:#666; font-weight:bold;">原&nbsp;&nbsp;&nbsp; 价：
                                </td>
                                <td valign="top" width="212" height="28"><span
                                        style="text-decoration:line-through; font-size:14px;color:#666; font-weight:bold;"> ￥${merInfo.price}
                                        </span>
                                </td>
                            </tr>
                            <tr>
                                <td valign="top" align="right" width="111"
                                    height="29" style=" font-size:14px;color:#666; font-weight:bold;">促 销 价：
                                </td>
                                <td valign="top" width="212" height="28"><span
                                        style=" font-size:22px;color:#c00; font-weight:bold;">
                                            <form:label path="price">￥${merInfo.price} </form:label>
                                        </span></td>
                            </tr>
                            <tr>
                                <td valign="top" align="right" width="111"
                                    height="28" style=" font-size:14px;color:#666; font-weight:bold;">规&nbsp;&nbsp;&nbsp; 格：
                                </td>
                                <td valign="top" width="212" height="28" style=" font-size:14px;">${merInfo.spec}</td>
                            </tr>
                            <tr>
                                <td valign="top" align="right" width="111" height="28"
                                    style=" font-size:14px;color:#666; font-weight:bold;">数&nbsp;&nbsp;&nbsp;量：
                                </td>
                                <td valign="top" width="212" height="15" style="padding: 20px 0 0 20px">
                                    <input type="button" id="jian" value="-"/>
                                    <input type="text" id="num" name="num" value="1"/>
                                    <input type="button" id="add" value="+"/>
                                    <label>(${unitInfo.name})</label>
                                    <br/><br/>
                                    <label>库存数量：${merStockInfo.num}</label>
                                    <label>(${unitInfo.name})</label>
                                </td>
                            </tr>
                            <tr>

                                <label> ${someMsg}</label>
                                <td align="middle" width="323" colspan="2" height="60">
                                    <input type="submit"
                                           style="width:135px; height:40px; border:0;cursor:pointer;background-image: url(<%=path%>/images/buyNow.gif)"
                                           value=""/>
                                    <input type="submit"
                                           style="width:180px; height:40px;border:0;cursor:pointer;background-image: url(<%=path%>/images/addToCar.gif)"
                                           value=""/>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </dd>
                        <%--<br class="spacer"/>--%>
                </dl>
            </div>
        </form:form>
        <!--pro_detail start -->
        <div class="pro_detail">
            <h3>--详细介绍--</h3>
            <!--pro_detail_con start -->
            <div class="pro_detail_con">
                <p><strong>产品信息:</strong>所有散装东东在包装前都会经过严格挑拣，挑拣掉空籽、僵籽、空壳等，很难做到100%，坏籽的比率一般最多2-3％。是良好的蛋白质资源之一，同时也是一种极好的甲型生育酚型维生素E的来源，甲型生育酚是维生素E的最有效型态。美国杏仁还能提供镁、膳食纤维、钾、钙、磷和铁等。并且，美国杏仁中所含脂肪的近70%是有益于健康的单不饱和脂肪，研究表明其有助于保持一个健康的胆固醇水平。
                </p>

                <p>
                    此外，杏仁和其他坚果中含有植物化学物质，这些植物成分可以有力地抗衡心脏病、中风以及其他慢性疾病。在树坚果家族中，美国杏仁和中国杏仁是两种不同的坚果，虽然在中文里它们都被称为杏仁，但两者的营养成分不同，功效也不同。美国大杏仁对人们来说总是有些黄金情节，爱，昂贵，奢侈，处于巨大压力，亚健康状态，辛苦劳累的我们，更应该爱惜自己，一瓶纽崔莱可以买10斤大杏仁了，而十分之一价格换来的是家人的健康和美味。
                </p>

                <p><strong>公司主营项目：</strong>中秋月饼 端午粽子 年货礼品 有机食品 干果杂粮 水果蔬菜 山菌海鲜 橄榄油 柴鸡蛋等成套礼品</p>

                <p><strong>产品价格低:</strong>我们已与国内几十家正规大型工厂达成了共同开发、设计、生产、销售礼品的合作协议，最直接的礼品生产加工渠道以及薄利多销的经营准则使我们的礼品价格做到最低。
                </p>

                <p><strong>我们的客户包括:</strong>平安保险 光大银行 联想网御 爱国者 新雅迪传媒……北京乐购礼品团购网欢迎您的到来,公司服务于北京多家知名企事业单位。渠道市场京北京
                    贵宾贵宾服务百分百。乐购为您提供礼品团购全攻略，专业的服务永远是我公司的经营宗旨。您的支持和鼓励都将成为我们前进的方向。为您提供专业的礼品团购服务，确保你的礼品团购，买的更放心。</p>
            </div>
            <!--pro_detail_con end -->
        </div>
        <!--pro_detail end -->
        <br class="spacer"/>
    </div>
    <!--mid end -->
    <br class="spacer"/>
</div>
<!--body end -->
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

    <p class="design"><a href="http://www.CSSK8.com/" target="_blank" class="link">启奥科技</a></p>
</div>
<!--footer end -->
</div>
<!--box-->
</body>
</html>
