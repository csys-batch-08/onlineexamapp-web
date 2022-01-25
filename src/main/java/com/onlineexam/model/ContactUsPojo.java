package com.onlineexam.model;

import java.util.Date;

public class ContactUsPojo {
	private int userid;
	private String email;
	private String comments;
	private Date commentdate;
	
	
	
	public Date getCommentdate() {
		return commentdate;
	}
	public void setCommentdate(Date commentdate) {
		this.commentdate = commentdate;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public ContactUsPojo(int userid, String email, String comments) {
		super();
		this.userid = userid;
		this.email = email;
		this.comments = comments;
	}
	public ContactUsPojo(int userid, String email, String comments, Date commentdate) {
		super();
		this.userid = userid;
		this.email = email;
		this.comments = comments;
		this.commentdate = commentdate;
	}
	
	

}
