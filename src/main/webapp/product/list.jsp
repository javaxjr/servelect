<%@ page import="java.util.List" %>
<%@ page import="com.csi.domain.Product" %><%--
  Created by IntelliJ IDEA.
  User: 17814
  Date: 2020/9/18
  Time: 20:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        List<Product> products=(List<Product>) request.getAttribute("list");
        for (Product product : products) {
            out.print(product);
        }

    %>

</body>
</html>
