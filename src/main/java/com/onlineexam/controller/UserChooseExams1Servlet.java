package com.onlineexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.ExamDetailsDao;
import com.onlineexam.model.ExamDetailsPojo;
@WebServlet("/UserChooseExams1")
public class UserChooseExams1Servlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ExamDetailsDao edd=new ExamDetailsDao();
		List<ExamDetailsPojo> edp=edd.showExamsHard();
		req.setAttribute("hardexams", edp);
		RequestDispatcher rd=req.getRequestDispatcher("userChooseExams1.jsp");
		rd.forward(req, resp);
	}
}
