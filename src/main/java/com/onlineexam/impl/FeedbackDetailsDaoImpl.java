package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.FeedbackDetailsDao;
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
						rs.getDate("feedbackdate"), username);
				fdp.add(fdp1);
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
						rs.getInt("examid"), rs.getString("feedback"), rs.getDate("feedbackdate"));
				fdp.add(fdp1);
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
		return fdp;
	}

}
