<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<<body style="background-color:powdergrey;">
					<%if(null != request.getAttribute("msg")) { %>
						                 <%=request.getAttribute("msg") %>
					<%} %>
	<form action="UserLoginController" method="post">
		<div>
			<div id="login-pannel">
				<h2>Login Page</h2>
				Please Provide your Credentials here <br>
				<div id="login-field-name" style="margin-top: 20px;">UserId</div>
				<div id="login-field" style="margin-top: 20px;">
					<input type="text" name="loginName" class="form-login"
						title="UserName" value="" size="30" maxlength="50" />
				</div>
				<div id="login-field-name">Password</div>
				<div id="login-field">
					<input type="password" name="password" class="form-login"
						title="password" value="" size="30" maxlength="50" />
				</div>
				<br /> <span class="login-box-options"> New User? <a
					href="./registration.jsp" style="margin-left: 30px; color: orange;">Register
						Here</a>
				</span> <br>
				<br> <input type="submit" value="Login"
					style="margin-left: 100px;" />
			</div>
		</div>
	</form>
</body>
</html>