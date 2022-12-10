<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>
@import url("https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap");
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: "Poppins", sans-serif;
}
body {
  min-height: 100vh;
  display: flex;
  align-items: center;
  justify-content: center;
  padding: 20px;
  background: rgb(130, 106, 251);
}
.container {
  position: relative;
  max-width: 700px;
  width: 100%;
  background: #fff;
  padding: 25px;
  border-radius: 8px;
  box-shadow: 0 0 15px rgba(0, 0, 0, 0.1);
}
.container header {
  font-size: 1.5rem;
  color: #333;
  font-weight: 500;
  text-align: center;
}
.container .form {
  margin-top: 30px;
}
.form .input-box {
  width: 100%;
  margin-top: 20px;
}
.input-box label {
  color: #333;
}
.form :where(.input-box input, .select-box) {
  position: relative;
  height: 50px;
  width: 100%;
  outline: none;
  font-size: 1rem;
  color: #707070;
  margin-top: 8px;
  border: 1px solid #ddd;
  border-radius: 6px;
  padding: 0 15px;
}
.select-box select {
  height: 100%;
  width: 100%;
  outline: none;
  border: none;
  color: #707070;
  font-size: 1rem;
}
.form button {
  height: 55px;
  width: 100%;
  color: #fff;
  font-size: 1rem;
  font-weight: 400;
  margin-top: 30px;
  border: none;
  cursor: pointer;
  transition: all 0.2s ease;
  background: rgb(130, 106, 251);
}
</style>
</head>
<body>
	<section class="container">
      <header>Registration Form</header>
      <form action="register" class="form" method="post">
      
      	<div class="input-box">
          <label>User ID</label>
          <input type="text" name="uid" placeholder="User ID" required />
        </div>
        
        <div class="input-box">
          <label>Password</label>
          <input type="password" name="pwd" placeholder="Password" required />
        </div>
      	
        <div class="input-box">
          <label>First Name</label>
          <input type="text" name="fname" placeholder="First name" required />
        </div>
        
        <div class="input-box">
          <label>Middle Name</label>
          <input type="text" name="mname" placeholder="Middle name"  />
        </div>
        
        <div class="input-box">
          <label>Last Name</label>
          <input type="text" name="lname" placeholder="Last name" required />
        </div>


        <div class="column">
          <div>
            <label>Gender</label>
            <input type="radio" name="gender" value="male"> Male 
            <input type="radio" name="gender" value="female"> Female
          </div>
          <div class="input-box">
            <label>Birth Date</label>
            <input type="date" name="dob" placeholder="Enter birth date" />
          </div>
        </div>
     
        <div class="input-box address">
          <label>Address</label>
          <input type="text" placeholder="Enter address" required />
          <div class="column">
            <div class="select-box">
              <select>
                <option >City</option>
                <option>Nagpur</option>
                <option>Bhopal</option>
                <option>Hydrabad</option>
                <option>Chennai</option>
              </select>
            </div>
          </div>
          <div class="column">
            <div class="select-box">
              <select>
                <option >State</option>
                <option>Maharashtra</option>
                <option>Madhya-Pradesh</option>
                <option>Telangana</option>
                <option>TamilNadu</option>
              </select>
            </div>
          </div>
        </div>
        <button type="submit" value="Register">Submit</button>
      </form>
    </section>

</body>
</html>