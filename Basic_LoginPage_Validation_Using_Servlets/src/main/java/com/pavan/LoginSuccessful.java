package com.pavan;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginSuccessful extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
	     res.getWriter().print("Login Sucessful");

	}
}
