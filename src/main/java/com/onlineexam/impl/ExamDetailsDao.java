package com.onlineexam.impl;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.ExamDetailsDaoInterface;
import com.onlineexam.model.ExamDetailsPojo;
import com.onlineexam.util.ConnectionPage;
public class ExamDetailsDao implements ExamDetailsDaoInterface{
	static int i;
	public  boolean addExam(ExamDetailsPojo edp) throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="insert into examDetails(examName,examType,difficultyLevel,durationMinutes) values(?,?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, edp.getExamName());
			pstmt.setString(2, edp.getExamType());
			pstmt.setString(3, edp.getDifficultyLevel());
			pstmt.setInt(4, edp.getDurationMinutes());
			i=pstmt.executeUpdate();
			if(i>0) {
				return true;
			}
			else {
				return false;
			}
	}
	public  boolean updateExam(ExamDetailsPojo edp) throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="update examDetails set difficultylevel=?,durationMinutes=? where examid=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setString(1, edp.getDifficultyLevel());
			pstmt.setInt(2, edp.getDurationMinutes());
			pstmt.setInt(3, edp.getExamId());
			i=pstmt.executeUpdate();
			if(i>0) {
				return true;
			}
			else {
				return false;
			}
	}
	public  boolean deleteExam(ExamDetailsPojo edp) throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="delete from examDetails where examId=?";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, edp.getExamId());
		i=pstmt.executeUpdate();
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
	}
	public  ResultSet showExams() {
		Connection con=ConnectionPage.connection();
		String query="select examId,examName,examType,difficultyLevel,durationMinutes from examDetails";
		ResultSet rs=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	public  List<ExamDetailsPojo> showAllExams() {
		List<ExamDetailsPojo> edp=new ArrayList<ExamDetailsPojo>();
		Connection con=ConnectionPage.connection();
		String query="select examId,examName,examType,difficultyLevel,durationMinutes from examDetails";
		ResultSet rs=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ExamDetailsPojo edpp=new ExamDetailsPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return edp;
	}
	public  List<ExamDetailsPojo> showExamsEasy() {
		List<ExamDetailsPojo> edp=new ArrayList<ExamDetailsPojo>();
		Connection con=ConnectionPage.connection();
		String query="select examId,examName,examType,difficultyLevel,durationMinutes from examDetails where difficultyLevel='Easy'";
		ResultSet rs=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ExamDetailsPojo edpp=new ExamDetailsPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return edp;
	}
	public  List<ExamDetailsPojo> showExamsHard() {
		List<ExamDetailsPojo> edp=new ArrayList<ExamDetailsPojo>();
		Connection con=ConnectionPage.connection();
		String query="select examId,examName,examType,difficultyLevel,durationMinutes from examDetails where difficultyLevel='Hard'";
		ResultSet rs=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				ExamDetailsPojo edpp=new ExamDetailsPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return edp;
	}
	public  ResultSet showExamsDetails(ExamDetailsPojo edp) {
		Connection con=ConnectionPage.connection();
		String query="select * from examDetails where examId=?";
		ResultSet rs=null;
		try {
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1, edp.getExamId());
			rs=pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
