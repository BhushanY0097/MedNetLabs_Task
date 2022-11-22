<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Registration</title>
</head>
<body>
	<h1>Register Form:</h1>
	<form action="register" method="post">
		<table>
			<tr>
				<td>Enter UserID:</td>
				<td><input type="text" name="uid" /></td>
			</tr>
			<tr>
				<td>Enter Password:</td>
				<td><input type="password" name="pwd" /></td>
			</tr>
			<tr>
				<td>Enter First Name:</td>
				<td><input type="text" name="fname" /></td>
			</tr>
			<tr>
				<td>Enter Middle Name:</td>
				<td><input type="text" name="mname" /></td>
			</tr>
			<tr>
				<td>Enter Last Name:</td>
				<td><input type="text" name="lname" /></td>
			</tr>
			<tr>
				<td>Enter Gender:</td>
				<td><input type="text" name="gender" /></td>
			</tr>
			<tr>
				<td>Enter Date of Birth:</td>
				<td><input type="Date" name="dob" /></td>
			</tr>
			<tr>
				<td>Enter Address:</td>
				<td><input type="text" name="address" /></td>
			</tr>
			<tr>
				<td>Enter City:</td>
				<td><input type="text" name="city" /></td>
			</tr>
			<tr>
				<td>Enter State:</td>
				<td><input type="text" name="state" /></td>
			</tr>
		</table>
		<br/><input type="submit" value="Register" />
	</form>
</body>
</html>