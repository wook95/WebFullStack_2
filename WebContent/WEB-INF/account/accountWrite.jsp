<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
		<h1>BankBook Write Page</h1>
	<form class="form-horizontal" action="./accountWrite.do" method="post">
    <div class="form-group">
      <label class="control-label col-sm-2" for="accountName">accountName:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="accountName" placeholder="accountName" name="accountName">
      </div>
    </div>

    <div class="form-group">
      <label class="control-label col-sm-2" for="Rate">BookRate:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="Rate" placeholder="Rate" name="Rate">
      </div>
    </div>
    
    
  <div class="form-group">
  <label for="sel1">BookSale:</label>
  <select class="form-control" id="accountSale" name="accountSale">
    <option>Y</option>
    <option>N</option>
  </select>
</div>
    


    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default">Submit</button>
      </div>
    </div>
  </form>
</body>
</html>