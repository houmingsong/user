<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册成功</title>
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
	<div align="center">
		<table>
			<tr>
              <td>用户名</td>
              <td>性别</td>
              <td>年龄</td>
              <td>籍贯</td>
              <td>操作</td>
           </tr>
			<c:forEach var="u" items="${list}">
			<tr>
				<td><a href="jsp/update.jsp?id=${u.id}">${u.userName}</a></td>
				<td>${u.sex}</td>
				<td>${u.age}</td>
				<td>${u.province}</td>
				<td><a href="del.lovo?id=${u.id}">删除</a></td>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>