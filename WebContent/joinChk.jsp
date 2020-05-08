<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");    
%>
<jsp:useBean id="user" class="com.test.jsp.dto.JoinBean" />
<jsp:setProperty name="user" property="*" />	<%-- 자바빈의 필드명과 폼태그의 네임속성값이 동일하면 *로 모두 저장할 수 있다. --%>
<jsp:setProperty name="user" property="id" param="id2"/>	<%-- param과 value 구분. 필드의 개수와 파라미터의 개수가 같다면 *로 한꺼번에 넣어 줄 수 있다. --%>
<jsp:setProperty name="user" property="pass" param="pass2" />	<%-- 파라미터의 개수가 다르다면 param을 적어야 한다. --%>
<jsp:setProperty name="user" property="name" param="name2" />
<jsp:setProperty name="user" property="sex" param="sex2" />
<jsp:setProperty name="user" property="age" param="age2" />
<jsp:setProperty name="user" property="email" param="email2" />
<jsp:setProperty name="user" property="id" value="yt123"/>	<%-- 특정 값을 입력하고 싶다면 value로 입력한다. --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력정보 확인 페이지</title>
</head>
<body>
	<jsp:getProperty property="id" name="user" />
	<jsp:getProperty property="pass" name="user" />
	<jsp:getProperty property="name" name="user" />
	<jsp:getProperty property="sex" name="user" />
	<jsp:getProperty property="age" name="user" />
	<jsp:getProperty property="email" name="user" />
</body>
</html>