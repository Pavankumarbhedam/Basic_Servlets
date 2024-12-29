package com.pavan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)
	{
		String url = "jdbc:mysql://localhost:3306/pavan"; 
        String user = "root"; 
        String pass = "1618";   
        String formUserName=req.getParameter("user"); 
        String formPassword=req.getParameter("pass"); 
        String query="select * from login where username='"+formUserName+"'";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,user,pass);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			if(rs.next())
			{
			   String fetchPassword=rs.getString(2);
			   if(formPassword.equals(fetchPassword))
			    {
				   res.sendRedirect("correct");
			    }
			   else
			   {
				   res.sendRedirect("incorrect");

			   }
			} 
			else {
			   res.sendRedirect("incorrect");
			}
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}

}
