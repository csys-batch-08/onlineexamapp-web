package com.onlineexam.model;

import java.util.Date;

public class FeedbackDetailsPojo {
	private int feedbackid;
	private int userid;
	private String username;
	private int examid;
	private String feedback;
	private Date feedbackdate;
	
	
	
	public int getFeedbackid() {
		return feedbackid;
	}

	public void setFeedbackid(int feedbackid) {
		this.feedbackid = feedbackid;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public int getExamid() {
		return examid;
	}

	public void setExamid(int examid) {
		this.examid = examid;
	}

	

	public Date getFeedbackdate() {
		return feedbackdate;
	}

	public void setFeedbackdate(Date feedbackdate) {
		this.feedbackdate = feedbackdate;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	
	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public FeedbackDetailsPojo(int userid, int examid, String feedback) {
		super();
		this.userid = userid;
		this.examid = examid;
		this.feedback = feedback;
	}

	public FeedbackDetailsPojo(int examid, String feedback, Date feedbackdate, String username) {
		super();
		this.examid = examid;
		this.feedback = feedback;
		this.feedbackdate = feedbackdate;
		this.username=username;
	}

	public FeedbackDetailsPojo() {
	}

	@Override
	public String toString() {
		return "FeedbackDetailsPojo [examid=" + examid + ", feedback=" + feedback + ", feedbackdate=" + feedbackdate
				+ "]";
	}

	public FeedbackDetailsPojo(int feedbackid, int userid, int examid, String feedback, Date feedbackdate) {
		super();
		this.feedbackid = feedbackid;
		this.userid = userid;
		this.examid = examid;
		this.feedback = feedback;
		this.feedbackdate = feedbackdate;
	}


}
