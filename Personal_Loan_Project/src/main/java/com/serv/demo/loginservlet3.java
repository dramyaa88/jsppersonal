package com.serv.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.businesslogic.BusinessLogic2;

/**
 * Servlet implementation class loginservlet3
 */

public class loginservlet3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int monthlySalary = Integer.parseInt(request.getParameter("monthlySalary"));
		int expense = Integer.parseInt(request.getParameter("expense"));
		int loanAmount = Integer.parseInt(request.getParameter("loanAmount"));
		int tenure = Integer.parseInt(request.getParameter("tenure"));
		
		BusinessLogic2 n =new BusinessLogic2();
		n.eligibility(monthlySalary, expense);
		n.loanDetails(loanAmount, tenure);
		n.endMessage();
	}

	
}
