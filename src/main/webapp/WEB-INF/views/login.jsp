<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<style type="text/css">
.row
{
padding:10px;
}

</style>

<body>
<form action="./loginUser">
<div class="container">
      
       <h5 class="col-md-12 text-success">Login Page</h5>
      
      
      <div class="row pt-3">
           <div class="col-md-5">Enter Username</div>
           <div class="col-md-5"><input type="text"  name="username" class="form-control"></div>
      </div>

       <div class="row pt-3">
           <div class="col-md-5">Enter password</div>
           <div class="col-md-5"><input type="password"  name="password" class="form-control"></div>
      </div>

      <div class="row pt-3">
           <div class="col-md-5"><input type="submit"  name="login" class="btn btn-info"></div>
      </div> 

      
       <div class="row pt-3">
           <div class="col-md-5 text-danger">
           <h4>${error}</h4>
           </div>
      </div>
</div>
</form>
</body>
</html>