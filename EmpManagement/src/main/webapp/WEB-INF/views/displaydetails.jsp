<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
table, td, th {
  border: 1px solid;
}

table {
  width: 90%;
  border-collapse: collapse;
}
</style>
</head>
<body>
<div align="center">
	<h1> Data </h1>
	<table >
		<thead>
			<th> empno </th>
			<th> leave_id </th>
			<th> leave_applied_on </th>
			<th> start_date </th>
			<th> end_date </th>
			<th> leave_type </th>
			<th> leave_reason </th>
		</thead>
		<tbody>
			<c:forEach var="l" items="${ lst }">
				<tr>
					<td> ${ l.empno }  </td>
					<td> ${ l.leave_id } </td>
					<td> ${ l.leave_applied_on } </td>
					<td> ${ l.start_date }  </td>
					<td> ${ l.end_date }  </td>
					<td> ${ l.leave_type }  </td>
					<td> ${ l.leave_reason }  </td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	
	<br><br>
	<a href="/leaves/home"> Go to home page </a>
</div>
</body>
</html>