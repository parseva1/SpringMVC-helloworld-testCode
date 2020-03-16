<%--
  Created by IntelliJ IDEA.
  User: yanru
  Date: 2020/3/11
  Time: 16:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>springMVC_uploadFile</title>
</head>
<body>
    <h3>SpringMVC方式-文件上传</h3>
    <form action="upload/testFileUpload" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" />
        <br>
        <input type="submit" value="上传" />
    </form>

    <br><br>

    <h3>跨服务器文件上传</h3>
    <form action="upload/DifServerFileUpload" method="post" enctype="multipart/form-data">
        选择文件：<input type="file" name="upload" />
        <br>
        <input type="submit" value="上传" />
    </form>
</body>
</html>
