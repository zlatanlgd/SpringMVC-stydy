<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--WEB-INF下的所有资源，只能通过controller、servlet访问--%>
<h1>登录页面</h1>
<form action="/user/login" method="post">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="password">
    <input type="submit" value="提交">

</form>
</body>
</html>
