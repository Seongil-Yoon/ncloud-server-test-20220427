<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>

<body>
	<c:if test="${0 eq insertResult }">
		<h3>비정상 회원가입</h3>
	</c:if>
	
	<c:if test="${1 eq insertResult }">
		<h3>정상 회원가입</h3>
	</c:if>
</body>
</html>