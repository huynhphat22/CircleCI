<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored ="false"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<p>This web will help you calculate +, -, *, / <br/></p>
	<form action="${pageContext.request.contextPath}/main.jsp" method="post">
		<label for="operand1">First operand: </label>
		<input type="text" name="operand1" id="operand1"><br/>
		<label for="operator">Operator </label>
		<select name="operator" id="operator">
			<option value="+">+</option>
			<option value="-">-</option>
			<option value="*">*</option>
			<option value="/">/</option>
		</select>
		<br/>
		<label for="operand2">Second operand: </label>
		<input type="text" name="operand2" id="operand2">
		<br/>
		<button type="submit">Calculate</button>
		
	</form>
	<p>Building something here</p>
</body>
</html>