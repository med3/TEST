package com.sdc.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Tests extends HttpServlet {

	public void doGet( HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
		
/*		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<!Doctype html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\" />");
		out.println("<title>Test</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Ceci est une page générée depuis une servlet. </p>");
		out.println("</body>");
		out.println("</html>"); 
*/
	}
}
