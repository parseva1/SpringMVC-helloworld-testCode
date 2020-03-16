<%--
  Created by IntelliJ IDEA.
  User: yanru
  Date: 2020/3/10
  Time: 18:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>response</title>
    <script src="js/jquery-3.3.1.js"></script>
    <script>
        $(function () {
            $("#btn").click(function () {
                // 搞个ajax！
                $.ajax({
                    url:"user/testAjax",
                    contentType:"application/json;charset=utf-8",
                    data:'{"uname":"hehe","psw":"123","date":"2020/08/31"}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data);
                        alert(data.uname);
                        alert(data.psw);
                    },
                });
            })
        })
    </script>
</head>
<body>
    <a href="user/testString">TestString</a>
    <br>
    <a href="user/testVoid">TestVoid</a>
    <br>
    <a href="user/testModelAndView">ModelAndView</a>
    <br>
    <a href="user/testForwardOrRedirect">ForwardOrRedirect</a>
    <br>
    <button id="btn">测试requestbody响应JSON</button>
</body>
</html>
