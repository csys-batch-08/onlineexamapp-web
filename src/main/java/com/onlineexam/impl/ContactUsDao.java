package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.ContactUsInterface;
import com.onlineexam.model.ContactUsPojo;
import com.onlineexam.util.ConnectionPage;

public class ContactUsDao implements ContactUsInterface {
	public void insertcomments(ContactUsPojo cup) throws SQLException {
		Connection con=ConnectionPage.connection();
		String query="insert into contactUs(userid,email,comments,commentdate) values(?,?,?,sysdate)";
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, cup.getUserid());
		pstmt.setString(2, cup.getEmail());
		pstmt.setString(3, cup.getComments());
		pstmt.executeQuery();
	}
	public List<ContactUsPojo> showCommentsAdmin() throws SQLException {
		List<ContactUsPojo> contactlist=new ArrayList<ContactUsPojo>();
		Connection con=ConnectionPage.connection();
		String query="select userid,email,comments,commentdate from contactUs order by commentdate desc";
		PreparedStatement pstmt=con.prepareStatement(query);
		ResultSet rs=pstmt.executeQuery();
		while(rs.next()) {
			ContactUsPojo cup=new ContactUsPojo(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4));
			contactlist.add(cup);
		}
		return contactlist;
	}
}
