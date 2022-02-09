package com.onlineexam.controller;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.ScoreDetailsDaoImpl;
import com.onlineexam.model.ScoreDetails;

@WebServlet("/scoreDetails")
public class ScoreDetailsServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(HttpServletRequest req, HttpServletResponse res) {
		try {
			HttpSession session = req.getSession();
			int userId = (int) session.getAttribute("userid");
			int examId = (int) session.getAttribute("exam_Id");
			String examName = (String) session.getAttribute("exam_Name");
			int score = Integer.parseInt(req.getParameter("score"));
			String passOrFail = req.getParameter("passOrFail");
			String grade = req.getParameter("grade");
			ScoreDetails sd = new ScoreDetails(userId, examId, examName, score, passOrFail, grade);
			ScoreDetailsDaoImpl sdd = new ScoreDetailsDaoImpl();
			sdd.insertScore(sd);
			ScoreDetails sdlist = sdd.viewUserScore(sd);
			session.setAttribute("userinid", userId);
			session.setAttribute("examid", examId);
			session.setAttribute("examName", examName);
			session.setAttribute("score", score);
			session.setAttribute("passfail", passOrFail);
			session.setAttribute("grade", grade);
			session.setAttribute("examwrittendate", sdlist.getExamdate());
			res.sendRedirect("examResult.jsp");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
