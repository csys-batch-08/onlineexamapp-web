package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.RegisterDao;
import com.onlineexam.model.RegisterPojo;

@WebServlet("/userstatus")
public class UserInActiveServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		int userid=Integer.parseInt(req.getParameter("userid"));
		RegisterPojo rp=new RegisterPojo(userid);
		RegisterDao rd=new RegisterDao();
		try {
			rd.updatestatus(rp);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Made user as inactive');");
			out.println("location='ShowInactiveUsers';");
			out.println("</script>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
