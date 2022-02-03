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

import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

@WebServlet("/editprofile")
public class UpdateUserProfileServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		try {
			PrintWriter out = resp.getWriter();
			HttpSession session = req.getSession();
			int userid = (int) session.getAttribute("userid");
			String firstname = req.getParameter("firstname");
			String lastname = req.getParameter("lastname");
			String email = req.getParameter("email");
			Long phone = Long.parseLong(req.getParameter("phone"));
			Register rp = new Register(userid, firstname, lastname, email, phone);
			RegisterDaoImpl rd = new RegisterDaoImpl();
			rd.editprofile(rp);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Profile updated successfully');");
			out.println("location='UserProfile';");
			out.println("</script>");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		}
	}
}
