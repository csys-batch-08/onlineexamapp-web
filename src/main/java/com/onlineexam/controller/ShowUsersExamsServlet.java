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

@WebServlet("/ShowUsersExams")
public class ShowUsersExamsServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ScoreDetailsDaoImpl sdd = new ScoreDetailsDaoImpl();
		List<ScoreDetails> sdp;
		sdp = sdd.viewAllScore();
		req.setAttribute("allscores", sdp);
		RequestDispatcher rd = req.getRequestDispatcher("showUsersExams.jsp");
		rd.forward(req, resp);
	}
}
