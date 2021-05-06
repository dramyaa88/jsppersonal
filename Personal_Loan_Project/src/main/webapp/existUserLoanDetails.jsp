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
<form >
Enter MonthlySalary : <input type = "number" name = "monthlySalary"><br>
Enter Expense : <input type = "number" name = "expense"><br>
Enter LoanAmount : <input type = "number" name = "loanAmount"><br>
Enter Tenure : <input type = "number" name = "tenure">
</form>

<%
BusinessLogic2 n =new BusinessLogic2();
session.setAttribute("eligibility", 1);
n.loanDetails(Integer.parseInt(request.getParameter("loanAmount")),Integer.parseInt(request.getParameter("tenure")));
n.endMessage();
%>
</body>
</html>