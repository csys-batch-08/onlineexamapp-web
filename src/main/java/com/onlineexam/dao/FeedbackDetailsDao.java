package com.onlineexam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.FeedbackDetails;

public interface FeedbackDetailsDao {
	public void insertFeedback(FeedbackDetails fdp) throws SQLException;

	public List<FeedbackDetails> showFeedbacksAdmin() throws SQLException;

	public List<FeedbackDetails> showFeedbacks(int userid, String username) throws SQLException;
}
