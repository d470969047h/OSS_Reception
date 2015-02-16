<%--
  Created by IntelliJ IDEA.
  User: daihui
  Date: 2015-02-15
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户登出</title>
</head>
<body>
<%
    session.invalidate();
    response.sendRedirect(request.getContextPath()+"/index/index");
%>
</body>
</html>
