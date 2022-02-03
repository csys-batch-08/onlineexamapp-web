package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.ScoreDetailsDao;
import com.onlineexam.model.ScoreDetails;
import com.onlineexam.util.ConnectionPage;

public class ScoreDetailsDaoImpl implements ScoreDetailsDao {
	@Override
	public void insertScore(ScoreDetails sd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPage.connection();
			String query = "insert into scoreDetails(studentid,examid,examname,score,passorfail,grade,examdate) values(?,?,?,?,?,?,sysdate)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, sd.getStudentId());
			pstmt.setInt(2, sd.getExamId());
			pstmt.setString(3, sd.getExamName());
			pstmt.setInt(4, sd.getScore());
			pstmt.setString(5, sd.getPassOrFail());
			pstmt.setString(6, sd.getGrade());
			pstmt.executeUpdate();
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
	public List<ScoreDetails> viewScore(int studentId) {
		List<ScoreDetails> sdp = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select studentid,examid,examname,score,passorfail,grade,examdate from scoreDetails where studentId=? order by examdate desc";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, studentId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreDetails sdpp = new ScoreDetails(rs.getInt("studentid"), rs.getInt("examid"),
						rs.getString("examname"), rs.getInt("score"), rs.getString("passorfail"), rs.getString("grade"),
						rs.getTimestamp("examdate").toLocalDateTime());
				sdp.add(sdpp);
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
		return sdp;
	}

	@Override
	public List<ScoreDetails> filterbydate(String date) {
		List<ScoreDetails> sdp = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select studentid,examid,examname,score,passorfail,grade,examdate from scoreDetails where to_char(trunc(examdate),'yyyy-mm-dd')=? order by examdate desc";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, date);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreDetails sdpp = new ScoreDetails(rs.getInt("studentid"), rs.getInt("examid"),
						rs.getString("examname"), rs.getInt("score"), rs.getString("passorfail"), rs.getString("grade"),
						rs.getTimestamp("examdate").toLocalDateTime());
				sdp.add(sdpp);
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
		return sdp;

	}

	@Override
	public List<ScoreDetails> filterbyPOF(String pof) {
		List<ScoreDetails> sdp = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select studentid,examid,examname,score,passorfail,grade,examdate from scoreDetails where passOrFail=? order by examdate desc";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, pof);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreDetails sdpp = new ScoreDetails(rs.getInt("studentid"), rs.getInt("examid"),
						rs.getString("examname"), rs.getInt("score"), rs.getString("passorfail"), rs.getString("grade"),
						rs.getTimestamp("examdate").toLocalDateTime());
				sdp.add(sdpp);
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
		return sdp;
	}

	@Override
	public List<ScoreDetails> filterbygrade(String grade) {
		List<ScoreDetails> sdp = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select studentid,examid,examname,score,passorfail,grade,examdate from scoreDetails where grade=? order by examdate desc";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, grade);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreDetails sdpp = new ScoreDetails(rs.getInt("studentid"), rs.getInt("examid"),
						rs.getString("examname"), rs.getInt("score"), rs.getString("passorfail"), rs.getString("grade"),
						rs.getTimestamp("examdate").toLocalDateTime());
				sdp.add(sdpp);
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
		return sdp;
	}

	@Override
	public List<ScoreDetails> viewAllScore() {
		List<ScoreDetails> sdp = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select studentid,examid,examname,score,passorfail,grade,examdate from scoreDetails order by examdate desc";
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreDetails sdpp = new ScoreDetails(rs.getInt("studentid"), rs.getInt("examid"),
						rs.getString("examname"), rs.getInt("score"), rs.getString("passorfail"), rs.getString("grade"),
						rs.getTimestamp("examdate").toLocalDateTime());
				sdp.add(sdpp);
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
		return sdp;
	}
}
