package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.ExamDetailsDao;
import com.onlineexam.logger.Logger;
import com.onlineexam.model.ExamDetails;
import com.onlineexam.util.ConnectionPage;

public class ExamDetailsDaoImpl implements ExamDetailsDao {
	private static final String DURATION_MINUTES = "durationMinutes";
	private static final String DIFFICULTY_LEVEL = "difficultyLevel";
	private static final String EXAM_TYPE = "examType";
	private static final String EXAM_NAME = "examName";
	private static final String EXAM_ID = "examId";

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
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(null, pstmt, con);
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
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(null, pstmt, con);
		}
		return flag;
	}

	@Override
	public boolean deleteExam(ExamDetails edp) throws SQLException {
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
		} finally {

			ConnectionPage.close(null, pstmt, con);
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
				edpojo = new ExamDetails(rs.getInt(EXAM_ID), rs.getString(EXAM_NAME), rs.getString(EXAM_TYPE),
						rs.getString(DIFFICULTY_LEVEL), rs.getInt(DURATION_MINUTES));
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(rs, pstmt, con);
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
				ExamDetails edpp = new ExamDetails(rs.getInt(EXAM_ID), rs.getString(EXAM_NAME), rs.getString(EXAM_TYPE),
						rs.getString(DIFFICULTY_LEVEL), rs.getInt(DURATION_MINUTES));
				edp.add(edpp);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(rs, pstmt, con);
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
				ExamDetails edpp = new ExamDetails(rs.getInt(EXAM_ID), rs.getString(EXAM_NAME), rs.getString(EXAM_TYPE),
						rs.getString(DIFFICULTY_LEVEL), rs.getInt(DURATION_MINUTES));
				edp.add(edpp);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(rs, pstmt, con);
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
				ExamDetails edpp = new ExamDetails(rs.getInt(EXAM_ID), rs.getString(EXAM_NAME), rs.getString(EXAM_TYPE),
						rs.getString(DIFFICULTY_LEVEL), rs.getInt(DURATION_MINUTES));
				edp.add(edpp);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(rs, pstmt, con);
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
				ExamDetails edpp = new ExamDetails(rs.getString(EXAM_NAME), rs.getString(EXAM_TYPE),
						rs.getString(DIFFICULTY_LEVEL));
				edp.add(edpp);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(rs, pstmt, con);
		}
		return edp;
	}
}
