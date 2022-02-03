package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.exception.ExamAlreadyExistException;
import com.onlineexam.impl.ExamDetailsDaoImpl;
import com.onlineexam.model.ExamDetails;

@WebServlet("/addExamDetails")
public class AddExamDetailsServlet extends HttpServlet {
	// method for adding exam
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		PrintWriter out = null;
		try {
			out = res.getWriter();
			String examName = req.getParameter("examName");
			String examType = req.getParameter("examType");
			String difficultyLevel = req.getParameter("difficultyLevel");
			int durationMinutes = Integer.parseInt(req.getParameter("durationMinutes"));
			ExamDetails edp = new ExamDetails(examName, examType, difficultyLevel, durationMinutes);
			ExamDetailsDaoImpl ed = new ExamDetailsDaoImpl();
			HttpSession session = req.getSession();
			ExamDetails edpojo = ed.showExams();
			int duration = edpojo.getDurationMinutes();
			session.setAttribute("duration", duration);
			List<ExamDetails> edplist = ed.showExistExams(examName, examType, difficultyLevel);

			if (edplist.isEmpty()) {
				int result = ed.addExam(edp);
				if (result > 0) {
					out.println("<script type=\"text/javascript\">");
					out.println("alert('Exam added successfully');");
					out.println("location='ShowExams';");
					out.println("</script>");
				}
			} else {
				throw new ExamAlreadyExistException();
			}

		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		} catch (ExamAlreadyExistException ea) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Exam already exist');");
			out.println("location='ShowExams';");
			out.println("</script>");
		}
	}

}
