package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.model.ContactUs;

public interface ContactUsDao {
	public int insertcomments(ContactUs cup);

	public List<ContactUs> showCommentsAdmin();
}
