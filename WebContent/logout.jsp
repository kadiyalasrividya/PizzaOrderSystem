<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		session.removeAttribute("loginName");
		session.removeAttribute("password");
		session.invalidate();
	%>
	<center>
		<h1>You have successfully Logged out!</h1>
		to login again <a href="login.jsp">Click Here</a>
	</center>
</body>
</html>