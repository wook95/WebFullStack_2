<%@page import="com.arc.s1.member.MemberDTO"%>
<%@page import="com.arc.s1.member.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>로그인페이지 입니다.</h1>

<%

String id = request.getParameter("id");
String pw = request.getParameter("pw");

MemberDAO mDAO = new MemberDAO();
MemberDTO mDTO = new MemberDTO();

mDTO.setId(id);
mDTO.setId(pw);

mDTO = mDAO.login(mDTO);

String result = "fail";

if(mDTO != null){
	result = "success";
}
%>

<h1><%= id %></h1>
<h1><%= pw %></h1>


<h1><%=result %></h1>

</body>
</html>