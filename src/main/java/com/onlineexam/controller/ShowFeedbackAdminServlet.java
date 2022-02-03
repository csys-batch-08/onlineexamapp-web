package com.onlineexam.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.FeedbackDetailsDaoImpl;
import com.onlineexam.model.FeedbackDetails;

@WebServlet("/ShowFeedbackAdmin")
public class ShowFeedbackAdminServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		FeedbackDetailsDaoImpl fdd = new FeedbackDetailsDaoImpl();
		List<FeedbackDetails> fdp = fdd.showFeedbacksAdmin();
		req.setAttribute("showfeedback", fdp);
		RequestDispatcher rd = req.getRequestDispatcher("showFeedbackAdmin.jsp");
		rd.forward(req, resp);
	}
}
