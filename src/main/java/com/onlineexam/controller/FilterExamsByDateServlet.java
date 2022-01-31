package com.onlineexam.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.ScoreDetailsDao;
import com.onlineexam.model.ScoreDetailsPojo;

@WebServlet("/FilterExamsByDate")
public class FilterExamsByDateServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String date = req.getParameter("date");
		try {
			ScoreDetailsDao sdd = new ScoreDetailsDao();
			List<ScoreDetailsPojo> sdp = sdd.filterbydate(date);
			req.setAttribute("dates", sdp);
			RequestDispatcher rd = req.getRequestDispatcher("filterExamsByDate.jsp");
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
