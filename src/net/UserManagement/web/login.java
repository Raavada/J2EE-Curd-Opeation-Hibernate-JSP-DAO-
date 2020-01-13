package net.UserManagement.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uName=request.getParameter("uName");
		String pass= request.getParameter("pass");
		
		if(uName.equals("sagar")&& pass.equals("admin"))
		{	
			HttpSession session= request.getSession();
			session.setAttribute("username", uName);
			response.sendRedirect("list-user.jsp");
			
		}
		
		else
		{
			response.sendRedirect("login.jsp");
			
		}
	}


}
