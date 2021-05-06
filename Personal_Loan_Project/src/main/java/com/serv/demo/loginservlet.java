package com.serv.demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.businesslogic.BusinessLogic1;
import com.dao.LoginValidation;

import com.pojo.login;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 BusinessLogic1 bs = new BusinessLogic1();
		 String userId = request.getParameter("uname");   
	     String password = request.getParameter("pass");
	     String country = request.getParameter("country");
	     String mobileNumber = request.getParameter("mobileNumber");
	     String monthlySalary = request.getParameter("monthlySalary");
	     String expense = request.getParameter("expense");
	     LoginValidation loginService = new LoginValidation();
	     boolean result = loginService.authenticateUser(userId, password);
	     login admin = loginService.getAdminbyAdminId(userId);
	     if(result==true){
//	         request.getSession().setAttribute("username", admin);      
//	         response.sendRedirect("");
	    	 bs.eligibility(country,monthlySalary, expense);
	     }
	     else{
	         response.sendRedirect("error.jsp");
	     }
	}
	}

	

