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

@WebServlet("/UserChooseExams")
public class UserChooseEasyExamsServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ExamDetailsDaoImpl edd = new ExamDetailsDaoImpl();
		List<ExamDetails> edp;
		edp = edd.showExamsEasy();
		req.setAttribute("easyexams", edp);
		RequestDispatcher rd = req.getRequestDispatcher("userChooseExams.jsp");
		rd.forward(req, resp);
	}
}
