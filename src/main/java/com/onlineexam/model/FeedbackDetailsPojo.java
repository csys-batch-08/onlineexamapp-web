package com.onlineexam.model;

import java.util.Date;

public class FeedbackDetailsPojo {
	private int userid;
	private int examid;
	private String feedback;
	private Date feedbackdate;
	
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

	public FeedbackDetailsPojo(int userid, int examid, String feedback) {
		super();
		this.userid = userid;
		this.examid = examid;
		this.feedback = feedback;
	}

	public FeedbackDetailsPojo(int examid, String feedback, Date feedbackdate) {
		super();
		this.examid = examid;
		this.feedback = feedback;
		this.feedbackdate = feedbackdate;
	}

	@Override
	public String toString() {
		return "FeedbackDetailsPojo [examid=" + examid + ", feedback=" + feedback + ", feedbackdate=" + feedbackdate
				+ "]";
	}


}
