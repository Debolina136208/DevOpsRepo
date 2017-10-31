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

		<h1>Modify Operation</h1>

		<form action="modify.htm">
			<table border="2">
				<tr>
					<td>Please enter trainee ID</td>
					<td><input type="text" name="traineeid"/></td>
				</tr>

				<tr>
					<td colspan="2" align="right"><input type="submit" value="update"/></td>				
				</tr>
			</table>
		</form>
		
		<h3>Trainee Info</h3>
		
		<c:if test="${trainee ne null}">
		<form action="update.htm">
			<table border="2">
				<tr>
					<td>Trainee Id</td>
					<td><input type="text" name="traineeid" value="${trainee.traineeId}"/></td>
				</tr>

				<tr>
					<td>Trainee Name</td>
					<td><input type="text" name="traineename" value="${trainee.traineeName}"/></td>				
				</tr>

				<tr>
					<td>Trainee Location</td>
					<td><input type="text" name="traineelocation" value="${trainee.traineeLocation}"/></td>
				</tr>

				<tr>
					<td>Trainee Domain</td>
					<td><input type="text" name="traineedomain" value="${trainee.traineeDomain}"/></td>
				</tr>
				
				<tr>
					<td colspan="2"><input type="submit" value="update"/></td>				
				</tr>
			</table>
		</form>
		</c:if>
	</div>
</body>
</html>