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

@WebServlet("/editprofile")
public class UpdateUserProfileServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		int userid=(int)session.getAttribute("userid");
		String firstname=req.getParameter("firstname");
		String lastname=req.getParameter("lastname");
		String email=req.getParameter("email");
		Long phone=Long.parseLong(req.getParameter("phone"));
		RegisterPojo rp=new RegisterPojo(userid,firstname,lastname,email,phone);
		RegisterDao rd=new RegisterDao();
		try {
			rd.editprofile(rp);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Profile updated successfully');");
			out.println("location='UserProfile.jsp';");
			out.println("</script>");
			//session.setAttribute("editres", "Profile updated successfully");
			//resp.sendRedirect("UserProfile.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
