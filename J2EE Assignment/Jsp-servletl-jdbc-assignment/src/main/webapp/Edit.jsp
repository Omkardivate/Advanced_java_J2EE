<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="editemp" method="post">
		ID: <input type="number" name="eid" value="${emp.eid}"> <br><br>
		Name: <input type="text" name="ename" value="${emp.ename}"> <br><br>
		Job:<input type="text" name="ejob" value="${emp.ejob}"> <br><br>
		<br><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>