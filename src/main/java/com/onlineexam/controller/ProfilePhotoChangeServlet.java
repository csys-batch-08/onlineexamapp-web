package com.onlineexam.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.RegisterDao;
import com.onlineexam.model.RegisterPojo;

@WebServlet("/changeprofile")
public class ProfilePhotoChangeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		//int userid=Integer.parseInt(req.getParameter("userid"));
		int userid=(int)session.getAttribute("userid");
		String photo=req.getParameter("avatar");
		RegisterPojo rp=new RegisterPojo(userid,photo);
		RegisterDao rd=new RegisterDao();
		try {
			rd.changephoto(rp);
			resp.sendRedirect("UserProfile.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
