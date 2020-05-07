<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");	// 1, 2페이지에 한글이 깨지지 않도록 넣어줘야 한다.
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:forward page='<%=request.getParameter("ft") %>'>
		<jsp:param value="010-9999-8888" name="tel" />		<!-- 파라미터가 추가된다. -->
	</jsp:forward>
</body>
</html>