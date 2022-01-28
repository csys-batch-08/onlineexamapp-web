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

import com.onlineexam.impl.FeedbackDetailsDao;
import com.onlineexam.model.FeedbackDetailsPojo;
@WebServlet("/ShowFeedbackAdmin")
public class ShowFeedbackAdminServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		FeedbackDetailsDao fdd=new FeedbackDetailsDao();
		try {
			List<FeedbackDetailsPojo> fdp=fdd.showFeedbacksAdmin();
			req.setAttribute("showfeedback", fdp);
			RequestDispatcher rd=req.getRequestDispatcher("showFeedbackAdmin.jsp");
			rd.forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
