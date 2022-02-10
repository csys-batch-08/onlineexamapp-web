package com.onlineexam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/PythonExamEasy")
public class PythonExamEasyServlet extends HttpServlet {
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
			session.setAttribute("exam_Name", examName);
			int duration = (int) session.getAttribute("duration");
			session.setAttribute("durationtime", duration);
			RequestDispatcher rd = req.getRequestDispatcher("pythonExamEasy.jsp");
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.getMessage();
		}
	}
}
