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
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int userid = (int) session.getAttribute("userid");
		int examId = Integer.parseInt(req.getParameter("examid"));
		String examName = req.getParameter("examName");
		int duration = (int) session.getAttribute("duration");
		req.setAttribute("user_id", userid);
		req.setAttribute("exam_Id", examId);
		req.setAttribute("exam_Name", examName);
		req.setAttribute("durationtime", duration);
		RequestDispatcher rd = req.getRequestDispatcher("htmlExamHard.jsp");
		rd.forward(req, resp);
	}
}
