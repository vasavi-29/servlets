package com.serveltsDemo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/x")
public class NameeServlet extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException
	{
		String data=req.getParameter("n");
		resp.getWriter().print("Welcome"+data);
	}

}
