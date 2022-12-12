<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="res/css/bootstrap.css"  rel="stylesheet"  type="text/css" >
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
</head>
<style type="text/css">
.row
{
padding:10px;
}

</style>
<body>

<form action="./registerUser" method="post">
<div  class="container">
    
     <h5 class="col-md-12 text-success">Register Page</h5>
    
    <div class="row pt-3">
        <div class="col-md-3">
        <input type="hidden" name="id"  value="${idValue}" class="form-control"/>
        </div> 
    </div>
       
    <div class="row pt-3">
        <div class="col-md-3">Enter Name</div> 
          <div class="col-md-3"><input type="text" name="name" value="${nameValue}" class="form-control"/></div>
    </div>
    
    
    <div class="row pt-3">
        <div class="col-md-3">Select Gender</div> 
          <div class="col-md-3">
          male<input type="radio" name="gender" value="male"${genderValue eq 'male'?'checked':''} />
          female<input type="radio" name="gender" value="female"${genderValue eq 'female'?'checked':''} />
          </div>
    </div>   


   <div class="row pt-3">
        <div class="col-md-3">Enter Address</div> 
       <textarea name="address" class="form-control"${addressValue}></textarea>
    </div>
    
    
   <div class="row pt-3">
       <div class="col-md-3">Enter State</div> 
         <select name="state" class="form-control">
           <option value="-1">Select</option>
            <option value="Maharashtra"${stateValue  eq 'maharashtra'?'selected':''}>maharashtra</option>
           <option value="Gujrat"${stateValue  eq 'gujrat'?'selected':''}>gujrat</option>
          <option value="panjab"${stateValue  eq 'panjab'?'selected':''}>panjab</option>
          <option value="Rajasthan"${stateValue  eq 'rajasthan'?'selected':' '}>Rajasthan</option>
         </select>
    </div>
     
    <div class="row pt-3">
       <div class="col-md-3">Enter City</div> 
         <select name="city" class="form-control">
           <option value="-1">Select</option>
            <option value="Nagpur"${cityValue  eq 'nagpur'?'selected':''}>nagpur</option>
           <option value="Surat"${cityValue  eq 'gujrat'?'selected':''}>surat</option>
          <option value="Merath"${cityValue  eq 'merath'?'selected':''}>merath</option>
          <option value="Bhangad"${cityValue  eq 'bhangad'?'selected':' '}>bhangad</option>
         </select>
    </div>
     <div class="row pt-3">
        <div class="col-md-3">Enter Dob</div> 
          <div class="col-md-3">
          <input type="date" name="dob" value="${dobValue}" class="form-control"/>
          </div>
    </div>
     <div class="row pt-3">
        <div class="col-md-3">Enter LoginId</div> 
          <div class="col-md-3"><input type="text" name="loginId" value="${lginIdValue}" class="form-control"/></div>
    </div>
     
      <div class="row pt-3">
        <div class="col-md-3">Enter password</div> 
          <div class="col-md-3"><input type="password" name="password" value="${passwordValue}" class="form-control"/></div>
    </div> 
      
       <div class="row pt-2">
         <div class="col-md-3 text-danger">
          <h4>${error}</h4>
        </div> 
    </div> 
      
      <div class="row pt-2">
         <div class="col-md-3 text-success">
          <h4>${success}</h4>
        </div> 
    </div> 
      
      <div class="row pt-3">
          <div class="col-md-3"><input type="submit" value="SUBMIT" class="btn btn-info"/></div>
    </div>  
  
  
  
  
</div>
</form>
</body>
</html>