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

import com.onlineexam.impl.ContactUsDao;
import com.onlineexam.model.ContactUsPojo;


@WebServlet("/contact")
public class ContactUsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		PrintWriter out=resp.getWriter();
		int userid=(int)session.getAttribute("userid");
		String email=req.getParameter("email");
		String comments=req.getParameter("comments");
		ContactUsPojo cup=new ContactUsPojo(userid, email, comments);
		ContactUsDao cud=new ContactUsDao();
		try {
			cud.insertcomments(cup);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Your comment has been sent.');");
			out.println("location='userMain.jsp';");
			out.println("</script>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
