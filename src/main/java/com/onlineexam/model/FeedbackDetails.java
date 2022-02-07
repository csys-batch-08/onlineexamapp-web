package com.onlineexam.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class FeedbackDetails implements Serializable {
	private int feedbackId;
	private int userId;
	private String userName;
	private int examId;
	private String feedback;
	private LocalDateTime feedbackDate;

	public int getFeedbackid() {
		return feedbackId;
	}

	public void setFeedbackid(int feedbackid) {
		this.feedbackId = feedbackid;
	}

	public int getUserid() {
		return userId;
	}

	public void setUserid(int userid) {
		this.userId = userid;
	}

	public int getExamid() {
		return examId;
	}

	public void setExamid(int examid) {
		this.examId = examid;
	}

	public LocalDateTime getFeedbackdate() {
		return feedbackDate;
	}

	public void setFeedbackdate(LocalDateTime feedbackdate) {
		this.feedbackDate = feedbackdate;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public FeedbackDetails(int userid, int examid, String feedback) {
		super();
		this.userId = userid;
		this.examId = examid;
		this.feedback = feedback;
	}

	public FeedbackDetails(int examid, String feedback, LocalDateTime feedbackdate, String username) {
		super();
		this.examId = examid;
		this.feedback = feedback;
		this.feedbackDate = feedbackdate;
		this.userName = username;
	}

	public FeedbackDetails() {
	}

	@Override
	public String toString() {
		return "FeedbackDetailsPojo [examid=" + examId + ", feedback=" + feedback + ", feedbackdate=" + feedbackDate
				+ "]";
	}

	public FeedbackDetails(int feedbackid, int userid, int examid, String feedback, LocalDateTime feedbackdate) {
		super();
		this.feedbackId = feedbackid;
		this.userId = userid;
		this.examId = examid;
		this.feedback = feedback;
		this.feedbackDate = feedbackdate;
	}

}
