<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="resources/libs/jquery-3.6.0.min.js"></script>
</head>

<body>
	<script type="text/javascript">
      $(document).ready(function () {
    	  
      });
    </script>
	<c:if test="${!empty param.page }">
		<h1>${param.page}페이지의${name}</h1>
	</c:if>

	<c:if test="${!empty paramValues.address }">
		<h1>
			<c:forEach items="${paramValues.address }" var="add">
				검색한 주소 : ${add} <br>
			</c:forEach>
			${name}
		</h1>
		<c:forEach items="${memberAddList}" var="id">
			<h3>회원아이디 : ${id}</h3>
		</c:forEach>
	</c:if>

	<c:if test="${empty paramValues.address }">
		<c:forEach items="${memberlist}" var="dto">
			<h3>회원아이디 : ${dto.id}, 이름 : ${dto.userName}, 이메일 : ${dto.email}</h3>
		</c:forEach>
	</c:if>
</body>
</html>