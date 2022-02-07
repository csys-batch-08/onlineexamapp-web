package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.ContactUsDao;
import com.onlineexam.logger.Logger;
import com.onlineexam.model.ContactUs;
import com.onlineexam.util.ConnectionPage;

public class ContactUsDaoImpl implements ContactUsDao {

	@Override
	public int insertcomments(ContactUs cup) {
		PreparedStatement pstmt = null;
		Connection con = null;
		int i = 0;
		try {
			con = ConnectionPage.connection();
			String query = "insert into contactUs(userid,email,comments,commentdate) values(?,?,?,sysdate)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, cup.getUserid());
			pstmt.setString(2, cup.getEmail());
			pstmt.setString(3, cup.getComments());
			i = pstmt.executeUpdate();
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(null, pstmt, con);
		}
		return i;
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
				ContactUs cup = new ContactUs(rs.getInt("userid"), rs.getString("email"), rs.getString("comments"),
						rs.getTimestamp("commentdate").toLocalDateTime());
				contactlist.add(cup);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(rs, pstmt, con);
		}
		return contactlist;
	}
}
