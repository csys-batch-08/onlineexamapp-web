package com.onlineexam.controller;
import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.onlineexam.impl.RegisterDao;
import com.onlineexam.impl.ScoreDetailsDao;
import com.onlineexam.model.RegisterPojo;
import com.onlineexam.model.ScoreDetailsPojo;

@WebServlet("/scoreDetails")
public class ScoreDetailsServlet extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
		int userId=Integer.parseInt(req.getParameter("uID"));
		int ExamId=Integer.parseInt(req.getParameter("examId"));
		String ExamName=req.getParameter("examName");
		int score=Integer.parseInt(req.getParameter("score"));
		String passOrFail=req.getParameter("passOrFail");
		String grade=req.getParameter("grade");
		ScoreDetailsPojo sd=new ScoreDetailsPojo(userId,ExamId,ExamName,score,passOrFail,grade);
		//RegisterPojo rp=new RegisterPojo(userId);
		ScoreDetailsDao sdd=new ScoreDetailsDao();
		//RegisterDao rd=new RegisterDao();
		try {
			sdd.insertScore(sd);
			//rd.updatelastdate(rp);
			res.sendRedirect("ExamResult.jsp?userid="+userId+"&examid="+ExamId+"&examName="+ExamName+"&score="+score+"&passfail="+passOrFail+"&grade="+grade);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
