package com.onlineexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.ScoreDetailsDaoImpl;
import com.onlineexam.model.ScoreDetails;

@WebServlet("/FilterExamsByDate")
public class FilterExamsByDateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String date = req.getParameter("date");
		try {
			ScoreDetailsDaoImpl sdd = new ScoreDetailsDaoImpl();
			List<ScoreDetails> sdp = sdd.filterbydate(date);
			req.setAttribute("dates", sdp);
			RequestDispatcher rd = req.getRequestDispatcher("filterExamsByDate.jsp");
			rd.forward(req, resp);
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}

}
