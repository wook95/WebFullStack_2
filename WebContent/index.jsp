<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>index 페이지 입니다!</h1>
<a href="./member/memberLogin.do">member login </a>

<!-- 	<form action="./member/memberLogin.do"> -->
		<form action="./sub/loginTest.jsp">	
		<input type="text" name ="id">
		<input type="password" name = "pw">
		<button>login</button>
	</form>

<h3><a href="./sub/test.jsp?name=iu&age=20">go test</a></h3>

</body>
</html>