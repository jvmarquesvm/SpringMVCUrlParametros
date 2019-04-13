<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html"; charset="UTF-8">
<title>View Index</title>
</head>
<body>
	<h3>URL Parameters</h3>
	<a href="${pageContext.request.contextPath }/demo/hi/Kevin">Um Parâmetro</a>
	<br>
	<br>
	<a href="${pageContext.request.contextPath }/demo/sum/2/3">Múltiplos Parâmetros</a>
</body>
</html>