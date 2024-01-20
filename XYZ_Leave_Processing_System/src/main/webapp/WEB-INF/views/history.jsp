<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Leave History</h3>
	<table border="2">
		<tr>
			<td>empno</td>
			<td>start date</td>
			<td>end date</td>
			<td>leave type</td>
			<td>leave reason</td>
		</tr>
			<c:forEach var="l" items="${list}">
				<tr>
				<td>${l.empno}</td>
				<td>${l.start_date}</td>
				<td>${l.end_date }</td>
				<td>${l.leave_type}</td>
				<td>${l.leave_reason}</td>
				</tr>
			</c:forEach>
		
		
	</table>
	
</body>
</html>