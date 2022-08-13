package com.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.login.RequestDao;
import com.login.ContactPojo;

//@WebServlet("/ContactServlet")
public class Request extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    private RequestDao rd = new RequestDao();   
   
    public Request() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		ContactPojo cp = new ContactPojo();
		
		cp.setName(name);
		cp.setEmail(email);
		cp.setMessage(message);
		
		try {
		rd.registerContact(cp);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		response.sendRedirect("success.jsp");
	}
		

}
