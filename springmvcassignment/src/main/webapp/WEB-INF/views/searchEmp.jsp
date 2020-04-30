<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Get Employee</title>
</head>
<body>
	<fieldset>
		<legend>Search Employee</legend>
		<form action="./searchEmployee">
			Employee ID:<input type="number" name="id" required>
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<input type="submit" name="Search">
		</form>
	</fieldset>
</body>
</html>