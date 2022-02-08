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

@WebServlet("/FilterExamsByPOF")
public class FilterExamsByPOFServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
		String pof = req.getParameter("pof");
		ScoreDetailsDaoImpl sdd = new ScoreDetailsDaoImpl();
		try {
			List<ScoreDetails> sdp = sdd.filterbyPOF(pof);
			req.setAttribute("passfail", sdp);
			RequestDispatcher rd = req.getRequestDispatcher("filterExamsByPOF.jsp");
			rd.forward(req, resp);
		} catch (ServletException e1) {
			e1.printStackTrace();
		} catch (IOException e2) {
			e2.printStackTrace();
		}
	}
}
