<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>

<%--在WEB-INF下的所有资源，只能通过Controller,或Servlet进行访问--%>
<h1>登录页面</h1>
<hr>

<body>
<form action="${pageContext.request.contextPath}/user/login" method="post">
    用户名：<input type="text" name="username"> <br>
    密码： <input type="password" name="pwd"> <br>
    <input type="submit" value="提交">
</form>
</body>
</html>