package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.model.ScoreDetails;

public interface ScoreDetailsDao {
	public void insertScore(ScoreDetails sd);

	public List<ScoreDetails> viewScore(int studentId);

	public List<ScoreDetails> filterbydate(String date);

	public List<ScoreDetails> filterbygrade(String grade);

	public List<ScoreDetails> filterbyPOF(String pof);

	public List<ScoreDetails> viewAllScore();

	public ScoreDetails viewUserScore(ScoreDetails sd);
}
