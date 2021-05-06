package com.serv.demo;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.businesslogic.BusinessLogic1;

/**
 * Servlet implementation class First
 */
public class First extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int press;
		BusinessLogic1 bs = new BusinessLogic1();
		bs.welcomePage();
		Scanner sc = new Scanner(System.in);
		System.out.println("Already a member press 1 else 2");
		press = sc.nextInt();
		if(press == 1)
			response.sendRedirect("login.jsp");
		else
			response.sendRedirect("newlogin.jsp");
		
	}

	
}
