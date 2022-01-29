package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.FeedbackDetailsDao;
import com.onlineexam.model.FeedbackDetailsPojo;

@WebServlet("/feedbacks")
public class FeedbackServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=resp.getWriter();
		HttpSession session=req.getSession();
		int userId= (int)session.getAttribute("userid");
		int ExamId=Integer.parseInt(req.getParameter("examId"));
		String Feedback=req.getParameter("feedback");
		FeedbackDetailsPojo fdp=new FeedbackDetailsPojo(userId,ExamId,Feedback);
		FeedbackDetailsDao fdd=new FeedbackDetailsDao();
		try {
			fdd.insertFeedback(fdp);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Your feedback has been sent');");
			out.println("location='userMain.jsp';");
			out.println("</script>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
