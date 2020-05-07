<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setAttribute("data", "데이터");
		pageContext.setAttribute("page", "페이지컨텍스트");
		pageContext.forward("pageContextTest2.jsp");
		// pageContext의 허용 범위(scope)는 자신의 페이지까지입니다.
	%>
</body>
</html>