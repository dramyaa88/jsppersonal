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


public class loginservlet1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 String userId = request.getParameter("uname");   
	     String password = request.getParameter("pass");
	     

	     LoginValidation loginService = new LoginValidation();
	     boolean result = loginService.authenticateUser(userId, password);
	     //login admin = loginService.getAdminbyAdminId(userId);
	     if(result){
     
	         response.sendRedirect("existUserLoanDetails.jsp");
	    	 
	     }
	     else{
	         response.sendRedirect("error.jsp");
	     }
	}
	}

	

