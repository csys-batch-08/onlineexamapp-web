package com.onlineexam.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.ContactUsDao;
import com.onlineexam.model.ContactUsPojo;
@WebServlet("/ShowCommentsAdmin")
public class ShowCommentsAdminServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ContactUsDao cud=new ContactUsDao();
		try {
			List<ContactUsPojo> cup=cud.showCommentsAdmin();
			req.setAttribute("contactlist", cup);
			RequestDispatcher rd=req.getRequestDispatcher("ShowCommentsAdmin.jsp");
			rd.forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
