<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Trainee Registration</title>
</head>
<body>
		<h1>Enter Trainee Details</h1>
		<form action="save.htm">
			<table border="2">
				<tr>
					<td>Trainee Id</td>
					<td><input type="text" name="traineeid"/></td>
				</tr>

				<tr>
					<td>Trainee Name</td>
					<td><input type="text" name="traineename"/></td>				
				</tr>

				<tr>
					<td>Trainee Location</td>
					<td><input type="radio" name="traineelocation" value="Chennai"/> Chennai
						&nbsp;&nbsp;<input type="radio" name="traineelocation" value="Bangalore"/> Bangalore
						&nbsp;&nbsp;<input type="radio" name="traineelocation" value="Pune"/> Pune
						&nbsp;&nbsp;<input type="radio" name="traineelocation" value="Mumbai"/> Mumbai
					</td>
				</tr>

				<tr>
					<td>Trainee Domain</td>
					<td><select name="traineedomain">
							<option value="FS">FS</option>
							<option value="Admin">Admin</option>
							<option value="HR">HR</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<td colspan="2"><input type="submit" value="Add Trainee"/></td>				
				</tr>
			</table>
		</form>
</body>
</html>