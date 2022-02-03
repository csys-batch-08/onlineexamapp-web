package com.onlineexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.ScoreDetailsDaoImpl;
import com.onlineexam.model.ScoreDetails;

@WebServlet("/StudentScoreDetails")
public class StudentScoreDetailsServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int userid = (int) session.getAttribute("userid");
		ScoreDetailsDaoImpl sdd = new ScoreDetailsDaoImpl();
		List<ScoreDetails> sdp = sdd.viewScore(userid);
		req.setAttribute("scorelist", sdp);
		RequestDispatcher rd = req.getRequestDispatcher("studentScoreDetails.jsp");
		rd.forward(req, resp);
	}
}
