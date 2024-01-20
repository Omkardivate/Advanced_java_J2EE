<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center" style="border: 1px black solid">
	<h1> Apply for Leaves </h1>
	<form action="insert" method="post">
		Empno <input type="number" id="empno" name="empno"> <br><br>
		Leave Id <input type="text" id="lid" name="lid"> <br><br>
		Today's Date <input type="text" id="ladate" name="ladate"> <br><br>
		Start Date <input type="text" id="sdate" name="sdate"> <br><br>
		End Date <input type="text" id="edate" name="edate"> <br><br> 
		Leave Type <input type="text" id="ltype" name="ltype"> <br><br>
		Leave Reason <input type="text" id="lreason" name="lreason"> <br><br>
		<input type="submit" value="Apply Leave">
	</form>
</div>
</body>
</html>