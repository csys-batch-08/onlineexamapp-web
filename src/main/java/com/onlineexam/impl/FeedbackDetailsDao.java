package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.catalina.connector.Request;

import com.onlineexam.dao.FeedbackDetailsDaoInterface;
import com.onlineexam.model.FeedbackDetailsPojo;
import com.onlineexam.util.ConnectionPage;

public class FeedbackDetailsDao implements FeedbackDetailsDaoInterface{
	public void insertFeedback(FeedbackDetailsPojo fdp) throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="insert into feedbackDetails(userId,examId,feedback,FeedbackDate) values(?,?,?,sysdate)";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, fdp.getUserid());
		pstmt.setInt(2, fdp.getExamid());
		pstmt.setString(3, fdp.getFeedback());
		pstmt.executeQuery();
	}
//	public ResultSet showFeedback(int userid) throws SQLException {
//		Connection con=ConnectionPage.connection();
//		String query="select * from feedbackDetails where userid="+userid+" order by feedbackdate desc";
//		PreparedStatement pstmt=con.prepareStatement(query);
//		ResultSet rs=pstmt.executeQuery();
//		return rs;
//	}
	public List<FeedbackDetailsPojo> showFeedbacks(int userid,String username) throws SQLException {
		List<FeedbackDetailsPojo> fdp=new ArrayList<FeedbackDetailsPojo>();
		Connection con=ConnectionPage.connection();
		String query="select examid,feedback,feedbackdate from feedbackDetails where userid="+userid+" order by feedbackdate desc";
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			FeedbackDetailsPojo fdp1=new FeedbackDetailsPojo(rs.getInt(1), rs.getString(2), rs.getDate(3),username);
			fdp.add(fdp1);
		}
		
		return fdp;
	}
	public ResultSet showFeedbackAdmin() throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="select * from feedbackDetails order by feedbackdate desc";
		PreparedStatement pstmt=con.prepareStatement(query);
		ResultSet rs=pstmt.executeQuery();
		return rs;
	}
	@Override
	public ResultSet showFeedback(int userid) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
