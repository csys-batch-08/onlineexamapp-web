package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.ContactUsDao;
import com.onlineexam.model.ContactUs;
import com.onlineexam.util.ConnectionPage;

public class ContactUsDaoImpl implements ContactUsDao {

	@Override
	public void insertcomments(ContactUs cup) {
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			con = ConnectionPage.connection();
			String query = "insert into contactUs(userid,email,comments,commentdate) values(?,?,?,sysdate)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, cup.getUserid());
			pstmt.setString(2, cup.getEmail());
			pstmt.setString(3, cup.getComments());
			pstmt.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<ContactUs> showCommentsAdmin() {
		List<ContactUs> contactlist = new ArrayList<>();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Connection con = null;
		try {
			con = ConnectionPage.connection();
			String query = "select userid,email,comments,commentdate from contactUs order by commentdate desc";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ContactUs cup = new ContactUs(rs.getInt("userid"), rs.getString("email"),
						rs.getString("comments"), rs.getDate("commentdate"));
				contactlist.add(cup);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (con != null) {
					con.close();
				}
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return contactlist;
	}
}
