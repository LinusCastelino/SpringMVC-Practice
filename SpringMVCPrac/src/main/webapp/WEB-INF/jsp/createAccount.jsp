<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Account - SpringMVCPrac</title>
</head>
<body>

	<h1>Enter details :</h1>
	<form:form commandName="newAccount">
		<table>
			<tr><td>First Name : <form:input path="firstName" type="text" placeholder="Enter First Name" name="firstName"/></td></tr>
			<tr><td>Last Name : <form:input path="lastName" type="text" placeholder="Enter Last Name" name="lastName" /></td></tr>
			<tr><td>Email :<form:input path="email" type="text" placeholder="Enter email" name="email" /></td></tr>
			<tr><td><input type="submit" value="Submit" /></td></tr>
		</table>
	</form:form>

</body>
</html>