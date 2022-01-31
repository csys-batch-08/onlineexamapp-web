package com.onlineexam.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.onlineexam.exception.ExamNotDeleteException;
import com.onlineexam.impl.ExamDetailsDao;
import com.onlineexam.model.ExamDetailsPojo;

@WebServlet("/deleteExamServlet")
public class DeleteExamDetailsServlet extends HttpServlet {
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) {
		PrintWriter out=null;
		try {
		out=res.getWriter();
		int examId=Integer.parseInt(req.getParameter("examid"));
		ExamDetailsPojo edp=new ExamDetailsPojo(examId);
		ExamDetailsDao ed=new ExamDetailsDao();
			boolean flag=ed.deleteExam(edp);
			if(flag) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Exam deleted successfully');");
				out.println("location='ShowExams';");
				out.println("</script>");
			}
			else {
				throw new ExamNotDeleteException();
			}
		}
		
		catch (SQLException e) {
			try {
				throw new ExamNotDeleteException();
			}
			catch(ExamNotDeleteException end) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Exam already registered, so could not delete');");
				out.println("location='ShowExams';");
				out.println("</script>");
			}
			
			e.printStackTrace();
		}catch(IOException e2) {
			e2.printStackTrace();
		}catch(NumberFormatException e3) {
			e3.printStackTrace();
		}
	}
}
