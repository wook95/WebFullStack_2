<%@page import="com.arc.s1.account.AccountDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
<%

	List<AccountDTO> ar =(List<AccountDTO>)request.getAttribute("list");


%>    
    
    
    
    
    
    
    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<!--부트스트랩 활용한 헤더 링크  -->


</head>



<body>



<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">WebSiteName</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
      <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Page 1 <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="#">Page 1-1</a></li>
          <li><a href="#">Page 1-2</a></li>
          <li><a href="#">Page 1-3</a></li>
        </ul>
      </li>
      <li><a href="./account/accountList.do">account</a></li>
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="./member/memberJoin.do"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
      <li><a href="./member/memberLogin.do"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
    </ul>
  </div>
</nav>
<!--네비 바 -->



<div class = "container">
	<div class = "row">
		<h1>Account List</h1>
		
		
		<table class="table table-hover">
		
		<thead>
		<tr>	<th>name</th>	<th>rate</th>	<th>sale</th>		</tr>
		</thead>
		
		<tbody>
		<% for(int i=0;i<ar.size();i++){ %>
			<tr>
				<td><%=ar.get(i).getAccountName() %></td>
				<td><%=ar.get(i).getRate() %></td>
				<td><%=ar.get(i).getAccountSale() %></td>	
			</tr>
		
		
		<%} %>
		</tbody>
		
		</table>
		
		
		
	</div>
</div>


</body>
</html>