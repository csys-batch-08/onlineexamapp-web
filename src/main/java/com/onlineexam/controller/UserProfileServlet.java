package com.onlineexam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

@WebServlet("/UserProfile")
public class UserProfileServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			HttpSession session = req.getSession();
			int userid = (int) session.getAttribute("userid");
			RegisterDaoImpl rdao = new RegisterDaoImpl();
			Register rpojo = rdao.userprofile(userid);
			session.setAttribute("profile", rpojo);
			RequestDispatcher rd = req.getRequestDispatcher("userProfile.jsp");
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.getMessage();
		}
	}
}
