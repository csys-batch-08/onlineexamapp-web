package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.model.FeedbackDetails;

public interface FeedbackDetailsDao {
	public void insertFeedback(FeedbackDetails fdp);

	public List<FeedbackDetails> showFeedbacksAdmin();

	public List<FeedbackDetails> showFeedbacks(int userid, String username);
}
