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
	<form action="memberMybatisUpdate" method="post">
        아이디 : <input type="text" name="id" value="${param.id}" readonly="readonly"><br>
        이름 : <input type="text" name="userName"><br>
        주소 : <input type="text" name="address" id=""><br>
        <input type="submit" value="회원정보수정">
    </form>
</body>
</html>