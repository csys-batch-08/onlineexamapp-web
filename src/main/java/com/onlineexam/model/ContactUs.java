package com.onlineexam.model;

import java.time.LocalDateTime;

public class ContactUs {
	private int userId;
	private String email;
	private String comments;
	private LocalDateTime commentDate;

	public LocalDateTime getCommentdate() {
		return commentDate;
	}

	public void setCommentdate(LocalDateTime commentdate) {
		this.commentDate = commentdate;
	}

	public int getUserid() {
		return userId;
	}

	public void setUserid(int userid) {
		this.userId = userid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public ContactUs(int userid, String email, String comments) {
		super();
		this.userId = userid;
		this.email = email;
		this.comments = comments;
	}

	public ContactUs(int userid, String email, String comments, LocalDateTime commentdate) {
		super();
		this.userId = userid;
		this.email = email;
		this.comments = comments;
		this.commentDate = commentdate;
	}

}
