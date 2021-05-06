<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "com.pojo.NewUser" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New User Login</title>
</head>
<body>
<center>
<h1>New User Login Details</h1>
</center>
<form >

Enter your Name : <input type = "text" name = "name"><br>
Enter your UserId : <input type = "text" name = "userId"><br>
Enter your Password : <input type = "password" name = "password"><br>
Enter your Country : <input type = "text" name = "country"><br>
Enter your Mobile Number : <input type = "text" name = "mobileNumber"><br>
Enter your Pan Number : <input type = "text" name = "panNumber"><br>

</form>
<%response.sendRedirect("phonecountrycheck.java"); %>
<!--  <h3>Registered successfully</h3>
<a href = "/Personal_Loan_Project/src/main/webapp/loanDetails.jsp">Go to enter your LoanDetails Page</a>-->
</body>
</html>