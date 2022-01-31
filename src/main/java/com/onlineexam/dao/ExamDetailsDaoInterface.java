package com.onlineexam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.ExamDetailsPojo;

public interface ExamDetailsDaoInterface {
	public  int addExam(ExamDetailsPojo edp) throws SQLException ;
	public  boolean updateExam(ExamDetailsPojo edp) throws SQLException;
	public  boolean deleteExam(ExamDetailsPojo edp) throws SQLException;
	public ExamDetailsPojo showExams() throws SQLException ;
	public  List<ExamDetailsPojo> showAllExams() throws SQLException;
	public  List<ExamDetailsPojo> showExamsEasy() throws SQLException;
	public  List<ExamDetailsPojo> showExamsHard() throws SQLException;
}
