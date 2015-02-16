<%--
  Created by IntelliJ IDEA.
  User: daihui
  Date: 2015-01-19
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script type="text/javascript" src="js/jquery-1.9.1.js"></script>
<% String path=request.getContextPath();%>
<html>
<head>
    <title>欢迎登陆晖晖电子超市</title>
</head>
<body>
<!---提交选中的商品---->
<script type="text/javascript" >
    $(document).ready(function () {
        window.location = "<%=path%>/index/index";
    });
</script>
</body>
</html>
