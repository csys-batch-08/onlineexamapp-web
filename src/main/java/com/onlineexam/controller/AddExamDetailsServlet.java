package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.impl.ExamDetailsDao;
import com.onlineexam.model.ExamDetailsPojo;


@WebServlet("/addExamDetails")
public class AddExamDetailsServlet extends HttpServlet {
	//method for adding exam
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
		PrintWriter out=res.getWriter();
		String examName=req.getParameter("examName");
		String examType=req.getParameter("examType");
		String difficultyLevel=req.getParameter("difficultyLevel");
		int durationMinutes=Integer.parseInt(req.getParameter("durationMinutes"));
		
		ExamDetailsPojo edp=new ExamDetailsPojo(examName,examType,difficultyLevel,durationMinutes);
		ExamDetailsDao ed=new ExamDetailsDao();
		HttpSession session=req.getSession();
		ResultSet rs=ed.showExams();
		try {
			rs.next();
			int duration=rs.getInt(5);
			session.setAttribute("duration", duration);
			boolean flag=ed.addExam(edp);
			if(flag) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Exam added successfully');");
				out.println("location='ShowExams';");
				out.println("</script>");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

}
