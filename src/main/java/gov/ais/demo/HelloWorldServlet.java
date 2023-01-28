package gov.ais.demo;


import java.io.*; 
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@SuppressWarnings("serial")
@WebServlet(name = "HelloServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {

	 public void doGet(HttpServletRequest request, 
	          HttpServletResponse response) 
	          throws ServletException, IOException 
	{
	 response.setContentType("text/html");
	    PrintWriter out = response.getWriter();
	    out.println("Hello World"); 
	  }
}
