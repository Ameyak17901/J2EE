<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Apply Leave Page</h1>
	<hr>
	<form action="addleave" method="post">
		Empno <input type="number" name="empno" id="empno">
		Start date <input type="date" name="start_date" id="s_date">
		End date <input type="date" name="end_date" id="e_date">
		Leave type 
		<select name="leave_type" >
			<option>Earned leave</option>
			<option>Loss of pay</option>
		</select>
		Leave Reason<select name="leave_reason">
			<option>Personal</option>
			<option>Sick</option>
			<option>Ritual</option>
			<option>Out of station</option>
		</select>
		<input type="submit">
	</form>
</body>
</html>