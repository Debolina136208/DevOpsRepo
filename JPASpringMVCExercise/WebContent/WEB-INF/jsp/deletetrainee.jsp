<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Trainee</title>
</head>
<body>
<div>

		<h1>Delete Operation</h1>

		<form action="get.htm">
			<table border="2">
				<tr>
					<td>Please enter trainee ID</td>
					<td><input type="text" name="traineeid"/></td>
				</tr>

				<tr>
					<td colspan="2" align="right"><input type="submit" value="Delete"/></td>				
				</tr>
			</table>
		</form>
		
		<c:if test="${trainee ne null}">
		<h3>Trainee Info</h3>
		<form action="delete.htm">
			<input type="hidden" name="traineeId" value="${trainee.traineeId}"/>
			<table border="2">
				<tr>
					<th>Trainee Id</th>
					<th>Trainee Name</th>
					<th>Trainee Location</th>
					<th>Trainee Domain</th>
				</tr>
				<tr>
					<td>${trainee.traineeId}</td>
					<td>${trainee.traineeName}</td>
					<td>${trainee.traineeDomain}</td>
					<td>${trainee.traineeLocation}</td>
				</tr>

				<tr>
					<td colspan="2" align="right"><input type="submit" value="delete"/></td>
				</tr>
			</table>
			</form>
		</c:if>
	</div>
</body>
</html>