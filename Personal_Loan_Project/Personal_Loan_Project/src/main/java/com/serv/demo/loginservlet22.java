package com.serv.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.businesslogic.BusinessLogic2;

/**
 * Servlet implementation class loginservlet2
 */

public class loginservlet22 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int loanAmount = Integer.parseInt(request.getParameter("loanAmount"));
		int tenure = Integer.parseInt(request.getParameter("tenure"));
		BusinessLogic2 n =new BusinessLogic2();
		HttpSession session = request.getSession();
		session.setAttribute("eligibility", 1);
		n.loanDetails(loanAmount, tenure);
		n.endMessage();
	}

}
