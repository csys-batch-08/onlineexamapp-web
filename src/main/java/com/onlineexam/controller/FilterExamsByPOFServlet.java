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
@WebServlet("/FilterExamsByPOF")
public class FilterExamsByPOFServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pof=req.getParameter("pof");
		ScoreDetailsDao sdd=new ScoreDetailsDao();
		try {
			List<ScoreDetailsPojo> sdp=sdd.filterbyPOF(pof);
			req.setAttribute("passfail", sdp);
			RequestDispatcher rd=req.getRequestDispatcher("filterExamsByPOF.jsp");
			rd.forward(req, resp);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
