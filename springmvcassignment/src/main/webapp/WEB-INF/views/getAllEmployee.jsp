<%@page import="com.capgemini.springmvcassignment.bean.EmployeePrimary"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%
	List<EmployeePrimary> info = (List<EmployeePrimary>)request.getAttribute("list");
%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
			<%
				for (EmployeePrimary employeePrimary : info) {
			%>
			<tr>
				<td><%=employeePrimary.getId()%></td>
				<td><%=employeePrimary.getName()%></td>
				<td><%=employeePrimary.getAge()%></td>
				<td><%=employeePrimary.getSalary()%></td>
				<td><%=employeePrimary.getDesignation()%></td>
				<td><%=employeePrimary.getPassword()%></td>
			</tr>
			<%
				}
			%>
		</table>
	</div>
	<%
		}
	%>
</body>
</html>