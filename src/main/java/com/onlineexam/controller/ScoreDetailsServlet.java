package com.onlineexam.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.ScoreDetailsDaoImpl;
import com.onlineexam.model.ScoreDetails;

@WebServlet("/scoreDetails")
public class ScoreDetailsServlet extends HttpServlet {
	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int userId = Integer.parseInt(req.getParameter("uID"));
		int examId = Integer.parseInt(req.getParameter("examId"));
		String examName = req.getParameter("examName");
		int score = Integer.parseInt(req.getParameter("score"));
		String passOrFail = req.getParameter("passOrFail");
		String grade = req.getParameter("grade");
		ScoreDetails sd = new ScoreDetails(userId, examId, examName, score, passOrFail, grade);
		ScoreDetailsDaoImpl sdd = new ScoreDetailsDaoImpl();
		sdd.insertScore(sd);
		req.setAttribute("userid", userId);
		req.setAttribute("examid", examId);
		req.setAttribute("examName", examName);
		req.setAttribute("score", score);
		req.setAttribute("passfail", passOrFail);
		req.setAttribute("grade", grade);
		RequestDispatcher rd = req.getRequestDispatcher("examResult.jsp");
		rd.forward(req, res);

	}
}
