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

import com.onlineexam.impl.FeedbackDetailsDao;
import com.onlineexam.model.FeedbackDetailsPojo;
@WebServlet("/showfeedback")
public class ShowFeedbackUserServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		int userid=(int)session.getAttribute("userid");
		FeedbackDetailsDao fdd=new FeedbackDetailsDao();
		try {
			List<FeedbackDetailsPojo> fdp=fdd.showFeedbacks(userid);
			System.out.println(fdp);
			req.setAttribute("feedback", fdp);
			RequestDispatcher rd=req.getRequestDispatcher("ShowFeedback.jsp");
			rd.forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
