package com.onlineexam.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.ContactUsDao;
import com.onlineexam.model.ContactUsPojo;


@WebServlet("/contact")
public class ContactUsServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int userid=Integer.parseInt(req.getParameter("uID"));
		String email=req.getParameter("email");
		String comments=req.getParameter("comments");
		ContactUsPojo cup=new ContactUsPojo(userid, email, comments);
		ContactUsDao cud=new ContactUsDao();
		try {
			cud.insertcomments(cup);
			resp.sendRedirect("UserMain.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
