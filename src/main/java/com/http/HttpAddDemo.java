package com.http;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.*;


public class HttpAddDemo extends HttpServlet 
{
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String str1=req.getParameter("n1");
		String str2=req.getParameter("n2");
	
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		int result=num1+num2;
		
		out.print("<h1>Your First No is "+num1+" Second No is: "+num2+"</h1>");
		
		out.print("<h1>Addition of Two no is :"+result+"</h1>");
		
		int result1=num1*num2;
		
		out.print("<h1>Mulltiplication of two no is:" +result1+"</h1>");
		
		double result2=num1/num2;
		
		out.print("<h1>Division of two no is:" +result2+"</h1>");
		
		out.close();
		
	}

}
