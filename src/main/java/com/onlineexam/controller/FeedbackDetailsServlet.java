package com.onlineexam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/feedbackDetails")
public class FeedbackDetailsServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			HttpSession session = req.getSession();
			int examId = Integer.parseInt(req.getParameter("examid"));
			String examName = req.getParameter("examName");
			session.setAttribute("idofexam", examId);
			session.setAttribute("Nameofexam", examName);
			RequestDispatcher rd = req.getRequestDispatcher("feedbackDetails.jsp");
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.getMessage();
		}
	}
}
