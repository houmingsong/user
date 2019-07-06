<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<% String imgpath= request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()+"/";
			%>
<!-- 在所有的链接前面加上动态获取的绝对全路径 -->
<base href="<%=basePath%>">
</head>
<body>
	<div>
		<form action="register.lovo" method="post">
			用户名:<input type="text" name="userName"><br><br>
			性别:<select name="sex">
			   <option  style='display: none'></option>
			   <option value="男">男</option>
			   <option value="女">女</option>
			   </select><br><br>
			年龄:<input type="text" name="age"><br><br>
			籍贯:<input type="text" name="province"><br><br>
			<input type="submit" value="注册">
		</form>
	</div>
</body>
</html>