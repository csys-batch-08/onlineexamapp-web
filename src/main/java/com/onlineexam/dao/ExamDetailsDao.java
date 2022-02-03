package com.onlineexam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.ExamDetails;

public interface ExamDetailsDao {
	public int addExam(ExamDetails edp) throws SQLException;

	public boolean updateExam(ExamDetails edp) throws SQLException;

	public boolean deleteExam(ExamDetails edp) throws SQLException;

	public ExamDetails showExams() throws SQLException;

	public List<ExamDetails> showAllExams() throws SQLException;

	public List<ExamDetails> showExamsEasy() throws SQLException;

	public List<ExamDetails> showExamsHard() throws SQLException;
}
