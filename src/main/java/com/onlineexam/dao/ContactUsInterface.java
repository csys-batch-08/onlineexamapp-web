package com.onlineexam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.ContactUsPojo;

public interface ContactUsInterface {
	public void insertcomments(ContactUsPojo cup) throws SQLException;
	public List<ContactUsPojo> showCommentsAdmin() throws SQLException;
}
