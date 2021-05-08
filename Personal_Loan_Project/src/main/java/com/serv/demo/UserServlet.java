package com.serv.demo;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDAO;





public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDao;
	
	public void init() {
        userDao = new UserDAO();
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String action = request.getServletPath();
		 
		 
		 switch (action) {
		 	case "/getAll":
			    getAllUser(request,response);
			    break;
		 	case "/getUser":
		 		getUser(request,response);
		 		break;
		    case "/insert":
		        insertUser(request, response);
		        break;
		    case "/delete":
		        deleteUser(request, response);
		        break;
		    
		    case "/update":
		        updateUser(request, response);
		        break;
		    
		}
		 
	}

	private void getUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void getAllUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void updateUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void deleteUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	private void insertUser(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		
	}

	
	

}
