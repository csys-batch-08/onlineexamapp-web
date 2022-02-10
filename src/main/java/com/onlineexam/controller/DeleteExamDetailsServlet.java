package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.exception.ExamNotDeleteException;
import com.onlineexam.impl.ExamDetailsDaoImpl;
import com.onlineexam.model.ExamDetails;

@WebServlet("/deleteExamServlet")
public class DeleteExamDetailsServlet extends HttpServlet {
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
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Exam deleted successfully');");
			out.println("location='ShowExams';");
			out.println("</script>");
		} catch (ExamNotDeleteException end) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Exam already registered, so could not delete');");
			out.println("location='ShowExams';");
			out.println("</script>");
		} catch (IOException e2) {
			e2.getMessage();
		} catch (NumberFormatException e3) {
			e3.getMessage();
		}
	}
}
