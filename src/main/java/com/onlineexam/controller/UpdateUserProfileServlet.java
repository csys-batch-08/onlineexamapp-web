package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		try {
			PrintWriter write = resp.getWriter();
			HttpSession session = req.getSession();
			int userid = (int) session.getAttribute("userid");
			String firstname = req.getParameter("firstname");
			String lastname = req.getParameter("lastname");
			String email = req.getParameter("email");
			Long phone = Long.parseLong(req.getParameter("phone"));
			Register rp = new Register(userid, firstname, lastname, email, phone);
			RegisterDaoImpl rd = new RegisterDaoImpl();
			int i = rd.editprofile(rp);
			if (i > 0) {
				write.print("Profile updated successfully!");
			}
		} catch (IOException e1) {
			e1.getMessage();
		} catch (NumberFormatException e2) {
			e2.getMessage();
		}
	}
}
