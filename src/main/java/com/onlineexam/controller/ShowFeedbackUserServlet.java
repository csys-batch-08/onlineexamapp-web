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

import com.onlineexam.impl.FeedbackDetailsDaoImpl;
import com.onlineexam.model.FeedbackDetails;

@WebServlet("/showfeedback")
public class ShowFeedbackUserServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		int userid = (int) session.getAttribute("userid");
		FeedbackDetailsDaoImpl fdd = new FeedbackDetailsDaoImpl();
		FeedbackDetails fdpp = new FeedbackDetails();
		String username = (String) session.getAttribute("username");
		fdpp.setUsername(username);
		List<FeedbackDetails> fdp = fdd.showFeedbacks(userid, username);
		req.setAttribute("feedback", fdp);
		RequestDispatcher rd = req.getRequestDispatcher("showFeedback.jsp");
		rd.forward(req, resp);
	}
}
