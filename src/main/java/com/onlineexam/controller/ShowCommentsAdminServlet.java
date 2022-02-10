package com.onlineexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.ContactUsDaoImpl;
import com.onlineexam.model.ContactUs;

@WebServlet("/ShowCommentsAdmin")
public class ShowCommentsAdminServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			ContactUsDaoImpl cud = new ContactUsDaoImpl();
			List<ContactUs> cup = cud.showCommentsAdmin();
			req.setAttribute("contactlist", cup);
			RequestDispatcher rd = req.getRequestDispatcher("showCommentsAdmin.jsp");
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.getMessage();
		}

	}
}
