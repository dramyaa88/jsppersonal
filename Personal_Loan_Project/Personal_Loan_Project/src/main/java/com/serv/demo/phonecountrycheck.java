package com.serv.demo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class phonecountrycheck extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mobileNumber = request.getParameter("mobileNumber");
		String country = request.getParameter("country");
		String regex = "\\d{10}";
		boolean result = mobileNumber.matches(regex);
		int press = 0;

		if(result) {
		    System.out.println("Given phone number is valid");
		    if(country.equalsIgnoreCase("india"))
		    {
		    	System.out.println("Given country is valid");
		    	press=1;
		    }
		    else
		    {
		    	response.sendRedirect("country.jsp");
		    }
		} else {
		    response.sendRedirect("phone.jsp");
		}
		if(press ==1)
		{
			response.sendRedirect("loanDetails.jsp");
		}
		
	}

	
}
