<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:useBean id="myBean" class="com.test.jsp.dto.BeanTest" scope="page"></jsp:useBean>	<!-- 아이디는 name이 된다. -->
<jsp:useBean id="yourBean" class="com.test.jsp.dto.BeanTest" scope="page"></jsp:useBean>

<%-- 클래스로 객체를 생성하고 변수 명이 id 값으로 저장된다. --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바빈의 기본 작성 예제</title>
</head>
<body>
	<jsp:setProperty property="name" name="myBean" value="홍길동" />
	<%
		out.println(myBean.getName());
	%>
	<hr/>
	<%
		yourBean.setName("김영희");
	%>
	<jsp:setProperty property="name" name="yourBean" />
</body>
</html>