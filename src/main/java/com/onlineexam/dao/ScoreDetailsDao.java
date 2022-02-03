package com.onlineexam.dao;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.ScoreDetails;

public interface ScoreDetailsDao {
	public void insertScore(ScoreDetails sd) throws SQLException;

	public List<ScoreDetails> viewScore(int studentId) throws SQLException;

	public List<ScoreDetails> filterbydate(String date) throws SQLException;

	public List<ScoreDetails> filterbygrade(String grade) throws SQLException;

	public List<ScoreDetails> filterbyPOF(String pof) throws SQLException;

	public List<ScoreDetails> viewAllScore() throws SQLException;
}
