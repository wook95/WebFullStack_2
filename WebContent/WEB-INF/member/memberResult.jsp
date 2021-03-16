<%@page import="com.arc.s1.member.MemberDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
    
    <%
   	 String result = (String)request.getAttribute("r");
   	 MemberDTO mDTO = (MemberDTO)request.getAttribute("mDTO");
    
    
    %>
    
    
    
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


<h1>member result page</h1>
<h1><%= result %></h1>

<% if(mDTO !=null){ %>
<h1><%= mDTO.getId() %></h1>
<h1><%= mDTO.getEmail() %></h1>
<%} %>


</body>
</html>