<%@page import="com.arc.s1.account.AccountDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
   <%
   	AccountDTO accountDTO = (AccountDTO)request.getAttribute("dto");
   
   
   %>
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>name : <%=accountDTO.getAccountName() %></h1>
<h1>rate : <%=accountDTO.getRate() %></h1>


</body>
</html>