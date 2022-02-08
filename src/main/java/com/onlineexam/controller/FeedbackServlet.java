package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.FeedbackDetailsDaoImpl;
import com.onlineexam.model.FeedbackDetails;

@WebServlet("/feedbacks")
public class FeedbackServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
		try {
			PrintWriter out = resp.getWriter();
			HttpSession session = req.getSession();
			int userId = (int) session.getAttribute("userid");
			int examId = Integer.parseInt(req.getParameter("examId"));
			String feedback = req.getParameter("feedback");
			FeedbackDetails fdp = new FeedbackDetails(userId, examId, feedback);
			FeedbackDetailsDaoImpl fdd = new FeedbackDetailsDaoImpl();
			fdd.insertFeedback(fdp);
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Your feedback has been sent');");
			out.println("location='userMain.jsp';");
			out.println("</script>");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NumberFormatException e1) {
			e1.printStackTrace();
		}
	}
}
