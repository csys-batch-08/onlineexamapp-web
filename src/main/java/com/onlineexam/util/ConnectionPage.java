package com.onlineexam.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.onlineexam.encryptpassword.EncryptPassword;
import com.onlineexam.logger.Logger;

public class ConnectionPage {
	private ConnectionPage() {

	}

	public static Connection connection() {
		Connection con = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system",
					EncryptPassword.decrypt());
		} catch (ClassNotFoundException | SQLException e) {
			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());
		} catch (Exception e1) {
			Logger.printStackTrace(e1);
			Logger.runTimeException(e1.getMessage());
		}

		return con;
	}

	public static void close(ResultSet rs, PreparedStatement pstmt, Connection con) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		} catch (SQLException e) {
			Logger.printStackTrace(e);
			Logger.runTimeException(e.getMessage());
		}
	}
}
