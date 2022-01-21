package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.ExamDetailsDao;
import com.onlineexam.model.ExamDetailsPojo;

@WebServlet("/updateExamDetails")
public class UpdateExamDetailsServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		HttpSession session1=req.getSession();
		int examId=Integer.parseInt(req.getParameter("examid").toString());
		String difficultyLevel=req.getParameter("difficultyLevel");
		int durationMinutes=Integer.parseInt(req.getParameter("durationMinutes"));
		
		ExamDetailsPojo edp=new ExamDetailsPojo(difficultyLevel,durationMinutes,examId);
		ExamDetailsDao ed=new ExamDetailsDao();
		HttpSession session=req.getSession();
		
		try {
			boolean flag=ed.updateExam(edp);
			if(flag) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Exam updated successfully');");
				out.println("location='ShowExams.jsp';");
				out.println("</script>");
//				session.setAttribute("updateExamResult","Exam updated successfully");
//				res.sendRedirect("ShowExams.jsp");
			}
			else {
				session.setAttribute("updateExamResult","Couldn't update exam");
				res.sendRedirect("ShowExams.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
