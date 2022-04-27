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
	<img alt="" src="/images/jquery.png">
	<h1>${model}</h1>
	<input type="button" id="ajaxBtn" value="ajax요청">
	<div id="result"></div>

	<script type="text/javascript">
		$(document).ready(function () {
			$("h1").css("color", "blue");
			$("#ajaxBtn").on("click", function () {
				$.ajax({
					url: "/helloajax",
					type: "get",
					dataType: "json", //응답타입
					success: function (result) {
						$("#result").html(result.id + " : " + result.password);
					}
				});
			}); //end of onClick
		});
	</script>

</body>

</html>