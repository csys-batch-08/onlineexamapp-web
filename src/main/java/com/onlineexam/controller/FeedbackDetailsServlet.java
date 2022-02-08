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
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int userid = (int) session.getAttribute("userid");
		int examId = Integer.parseInt(req.getParameter("examid"));
		String examName = req.getParameter("examName");
		req.setAttribute("idofuser", userid);
		req.setAttribute("idofexam", examId);
		req.setAttribute("Nameofexam", examName);
		RequestDispatcher rd = req.getRequestDispatcher("feedbackDetails.jsp");
		rd.forward(req, resp);
	}
}
