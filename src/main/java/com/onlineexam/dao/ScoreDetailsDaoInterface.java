package com.onlineexam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.ScoreDetailsPojo;

public interface ScoreDetailsDaoInterface {
	public  void insertScore(ScoreDetailsPojo sd) throws SQLException;
	public List<ScoreDetailsPojo> viewScore(int studentId) throws SQLException;
	public  ResultSet filterbydate(ScoreDetailsPojo sd) throws SQLException;
	public  ResultSet filterbygrade(ScoreDetailsPojo sd) throws SQLException;
	public  ResultSet filterbyPOF(ScoreDetailsPojo sd) throws SQLException;
	public  ResultSet viewAllScore() throws SQLException ;
}
