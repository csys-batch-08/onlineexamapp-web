package com.onlineexam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.FeedbackDetailsPojo;

public interface FeedbackDetailsDaoInterface {
	public void insertFeedback(FeedbackDetailsPojo fdp) throws SQLException;
	public List<FeedbackDetailsPojo> showFeedbacksAdmin() throws SQLException;
	public List<FeedbackDetailsPojo> showFeedbacks(int userid,String username) throws SQLException;
}
