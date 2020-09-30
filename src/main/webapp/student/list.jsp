<%@ page import="java.util.List" %>
<%@ page import="com.csi.domain.Student" %><%--
  Created by IntelliJ IDEA.
  User: 17814
  Date: 2020/9/20
  Time: 18:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="<%=request.getContextPath()%>/asserts/css/bootstrap.min.css" type="text/css" rel="stylesheet" />

    <script src="<%=request.getContextPath()%>/asserts/js/jquery-1.12.4.js" type="text/javascript"></script>

    <script src="<%=request.getContextPath()%>/asserts/js/bootstrap.min.js" type="text/javascript"></script>

    <script type="text/javascript">
        function confirm_del(stuNO) {
            if (confirm("您确定要删除"+stuNO+"的信息吗？")){
                location.href="delete.jsp?stuNO=" + stuNO ;
            }
        }
    </script>

    <%
        List<Student> students= (List<Student>) request.getAttribute("list");
        out.print(students);
    %>
</head>
<body>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <table class="table table-striped table-hover">
                <tr>
                    <th>编号</th>
                    <th>姓名</th>
                    <th>地址</th>
                    <th>操作</th>
                </tr>
                <%
                    for (Student student:students){
                %>
                <tr>
                    <td><%=student.getStudentNo()%></td>
                    <td><%=student.getStudentName()%></td>
                    <td><%=student.getStudentAddress()%></td>
                    <td>
                        <a href="<%=request.getContextPath()%>onlist.jsp?studentNO=<%=student.getStudentNo()%>">详情</a>
                        <a href="delete.jsp">删除</a>
                    </td>
                </tr>
                <%
                    }
                %>
            </table>
        </div>
    </div>
</div>


</body>
</html>
