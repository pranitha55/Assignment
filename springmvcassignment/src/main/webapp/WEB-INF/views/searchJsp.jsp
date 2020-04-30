<%@page import="javax.sound.midi.MidiDevice.Info"%>
<%@page import="com.capgemini.springmvcassignment.bean.EmployeePrimary"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	EmployeePrimary info = (EmployeePrimary) request.getAttribute("bean");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmployeeDetail</title>
</head>
<body>
	<%
		if (info != null) {
	%>
	<div align="center">
		<table border="1" style="width: 70%">
			<tr style="background: navy; color: white;">
				<th>id</th>
				<th>name</th>
				<th>age</th>
				<th>salary</th>
				<th>designation</th>
				<th>password</th>
			</tr>
			<tr>
				<td><%=info.getId()%></td>
				<td><%=info.getName()%></td>
				<td><%=info.getAge()%></td>
				<td><%=info.getSalary()%></td>
				<td><%=info.getDesignation()%></td>
				<td><%=info.getPassword()%></td>
			</tr>
		</table>
	</div>
	<%
		}
	%>
</body>
</html>