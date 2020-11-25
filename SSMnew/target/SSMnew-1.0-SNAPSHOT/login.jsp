<%--
  Created by IntelliJ IDEA.
  User: foam
  Date: 2020/11/25
  Time: 13:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="user/login" method="post">
    <label>用户名：</label><input type="text" name="username">
    <label>密　码：</label><input type="password" name="password">
    <input type="submit" value="登录">
    <input type="reset" value="重置">
</form>
</body>
</html>
