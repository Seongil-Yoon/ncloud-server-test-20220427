<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="/css/productlist.css">
    <script type="text/javascript" src="/libs/jquery-3.6.0.min.js"></script>
</head>

<body>
    <ul>
        <c:forEach items="${modelViewProductlist}" var="dto">
	        <li>
		        <span>${dto.productcode}</span>
	            <span><a href="/product?code=${dto.productcode}">${dto.productname}</a></span>
	            <span>${dto.price}</span>
	            <span>${dto.company}</span>
	            <span>${dto.balance}</span>
	            <span>${dto.regdate}</span>
	        </li>
        </c:forEach>
    </ul>
</body>

</html>