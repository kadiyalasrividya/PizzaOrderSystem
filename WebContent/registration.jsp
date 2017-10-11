<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h1 align="center">Employee Registration Form</h1>
	<form action="RegistrationController" method="post">
		<table align="center" cellpadding="10" border="1">
			<tr>
				<td>Name</td>
				<td><input type="text" name="name" maxlength="30" /></td>
			</tr>
			<tr>
				<td>Contact</td>
				<td><input type="text" name="contact" maxlength="30" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" name="address" maxlength="50" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="text" name="email" maxlength="100" /></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" name="loginName" maxlength="100" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><input type="text" name="password" maxlength="20" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Register" /> <input type="reset" value="Reset" /></td>
			</tr>
		</table>
	</form>
</body>
</html>