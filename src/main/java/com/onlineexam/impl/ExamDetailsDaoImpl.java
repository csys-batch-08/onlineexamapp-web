package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.ExamDetailsDao;
import com.onlineexam.model.ExamDetails;
import com.onlineexam.util.ConnectionPage;

public class ExamDetailsDaoImpl implements ExamDetailsDao {
	@Override
	public int addExam(ExamDetails edp) {
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
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return i;

	}

	@Override
	public boolean updateExam(ExamDetails edp) {
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
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public boolean deleteExam(ExamDetails edp) {
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
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public ExamDetails showExams() {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ExamDetails edpojo = null;
		try {
			con = ConnectionPage.connection();
			String query = "select examId,examName,examType,difficultyLevel,durationMinutes from examDetails";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				edpojo = new ExamDetails(rs.getInt("examId"), rs.getString("examName"), rs.getString("examType"),
						rs.getString("difficultyLevel"), rs.getInt("durationMinutes"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return edpojo;
	}

	@Override
	public List<ExamDetails> showAllExams() {
		List<ExamDetails> edp = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select examId,examName,examType,difficultyLevel,durationMinutes from examDetails";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ExamDetails edpp = new ExamDetails(rs.getInt("examId"), rs.getString("examName"),
						rs.getString("examType"), rs.getString("difficultyLevel"), rs.getInt("durationMinutes"));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return edp;
	}

	@Override
	public List<ExamDetails> showExamsEasy() {
		List<ExamDetails> edp = new ArrayList<>();
		PreparedStatement pstmt = null;
		Connection con = null;
		String query = "select examId,examName,examType,difficultyLevel,durationMinutes from examDetails where difficultyLevel='Easy'";
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ExamDetails edpp = new ExamDetails(rs.getInt("examId"), rs.getString("examName"),
						rs.getString("examType"), rs.getString("difficultyLevel"), rs.getInt("durationMinutes"));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return edp;
	}

	@Override
	public List<ExamDetails> showExamsHard() {
		List<ExamDetails> edp = new ArrayList<>();
		PreparedStatement pstmt = null;
		Connection con = null;
		String query = "select examId,examName,examType,difficultyLevel,durationMinutes from examDetails where difficultyLevel='Hard'";
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ExamDetails edpp = new ExamDetails(rs.getInt("examId"), rs.getString("examName"),
						rs.getString("examType"), rs.getString("difficultyLevel"), rs.getInt("durationMinutes"));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return edp;
	}

	public List<ExamDetails> showExistExams(String examName, String examType, String difficultyLevel) {
		List<ExamDetails> edp = new ArrayList<>();
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
				ExamDetails edpp = new ExamDetails(rs.getString("examName"), rs.getString("examType"),
						rs.getString("difficultyLevel"));
				edp.add(edpp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return edp;
	}
}
