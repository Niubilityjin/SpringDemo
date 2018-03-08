<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>用户注册</title>
</head>
<body style="font-size:30px;">
<form method="POST" action="handler_register.do">
	<p>请输入用户名</p>
	<p><input type="text" name="username"/></p>
	<p>请输入密码</p>
	<p><input type="text" name="password"/></p>
	<p>请输入年龄</p>
	<p><input type="text" name="age"/></p>
	
	<p><input type="submit" value="注册" ></p>
	</form>
</body>
</html>