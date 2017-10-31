<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="attender.htm" method="post">
		<h2>Welcome to MyBank's Online Banking</h2>
		<h5>
			Enter Customer Name <input type="text" name="cName"
				pattern="[A-Za-z ]{2,}" title="Enter only alphabets with spaces"
				required>
		</h5>
		<input type="submit" value="Get All Accounts">
	</form>
</body>
</html>