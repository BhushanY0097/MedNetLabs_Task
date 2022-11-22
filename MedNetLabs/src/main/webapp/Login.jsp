<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<style>
body {
  margin: 0;
  padding: 0;
  background-color: #17a2b8;
  height: 100vh;
}
#login .container #login-row #login-column #login-box {
  margin-top: 120px;
  max-width: 600px;
  height: 320px;
  border: 1px solid #9C9C9C;
  background-color: #EAEAEA;
}
#login .container #login-row #login-column #login-box #login-form {
  padding: 20px;
}
#login .container #login-row #login-column #login-box #login-form #register-link {
  margin-top: -85px;
}
</style>
</head>
<body>
<h3> ${cookie.loginerr.value} </h3>
    <div id="login">
        <h3 class="text-center text-white pt-5">Login form</h3>
        <div class="container">
            <div id="login-row" class="row justify-content-center align-items-center">
                <div id="login-column" class="col-md-6">
                    <div id="login-box" class="col-md-12">
                        <form id="login-form" class="form" action="login" method="post">
                            <h3 class="text-center text-info">Login</h3>
                            <div class="form-group">
                                <label for="username" class="text-info">User ID:</label><br>
                                <input type="text" name="uid" id="uid" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password" class="text-info">Password:</label><br>
                                <input type="password" name="pwd" id="pwd" class="form-control">
                            </div>
                            <div class="form-group">
                                <input type="submit" name="submit" class="btn btn-info btn-md" value="submit">
                            </div>
                           <br/><br/>
                            <div id="register-link" class="text-right">
                                <a href="Register.jsp" class="text-info">Register here</a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>

<!--<p> ${cookie.loginerr.value} </p>
	
	<%-- 
	<%
		Cookie [] allc = request.getCookies();
	    if(allc != null)
	    {
	    	for(Cookie c : allc)
	    	{
	    		if(c.getName().equals("loginerr"))
	    			out.print(c.getValue());
	    	}
	    }
	%> --%>
	
	<form action="login" method="post">
		<table>
			<tr>
				<td>Enter UserID:</td>
				<td><input type="text" name="uid" /></td>
			</tr>
			<br/>
			<tr>
				<td>Enter Password:</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
		</table>
		<br/><input type="submit" value="Login" />
	</form>
	<br/><br/>
	<a href="Register.jsp">New User? Register here</a>
	<br/><br/>
	<a href="search">Google Search</a>
	<br/><br/>
</body>
</html>-->