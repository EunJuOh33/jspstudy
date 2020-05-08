<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3><%=(String)session.getAttribute("id") %>님은 로그아웃 되었습니다.</h3>
	<%
		// session.removeAttribute("id"); 책에서는 이렇게 해주었다.
		session.invalidate();	// 이렇게 세션은 날리는 방법도 있다.
	%>
	<a href="sessionLogin.jsp">로그인 페이지로 이동</a>
</body>
</html>