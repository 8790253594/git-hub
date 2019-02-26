package com.manu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.net.ssl.SSLSession;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.IOP.ServiceContext;

/**
 * Servlet implementation class Servlet3
 */
@WebServlet("/Servlet3")
public class Servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 //TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter writer=response.getWriter();
		writer.println("<h1> Mahesh yadav</h1>");
		
		String username= request.getParameter("username");
	writer.println("Hello from get"+" "+username);
	
	ServletContext  context= request.getServletContext();
	HttpSession session=request.getSession();
    
    
	if(username !="" && username!=null) {
			
	
	session.setAttribute("username343", username);
	context.setAttribute("username3443", username);
	}
	writer.println("session username as "+ (String)session.getAttribute("username343"));
	writer.println("Context username as  " + (String)context.getAttribute("username3443"));
	//writer.println("\nThis is " + this.getServletConfig().getInitParameter("username343"));
	
	
//	RequestDispatcher rd=request.getRequestDispatcher("Servlet");	
//	
//	rd.forward(request, response);
	}//?username343=manu
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.setContentType("text/html");
			PrintWriter writer=response.getWriter();
			writer.println("<h1> Mahesh yadav</h1>");
			String username= request.getParameter("username");
			writer.println("Hello from post"+" "+username);
			String prof1=request.getParameter("prof");
			writer.println(prof1);
			//String loc= request.getParameter("location");
			String[] loc1=request.getParameterValues("location");
			
			writer.println(loc1.length);
			for(int i=0;i<loc1.length;i++)
			{
			 writer.println(loc1[i]);
			 
			}
		
		}
	
	}

