package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.FeedbackDetailsDao;
import com.onlineexam.logger.Logger;
import com.onlineexam.model.FeedbackDetails;
import com.onlineexam.util.ConnectionPage;

public class FeedbackDetailsDaoImpl implements FeedbackDetailsDao {
	@Override
	public void insertFeedback(FeedbackDetails fdp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPage.connection();
			String query = "insert into feedbackDetails(userId,examId,feedback,FeedbackDate) values(?,?,?,sysdate)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, fdp.getUserid());
			pstmt.setInt(2, fdp.getExamid());
			pstmt.setString(3, fdp.getFeedback());
			pstmt.executeQuery();
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(null, pstmt, con);
		}
	}

	@Override
	public List<FeedbackDetails> showFeedbacks(int userid, String username) {
		List<FeedbackDetails> fdp = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select examid,feedback,feedbackdate from feedbackDetails where userid=? order by feedbackdate desc";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, userid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				FeedbackDetails fdp1 = new FeedbackDetails(rs.getInt("examid"), rs.getString("feedback"),
						rs.getTimestamp("feedbackdate").toLocalDateTime(), username);
				fdp.add(fdp1);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(rs, pstmt, con);
		}
		return fdp;
	}

	@Override
	public List<FeedbackDetails> showFeedbacksAdmin() {
		List<FeedbackDetails> fdp = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select feedbackid,userid,examid,feedback,feedbackdate from feedbackDetails order by feedbackdate desc";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				FeedbackDetails fdp1 = new FeedbackDetails(rs.getInt("feedbackid"), rs.getInt("userid"),
						rs.getInt("examid"), rs.getString("feedback"),
						rs.getTimestamp("feedbackdate").toLocalDateTime());
				fdp.add(fdp1);
			}
		} catch (Exception e) {

			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());

		} finally {

			ConnectionPage.close(rs, pstmt, con);
		}
		return fdp;
	}

}
