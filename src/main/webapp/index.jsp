<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Rest Demo</title>
</head>
<body>
	Spring REST Demo
	<hr>
	
	<a href="test/hello">Hello 1</a><br>
	<a href="${pageContext.request.contextPath}/test/hello">Hello 2</a>
	
</body>
</html>