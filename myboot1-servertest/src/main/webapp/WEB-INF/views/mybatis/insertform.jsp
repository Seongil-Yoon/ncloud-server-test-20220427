<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>

<body>
	<form action="memberMybatisInsert" method="post">
        아이디 : <input type="text" name="id"><br>
        암호 : <input type="password" name="password"><br>
        이름 : <input type="text" name="userName"><br>
        폰번호 : <input type="text" name="phone" id=""><br>
        이메일 : <input type="text" name="email" id=""><br>
        주소 : <input type="text" name="address" id=""><br>
        <input type="submit" value="가입">
    </form>
</body>
</html>