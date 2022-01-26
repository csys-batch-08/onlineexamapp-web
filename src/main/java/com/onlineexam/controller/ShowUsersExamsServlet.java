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

import com.onlineexam.impl.ScoreDetailsDao;
import com.onlineexam.model.ScoreDetailsPojo;
@WebServlet("/ShowUsersExams")
public class ShowUsersExamsServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ScoreDetailsDao sdd=new ScoreDetailsDao();
		try {
			List<ScoreDetailsPojo> sdp=sdd.viewAllScore();
			req.setAttribute("allscores", sdp);
			RequestDispatcher rd=req.getRequestDispatcher("ShowUsersExams.jsp");
			rd.forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
