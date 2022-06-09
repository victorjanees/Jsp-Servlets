package com.login;

import java.io.IOException;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uname = request.getParameter("uname");
		String pass = request.getParameter("password");
		
		if(uname.equals("victor") && pass.equals("victor") ) {
			
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);
			response.sendRedirect("Requests.jsp");
		}
		else {
			response.sendRedirect("Login.jsp");
		}
	}

}
