<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>pageContext3.jsp의 페이지입니다.</h2>
	<%
		out.println("page3: " + request.getAttribute("data") + "<hr/>");
	%>
</body>
</html>