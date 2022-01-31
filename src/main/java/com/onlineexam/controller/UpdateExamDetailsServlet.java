package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.ExamDetailsDao;
import com.onlineexam.model.ExamDetailsPojo;

@WebServlet("/updateExamDetails")
public class UpdateExamDetailsServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		try {
			PrintWriter out = res.getWriter();
			int examId = Integer.parseInt(req.getParameter("examid"));
			String difficultyLevel = req.getParameter("difficultyLevel");
			int durationMinutes = Integer.parseInt(req.getParameter("durationMinutes"));
			ExamDetailsPojo edp = new ExamDetailsPojo(difficultyLevel, durationMinutes, examId);
			ExamDetailsDao ed = new ExamDetailsDao();
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
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (NumberFormatException e2) {
			e2.printStackTrace();
		}
	}

}
