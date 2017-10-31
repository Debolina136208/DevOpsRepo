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
		<form:form action="save.htm" modelAttribute="trainee" method="post">
			<form:label path="traineeId">Trainee ID:</form:label>
			<form:input path="traineeId" required="true"/>
			<br/>
			
			<form:label path="traineeName">Trainee Name:</form:label>
			<form:input path="traineeName" required="true"/>
			<br/>
			
			<form:label path="traineeLocation">Trainee Location:</form:label>
			<form:radiobutton path="traineeLocation" value="Pune"/>Chennai
			<form:radiobutton path="traineeLocation" value="Bangalore"/>Bangalore
			<form:radiobutton path="traineeLocation" value="Pune"/>Pune
			<form:radiobutton path="traineeLocation" value="Mumbai" />Mumbai
			<br/>
			
			<form:label path="traineeDomain">Trainee Domain</form:label>
			<form:select path="traineeDomain">
				<form:options items="${domainlist}"/>
			</form:select>
			<br/>
			<button type="submit">Add Trainee</button>
		</form:form>
</body>
</html>