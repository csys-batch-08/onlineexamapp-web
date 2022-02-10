package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.ExamDetailsDaoImpl;
import com.onlineexam.model.ExamDetails;

@WebServlet("/updateExamDetails")
public class UpdateExamDetailsServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			PrintWriter out = res.getWriter();
			int examId = Integer.parseInt(req.getParameter("examid"));
			String difficultyLevel = req.getParameter("difficultyLevel");
			int durationMinutes = Integer.parseInt(req.getParameter("durationMinutes"));
			ExamDetails edp = new ExamDetails(difficultyLevel, durationMinutes, examId);
			ExamDetailsDaoImpl ed = new ExamDetailsDaoImpl();
			HttpSession session = req.getSession();
			boolean flag = ed.updateExam(edp);
			if (flag) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Exam updated successfully');");
				out.println("location='ShowExams';");
				out.println("</script>");
			} else {
				session.setAttribute("updateExamResult", "Couldn't update exam");
				res.sendRedirect("showExams.jsp");
			}
		} catch (IOException e1) {
			e1.getMessage();
		} catch (NumberFormatException e2) {
			e2.getMessage();
		}
	}

}
