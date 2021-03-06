package com.onlineexam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/HtmlExamHard")
public class HtmlExamHardServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			HttpSession session = req.getSession();
			int examId = Integer.parseInt(req.getParameter("examid"));
			session.setAttribute("exam_Id", examId);
			String examName = req.getParameter("examName");
			int duration = (int) session.getAttribute("duration");
			session.setAttribute("exam_Name", examName);
			session.setAttribute("durationtime", duration);
			RequestDispatcher rd = req.getRequestDispatcher("htmlExamHard.jsp");
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.getMessage();
		}
	}
}
