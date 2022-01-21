package com.onlineexam.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.FeedbackDetailsDao;
import com.onlineexam.model.FeedbackDetailsPojo;

@WebServlet("/feedbackDetails")
public class FeedbackServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=req.getSession();
		int userId=Integer.parseInt(req.getParameter("uID"));
		int ExamId=Integer.parseInt(req.getParameter("examId"));
		String Feedback=req.getParameter("feedback");
		FeedbackDetailsPojo fdp=new FeedbackDetailsPojo(userId,ExamId,Feedback);
		FeedbackDetailsDao fdd=new FeedbackDetailsDao();
		try {
			fdd.insertFeedback(fdp);
			session.setAttribute("userfeedback", "Your feedback has been sent.");
			resp.sendRedirect("UserMain.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
