package com.onlineexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.ExamDetailsDaoImpl;
import com.onlineexam.model.ExamDetails;

@WebServlet("/ShowExams")
public class ShowExamsServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) {
		try {
			ExamDetailsDaoImpl edd = new ExamDetailsDaoImpl();
			List<ExamDetails> edp;
			edp = edd.showAllExams();
			req.setAttribute("exams", edp);
			RequestDispatcher rd = req.getRequestDispatcher("showExams.jsp");
			rd.forward(req, resp);
		} catch (ServletException | IOException e) {
			e.getMessage();
		}
	}
}
