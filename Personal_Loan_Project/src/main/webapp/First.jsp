<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.util.Scanner" %>
    <%@ page import = "com.businesslogic.BusinessLogic1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body>
<%
int press;
BusinessLogic1 bs = new BusinessLogic1();
bs.welcomePage();
Scanner sc = new Scanner(System.in);
System.out.println("Already a member press 1 else 2");
press = sc.nextInt();
if(press == 1)
	response.sendRedirect("login.jsp");
else
	response.sendRedirect("newUser.jsp");

%>


</body>
</html>