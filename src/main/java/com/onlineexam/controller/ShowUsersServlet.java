package com.onlineexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.RegisterDao;
import com.onlineexam.model.RegisterPojo;
@WebServlet("/ShowUsers")
public class ShowUsersServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RegisterDao rdao=new RegisterDao();
		List<RegisterPojo> rp=rdao.showUsers();
		req.setAttribute("users", rp);
		RequestDispatcher rd=req.getRequestDispatcher("showUsers.jsp");
		rd.forward(req, resp);
	}
}
