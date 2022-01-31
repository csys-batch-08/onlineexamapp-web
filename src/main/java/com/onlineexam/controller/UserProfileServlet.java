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
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.RegisterDao;
import com.onlineexam.model.RegisterPojo;
@WebServlet("/UserProfile")
public class UserProfileServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		int userid=(int)session.getAttribute("userid");
		RegisterDao rdao=new RegisterDao();
		try {
			RegisterPojo rpojo=rdao.userprofile(userid);
			session.setAttribute("profile", rpojo);
			RequestDispatcher rd=req.getRequestDispatcher("userProfile.jsp");
			rd.forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
