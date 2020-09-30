<%--
  Created by IntelliJ IDEA.
  User: 17814
  Date: 2020/9/18
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%
        String username=(String) session.getAttribute("username");
    %>
</head>
<body>
    欢迎您，<%=username%>
</body>
</html>
