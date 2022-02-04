package com.onlineexam.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.onlineexam.dao.RegisterDao;
import com.onlineexam.model.Register;
import com.onlineexam.util.ConnectionPage;

public class RegisterDaoImpl implements RegisterDao {
	@Override
	public int fetchregister(Register rd) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int i = 0;
		try {
			con = ConnectionPage.connection();
			String query = "insert into registerPage(first_name,last_name,email,password,confirm_password,phone_number,lastactivedate) values(?,?,?,?,?,?,sysdate)";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, rd.getFirstName());
			pstmt.setString(2, rd.getLastName());
			pstmt.setString(3, rd.getEmail());
			pstmt.setString(4, rd.getPassword());
			pstmt.setString(5, rd.getConfirmPassword());
			pstmt.setLong(6, rd.getPhoneNumber());
			i = pstmt.executeUpdate();
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
		return i;
	}

	@Override
	public boolean changepassword(Register rp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		boolean flag = false;
		int i = 0;
		String query = "update registerPage set password=?,confirm_password=? where phone_number=?";
		try {
			con = ConnectionPage.connection();
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, rp.getPassword());
			pstmt.setString(2, rp.getConfirmPassword());
			pstmt.setLong(3, rp.getPhoneNumber());
			i = pstmt.executeUpdate();
			if (i > 0) {
				flag = true;
			} else {
				flag = false;
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
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public Register getEmailDetails(Register rp) {
		Register register = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select id,first_name,last_name,email,password,confirm_password,phone_number,role,profilepicture,reason,lastactivedate from registerPage where email=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, rp.getEmail());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				register = new Register(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("email"), rs.getString("password"), rs.getString("confirm_password"),
						rs.getLong("phone_number"), rs.getString("role"), rs.getString("profilepicture"),
						rs.getString("reason"), rs.getTimestamp("lastactivedate").toLocalDateTime());
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
		return register;
	}

	@Override
	public Register getPhoneDetails(Register rp) {
		Register register = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select id,first_name,last_name,email,password,confirm_password,phone_number,role,profilepicture,reason,lastactivedate from registerPage where phone_number=?";
			pstmt = con.prepareStatement(query);
			pstmt.setLong(1, rp.getPhoneNumber());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				register = new Register(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("email"), rs.getString("password"), rs.getString("confirm_password"),
						rs.getLong("phone_number"), rs.getString("role"), rs.getString("profilepicture"),
						rs.getString("reason"), rs.getTimestamp("lastactivedate").toLocalDateTime());
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
		return register;
	}

	@Override
	public void updatestatus(Register rp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPage.connection();
			String query = "update registerPage set role='inactive' where id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, rp.getUserid());
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
	public void makeactive(Register rp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPage.connection();
			String query = "update registerPage set role='student',reason='no requests' where id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, rp.getUserid());
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
	public void changephoto(Register rp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPage.connection();
			String query = "update registerPage set profilepicture=? where id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, rp.getPhoto());
			pstmt.setInt(2, rp.getUserid());
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
	public int editprofile(Register rp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		int i = 0;
		try {
			con = ConnectionPage.connection();
			String query = "update registerPage set first_name=?,last_name=?,email=?,phone_number=? where id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, rp.getFirstName());
			pstmt.setString(2, rp.getLastName());
			pstmt.setString(3, rp.getEmail());
			pstmt.setLong(4, rp.getPhoneNumber());
			pstmt.setInt(5, rp.getUserid());
			i = pstmt.executeUpdate();
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
		return i;
	}

	@Override
	public void userrequest(Register rp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPage.connection();
			String query = "update registerPage set reason=? where email=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, rp.getReason());
			pstmt.setString(2, rp.getEmail());
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
	public void updatelastdate(Register rp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPage.connection();
			String query = "update registerPage set lastactivedate=(select max(examdate) from scoreDetails where studentId=?) where id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, rp.getUserid());
			pstmt.setInt(2, rp.getUserid());
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
	public void updateactivedate(Register rp) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPage.connection();
			String query = "update registerPage set lastactivedate=sysdate where id=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, rp.getUserid());
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
	public List<Register> showUsers() {
		List<Register> rp = new ArrayList<>();
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rs = null;
		String query = "select id,first_name,last_name,email,phone_number,lastactivedate from registerPage where role='student'";
		try {
			con = ConnectionPage.connection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Register rpojo = new Register(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("email"), rs.getLong("phone_number"),
						rs.getTimestamp("lastactivedate").toLocalDateTime());
				rp.add(rpojo);
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
		return rp;
	}

	@Override
	public List<Register> showInactiveUsers() {
		List<Register> rp = new ArrayList<>();
		Connection con = null;
		String query = "select id,first_name,last_name,email,phone_number,reason from registerPage where role='inactive'";
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		try {
			con = ConnectionPage.connection();
			pstmt = con.prepareStatement(query);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Register rpojo = new Register(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("email"), rs.getLong("phone_number"), rs.getString("reason"));
				rp.add(rpojo);
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
		return rp;
	}

	@Override
	public Register fetchlogin(Register rp) {
		Register register = null;
		PreparedStatement pstmt = null;
		Connection con = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String query = "select id,first_name,last_name,email,password,confirm_password,phone_number,role,profilepicture,reason,lastactivedate from registerPage where email=? and password=?";
			pstmt = con.prepareStatement(query);
			pstmt.setString(1, rp.getEmail());
			pstmt.setString(2, rp.getPassword());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				register = new Register(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("email"), rs.getString("password"), rs.getString("confirm_password"),
						rs.getLong("phone_number"), rs.getString("role"), rs.getString("profilepicture"),
						rs.getString("reason"), rs.getTimestamp("lastactivedate").toLocalDateTime());
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
		return register;
	}

	@Override
	public Register validUser(String email, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Register rpojo = null;
		try {
			con = ConnectionPage.connection();
			String que = "select id,first_name,last_name,email,phone_number,role from registerPage where email=? and password=?";
			pstmt = con.prepareStatement(que);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				rpojo = new Register(rs.getInt("id"), rs.getString("first_name"), rs.getString("last_name"),
						rs.getString("email"), rs.getString("role"), rs.getLong("phone_number"));
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
		return rpojo;
	}

	@Override
	public Register userprofile(int userid) {
		Register rpp = null;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = ConnectionPage.connection();
			String que = "select first_name,last_name,email,phone_number,profilepicture from registerPage where id=?";
			pstmt = con.prepareStatement(que);
			pstmt.setInt(1, userid);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				rpp = new Register(rs.getString("first_name"), rs.getString("last_name"), rs.getString("email"),
						rs.getLong("phone_number"), rs.getString("profilepicture"));
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
		return rpp;
	}
}
