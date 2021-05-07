<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.businesslogic.BusinessLogic2" %>
    <%@ page import = "com.pojo.loanDetails" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<h1>Enter your Loan Details</h1>
<form action = "loginservlet22" method="get">
Enter MonthlySalary : <input type = "number" name = "monthlySalary"><br>
Enter Expense : <input type = "number" name = "expense"><br>
Enter LoanAmount : <input type = "number" name = "loanAmount"><br>
Enter Tenure : <input type = "number" name = "tenure">

<input type = "submit" value = "submit">
</form>


</body>
</html>