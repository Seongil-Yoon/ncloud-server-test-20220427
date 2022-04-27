<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
	<script type="text/javascript" src="/libs/jquery-3.6.0.min.js"></script>
</head>

<body>
    <h1>${product.productcode}</h1>
    <h1>${product.productname}</h1>
    <h1>${product.price}</h1>
    <h1>${product.company}</h1>
    <h1>${product.balance}</h1>
    <h1>${product.regdate}</h1>

	<script type="text/javascript">
      $(document).ready(function () {
    	  
      });
    </script>
	
</body>
</html>