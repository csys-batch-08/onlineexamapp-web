package com.onlineexam.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

@WebServlet("/changeprofile")
public class ProfilePhotoChangeServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		HttpSession session = req.getSession();
		int userid = (int) session.getAttribute("userid");
		String photo = req.getParameter("avatar");
		Register rp = new Register(userid, photo);
		RegisterDaoImpl rd = new RegisterDaoImpl();
		try {
			rd.changephoto(rp);
			resp.sendRedirect("UserProfile");
		} catch (IOException e1) {
			e1.getMessage();
		}
	}
}
