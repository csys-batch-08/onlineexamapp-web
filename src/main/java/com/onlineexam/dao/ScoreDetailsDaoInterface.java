package com.onlineexam.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.ScoreDetailsPojo;

public interface ScoreDetailsDaoInterface {
	public  void insertScore(ScoreDetailsPojo sd) throws SQLException;
	public List<ScoreDetailsPojo> viewScore(int studentId) throws SQLException;
	public  List<ScoreDetailsPojo> filterbydate(String date) throws SQLException;
	public  List<ScoreDetailsPojo> filterbygrade(String grade) throws SQLException;
	public  List<ScoreDetailsPojo> filterbyPOF(String pof) throws SQLException;
	public List<ScoreDetailsPojo> viewAllScore() throws SQLException;
}
