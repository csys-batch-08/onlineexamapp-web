package com.onlineexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.RegisterDaoImpl;
import com.onlineexam.model.Register;

@WebServlet("/ShowUsers")
public class ShowUsersServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		try {
			RegisterDaoImpl rdao = new RegisterDaoImpl();
			List<Register> rp;
			rp = rdao.showUsers();
			req.setAttribute("users", rp);
			RequestDispatcher rd = req.getRequestDispatcher("showUsers.jsp");
			rd.forward(req, resp);
		} catch (IOException e) {
			e.getMessage();
		}
	}
}
