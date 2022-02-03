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

public class ExamDetailsDao implements ExamDetailsDaoInterface {
	public int addExam(ExamDetailsPojo edp) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		String query = "insert into examDetails(examName,examType,difficultyLevel,durationMinutes) values(?,?,?,?)";
		int i = 0;
		try {
			con = ConnectionPage.connection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, edp.getExamName());
			pstmt.setString(2, edp.getExamType());
			pstmt.setString(3, edp.getDifficultyLevel());
			pstmt.setInt(4, edp.getDurationMinutes());
			i = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return i;

	}

	public boolean updateExam(ExamDetailsPojo edp) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean flag = false;
		int j;
		try {
			con = ConnectionPage.connection();
			String updatequery = "update examDetails set difficultylevel=?,durationMinutes=? where examid=?";
			pstmt = con.prepareStatement(updatequery);
			pstmt.setString(1, edp.getDifficultyLevel());
			pstmt.setInt(2, edp.getDurationMinutes());
			pstmt.setInt(3, edp.getExamId());
			j = pstmt.executeUpdate();
			if (j > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return flag;
	}

	public boolean deleteExam(ExamDetailsPojo edp) throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean flag = false;
		int k;
		try {
			con = ConnectionPage.connection();
			String query = "delete from examDetails where examId=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, edp.getExamId());
			k = pstmt.executeUpdate();
			if (k > 0) {
				flag = true;
			} else {
				flag = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return flag;
	}

	public ExamDetailsPojo showExams() throws SQLException {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ExamDetailsPojo edpojo=null;
		try {
			con = ConnectionPage.connection();
			String query = "select examId,examName,examType,difficultyLevel,durationMinutes from examDetails";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				edpojo=new ExamDetailsPojo(rs.getInt("examId"), rs.getString("examName"), rs.getString("examType"),
						rs.getString("difficultyLevel"), rs.getInt("durationMinutes"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
			if (rs != null) {
				rs.close();
			}
		}
		return edpojo;
	}

	public List<ExamDetailsPojo> showAllExams() throws SQLException {
		List<ExamDetailsPojo> edp = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select examId,examName,examType,difficultyLevel,durationMinutes from examDetails";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ExamDetailsPojo edpp = new ExamDetailsPojo(rs.getInt("examId"), rs.getString("examName"), rs.getString("examType"),
						rs.getString("difficultyLevel"), rs.getInt("durationMinutes"));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
			if (rs != null) {
				rs.close();
			}
		}
		return edp;
	}

	public List<ExamDetailsPojo> showExamsEasy() throws SQLException {
		List<ExamDetailsPojo> edp = new ArrayList<>();
		PreparedStatement pstmt = null;
		Connection con = null;
		String query = "select examId,examName,examType,difficultyLevel,durationMinutes from examDetails where difficultyLevel='Easy'";
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ExamDetailsPojo edpp = new ExamDetailsPojo(rs.getInt("examId"), rs.getString("examName"), rs.getString("examType"),
						rs.getString("difficultyLevel"), rs.getInt("durationMinutes"));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
			if (rs != null) {
				rs.close();
			}
		}
		return edp;
	}

	public List<ExamDetailsPojo> showExamsHard() throws SQLException {
		List<ExamDetailsPojo> edp = new ArrayList<>();
		PreparedStatement pstmt = null;
		Connection con = null;
		String query = "select examId,examName,examType,difficultyLevel,durationMinutes from examDetails where difficultyLevel='Hard'";
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ExamDetailsPojo edpp = new ExamDetailsPojo(rs.getInt("examId"), rs.getString("examName"), rs.getString("examType"),
						rs.getString("difficultyLevel"), rs.getInt("durationMinutes"));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
			if (rs != null) {
				rs.close();
			}
		}
		return edp;
	}
	public List<ExamDetailsPojo> showExistExams(String examName,String examType,String difficultyLevel) throws SQLException {
		List<ExamDetailsPojo> edp = new ArrayList<>();
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rs = null;
		String query = "select examName,examType,difficultyLevel from examDetails where examName=? and examType=? and difficultyLevel=?";
		try {
			con = ConnectionPage.connection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, examName);
			pstmt.setString(2, examType);
			pstmt.setString(3, difficultyLevel);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ExamDetailsPojo edpp = new ExamDetailsPojo(rs.getString("examName"), rs.getString("examType"),
						rs.getString("difficultyLevel"));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
			if (rs != null) {
				rs.close();
			}
		}
		return edp;
	}
}
