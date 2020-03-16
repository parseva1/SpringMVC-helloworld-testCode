<%--
  Created by IntelliJ IDEA.
  User: yanru
  Date: 2020/3/5
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>成了</title>
</head>
<body>
    <a href="/index.jsp">点击回到首页</a>
    成功页面！
    欢迎你臭弟弟:)
    <br><br>
    ${msg}
    ${sessionScope}
    ${user.date}
    ${user.uname}
    <%System.out.println("success.jsp执行了");%>
</body>
</html>
