<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- forward2로 넘어갈 때는 forward1 주소. 주소가 바뀌지 않는다. -->
	<div>
		<h3>이름 : <%=request.getParameter("name") %></h3>
	</div>
	<div>
		<h3>나이 : <%=request.getParameter("age") %></h3>
	</div>
	<div>
		<h3>주소 : <%=request.getParameter("addr") %></h3>
	</div>
	<div>
		<h3>전화번호 : <%=request.getParameter("tel") %></h3>
	</div>
</body>
</html>