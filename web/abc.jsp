<%--
  Created by IntelliJ IDEA.
  User: yanru
  Date: 2020/3/8
  Time: 12:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/anno/requestParam?username=哈哈1haha:)">haha that`s fun i mean.</a>

    <br><br>

    <div style="width: 300px; height: 180px;background-color: bisque;">
        <form action="/anno/testRequestBody" method="post">
            <p3>测试requestBody注解</p3>
            <p>姓名：<input type="text" name="username"></p>
            <p>密码：<input type="text" name="psw"></p>
            <button type="submit">提交</button>
        </form>
    </div>
    <br>
    <a href="/anno/pathvar/10">测试PathVariable注解</a>
    <br>
    <a href="anno/sessionAttributes">测试sessionAttribute注解并使用use Model model</a>
    <br>
    <a href="anno/getsessionAttributes">测试获取跨方法取得共享的session的值</a>
    <br>
    <a href="/anno/deleteSessionAttributes">清除session</a>
</body>
</html>
