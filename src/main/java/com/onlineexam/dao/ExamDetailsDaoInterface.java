package com.onlineexam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.ExamDetailsPojo;

public interface ExamDetailsDaoInterface {
	public  boolean addExam(ExamDetailsPojo edp) throws SQLException ;
	public   boolean updateExam(ExamDetailsPojo edp) throws SQLException;
	public  boolean deleteExam(ExamDetailsPojo edp) throws SQLException;
	public  List<ExamDetailsPojo> showExamsEasy();
	public  List<ExamDetailsPojo> showExamsHard();
	public  ResultSet showExamsDetails(ExamDetailsPojo edp);
}
