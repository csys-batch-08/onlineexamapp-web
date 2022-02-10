package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.exception.ExamNotDeleteException;
import com.onlineexam.impl.ExamDetailsDaoImpl;
import com.onlineexam.model.ExamDetails;

@WebServlet("/deleteExamServlet")
public class DeleteExamDetailsServlet extends HttpServlet {
	private static final String SCRIPT = "</script>";
	private static final String LOCATION_SHOW_EXAMS = "location='ShowExams';";
	private static final String SCRIPT_TYPE_TEXT_JAVASCRIPT = "<script type=\"text/javascript\">";
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) {
		PrintWriter out = null;
		try {
			out = res.getWriter();
			int examId = Integer.parseInt(req.getParameter("examid"));
			ExamDetails edp = new ExamDetails(examId);
			ExamDetailsDaoImpl ed = new ExamDetailsDaoImpl();

			boolean flag = ed.deleteExam(edp);
			if (!flag) {
				throw new ExamNotDeleteException();
			}
			out.println(SCRIPT_TYPE_TEXT_JAVASCRIPT);
			out.println("alert('Exam deleted successfully');");
			out.println(LOCATION_SHOW_EXAMS);
			out.println(SCRIPT);
		} catch (ExamNotDeleteException end) {
			out.println(SCRIPT_TYPE_TEXT_JAVASCRIPT);
			out.println("alert('Exam already registered, so could not delete');");
			out.println(LOCATION_SHOW_EXAMS);
			out.println(SCRIPT);
		}

		catch (SQLException e) {
			try {
				throw new ExamNotDeleteException();
			} catch (ExamNotDeleteException end) {
				out.println(SCRIPT_TYPE_TEXT_JAVASCRIPT);
				out.println("alert('Exam already registered, so could not delete');");
				out.println(LOCATION_SHOW_EXAMS);
				out.println(SCRIPT);
			}
		} catch (NumberFormatException | IOException e) {
			e.getMessage();
		}
	}
}
