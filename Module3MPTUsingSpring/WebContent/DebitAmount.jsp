<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="Debit.htm" method="post">
		<h2>Debit the amount from ${param.account} Account</h2>
		<h5>
			Enter Amount <input type="number" name="amount" min="1" required>
		</h5>
		<input type="hidden" name="acNo" value="${param.account}" /> <input
			type="submit" value="Debit">
	</form>
</body>
</html>