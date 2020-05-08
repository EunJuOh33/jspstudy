<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp"%>	<!-- 애러가 나면 error 페이지로 넘긴다. -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<%
	String name = null;
	if(name == null) throw new ArithmeticException();
%>
</body>
</html>