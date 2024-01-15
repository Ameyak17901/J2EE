<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>quantity</th>
			<th>price</th>
		</tr>
			<c:forEach var="p" items="${plist}">
			<tr>
				<td>${p.id}</td>
				<td>${p.name}</td>
				<td>${p.qty}</td>
				<td>${p.price}</td>
			</tr>
			</c:forEach>
	</table>
	<a href="insert"></a>
</body>
</html>