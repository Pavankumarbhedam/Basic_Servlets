package com.pavan;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginUnSucessful extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	     res.getWriter().print("Incorrect username and password");
	}
}
