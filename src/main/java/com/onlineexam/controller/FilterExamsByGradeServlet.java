package com.onlineexam.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.ScoreDetailsDaoImpl;
import com.onlineexam.model.ScoreDetails;

@WebServlet("/FilterExamsByGrade")
public class FilterExamsByGradeServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String grade = req.getParameter("grade");
		ScoreDetailsDaoImpl sdd = new ScoreDetailsDaoImpl();
		try {
			List<ScoreDetails> sdp = sdd.filterbygrade(grade);
			req.setAttribute("grades", sdp);
			RequestDispatcher rd = req.getRequestDispatcher("filterExamsByGrade.jsp");
			rd.forward(req, resp);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
