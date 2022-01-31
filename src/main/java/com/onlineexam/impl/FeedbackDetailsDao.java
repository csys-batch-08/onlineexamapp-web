package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public List<FeedbackDetailsPojo> showFeedbacks(int userid,String username) throws SQLException {
		List<FeedbackDetailsPojo> fdp=new ArrayList<FeedbackDetailsPojo>();
		Connection con=ConnectionPage.connection();
		String query="select examid,feedback,feedbackdate from feedbackDetails where userid=? order by feedbackdate desc";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, userid);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			FeedbackDetailsPojo fdp1=new FeedbackDetailsPojo(rs.getInt(1), rs.getString(2), rs.getDate(3),username);
			fdp.add(fdp1);
		}
		
		return fdp;
	}
	public List<FeedbackDetailsPojo> showFeedbacksAdmin() throws SQLException {
		List<FeedbackDetailsPojo> fdp=new ArrayList<FeedbackDetailsPojo>();
		Connection con=ConnectionPage.connection();
		String query="select feedbackid,userid,examid,feedback,feedbackdate from feedbackDetails order by feedbackdate desc";
		PreparedStatement pstmt=con.prepareStatement(query);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			FeedbackDetailsPojo fdp1=new FeedbackDetailsPojo(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getString(4),rs.getDate(5));
			fdp.add(fdp1);
		}
		return fdp;
	}
	
	
}
