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

@WebServlet("/ShowInactiveUsers")
public class ShowInactiveUsersServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getSession();
		RegisterDaoImpl rdao = new RegisterDaoImpl();
		List<Register> rp;
		rp = rdao.showInactiveUsers();
		req.setAttribute("inusers", rp);
		RequestDispatcher rd = req.getRequestDispatcher("showInactiveUsers.jsp");
		rd.forward(req, resp);
	}
}
