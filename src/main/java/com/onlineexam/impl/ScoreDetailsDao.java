package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.*;
import com.onlineexam.model.ScoreDetailsPojo;
import com.onlineexam.util.ConnectionPage;
public class ScoreDetailsDao implements ScoreDetailsDaoInterface{
	public void insertScore(ScoreDetailsPojo sd) throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="insert into scoreDetails(studentid,examid,examname,score,passorfail,grade,examdate) values(?,?,?,?,?,?,sysdate)";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, sd.getStudentId());
		pstmt.setInt(2, sd.getExamId());
		pstmt.setString(3, sd.getExamName());
		pstmt.setInt(4, sd.getScore());
		pstmt.setString(5, sd.getPassOrFail());
		pstmt.setString(6, sd.getGrade());
		pstmt.executeUpdate();
	}
//	public ResultSet viewScore(int studentId) throws SQLException {
//		Connection con=ConnectionPage.connection();
//		String query="select * from scoreDetails where studentId=? order by examdate desc";
//		PreparedStatement pstmt=con.prepareStatement(query);
//		pstmt.setInt(1, studentId);
//		ResultSet rs=pstmt.executeQuery();
//		return rs;
//	}
	public List<ScoreDetailsPojo> viewScore(int studentId) throws SQLException {
		List<ScoreDetailsPojo> sdp=new ArrayList<ScoreDetailsPojo>();
		Connection con=ConnectionPage.connection();
		String query="select studentid,examid,examname,score,passorfail,grade,examdate from scoreDetails where studentId=? order by examdate desc";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, studentId);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			ScoreDetailsPojo sdpp=new ScoreDetailsPojo(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getString(6),rs.getDate(7));
			sdp.add(sdpp);
		}
		return sdp;
	}
	public  ResultSet filterbydate(ScoreDetailsPojo sd) throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="select * from scoreDetails where to_char(trunc(examdate),'yyyy-mm-dd')=? order by examdate desc";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setDate(1, (Date) sd.getExamdate());
		ResultSet rs=pstmt.executeQuery();
		return rs;
	}
	public  ResultSet filterbygrade(ScoreDetailsPojo sd) throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="select * from scoreDetails where grade=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, sd.getGrade());
		ResultSet rs=pstmt.executeQuery();
		return rs;
	}
	public  ResultSet filterbyPOF(ScoreDetailsPojo sd) throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="select * from scoreDetails where passOrFail=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setString(1, sd.getPassOrFail());
		ResultSet rs=pstmt.executeQuery();
		return rs;
	}
	public  ResultSet viewAllScore() throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="select * from scoreDetails order by examdate desc";
		ResultSet rs=null;
		try {
			Statement st=con.createStatement();
			rs=st.executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
