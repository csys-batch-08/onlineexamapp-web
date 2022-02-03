package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.ContactUsDaoImpl;
import com.onlineexam.model.ContactUs;

@WebServlet("/contact")
public class ContactUsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		try {
			HttpSession session = req.getSession();
			PrintWriter out = resp.getWriter();
			int userid = (int) session.getAttribute("userid");
			String email = req.getParameter("email");
			String comments = req.getParameter("comments");
			ContactUs cup = new ContactUs(userid, email, comments);
			ContactUsDaoImpl cud = new ContactUsDaoImpl();
			cud.insertcomments(cup);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Your comment has been sent.');");
			out.println("location='userMain.jsp';");
			out.println("</script>");
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}
