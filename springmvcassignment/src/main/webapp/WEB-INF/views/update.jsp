<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Form</title>
</head>
<body>
	<fieldset>
		<legend>Update Employee</legend>
		<form action="./updateEmployee">
			Employee ID:<input type="number" name="id" required>
			Age:<input type="number" name="age">
			&nbsp;&nbsp;&nbsp;&nbsp; 
			<input type="submit" value="update">
		</form>
	</fieldset>

</body>
</html>