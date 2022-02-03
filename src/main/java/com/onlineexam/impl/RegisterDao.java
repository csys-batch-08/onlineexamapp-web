package com.onlineexam.impl;
import com.onlineexam.dao.*;
import com.onlineexam.model.RegisterPojo;
import com.onlineexam.util.ConnectionPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class RegisterDao implements RegisterDaoInterface {
	public void fetchregister(RegisterPojo rd) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=ConnectionPage.connection();
			String query="insert into registerPage(first_name,last_name,email,password,confirm_password,phone_number,lastactivedate) values(?,?,?,?,?,?,sysdate)";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, rd.getFirst_name());
			pstmt.setString(2, rd.getLast_name());
			pstmt.setString(3, rd.getEmail());
			pstmt.setString(4, rd.getPassword());
			pstmt.setString(5, rd.getConfirm_password());
			pstmt.setLong(6, rd.getPhone_number());
			pstmt.executeUpdate();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}
	public boolean changepassword(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		boolean flag=false;
		int i=0;
		String query="update registerPage set password=?,confirm_password=? where phone_number=?";
		try {
			con=ConnectionPage.connection();
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, rp.getPassword());
			pstmt.setString(2, rp.getConfirm_password());
			pstmt.setLong(3, rp.getPhone_number());
			i=pstmt.executeUpdate();
			if(i>0) {
				flag=true;
			}
			else {
				flag=false;
			}
			
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
		return flag;
	}
	public ResultSet getEmailDetails(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=ConnectionPage.connection();
			String query="select id,first_name,last_name,email,password,confirm_password,phone_number,role,profilepicture,reason,lastactivedate from registerPage where email=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, rp.getEmail());
			rs=pstmt.executeQuery();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}
		return rs;
	}
	public ResultSet getPhoneDetails(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
		con=ConnectionPage.connection();
		String query="select id,first_name,last_name,email,password,confirm_password,phone_number,role,profilepicture,reason,lastactivedate from registerPage where phone_number=?";
		pstmt=con.prepareStatement(query);
		pstmt.setLong(1, rp.getPhone_number());
		rs=pstmt.executeQuery();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}
		return rs;
	}
	public void updatestatus(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
			con=ConnectionPage.connection();
			String query="update registerPage set role='inactive' where id=?";
			pstmt=con.prepareStatement(query);
			pstmt.setInt(1, rp.getUserid());
			pstmt.executeUpdate();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}
	public void makeactive(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
		con=ConnectionPage.connection();
		String query="update registerPage set role='student',reason='no requests' where id=?";
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, rp.getUserid());
		pstmt.executeUpdate();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}
	public void changephoto(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
		con=ConnectionPage.connection();
		String query="update registerPage set profilepicture=? where id=?";
		pstmt=con.prepareStatement(query);
		pstmt.setString(1, rp.getPhoto());
		pstmt.setInt(2, rp.getUserid());
		pstmt.executeUpdate();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}
	public void editprofile(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
		con=ConnectionPage.connection();
		String query="update registerPage set first_name=?,last_name=?,email=?,phone_number=? where id=?";
		pstmt=con.prepareStatement(query);
		pstmt.setString(1, rp.getFirst_name());
		pstmt.setString(2, rp.getLast_name());
		pstmt.setString(3, rp.getEmail());
		pstmt.setLong(4, rp.getPhone_number());
		pstmt.setInt(5, rp.getUserid());
		pstmt.executeUpdate();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}
	public void userrequest(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
		con=ConnectionPage.connection();
		String query="update registerPage set reason=? where email=?";
		pstmt=con.prepareStatement(query);
		pstmt.setString(1, rp.getReason());
		pstmt.setString(2, rp.getEmail());
		pstmt.executeUpdate();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}
	public void updatelastdate(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
		con=ConnectionPage.connection();
		String query="update registerPage set lastactivedate=(select max(examdate) from scoreDetails where studentId=?) where id=?";
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, rp.getUserid());
		pstmt.setInt(2, rp.getUserid());
		pstmt.executeUpdate();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}
	public void updateactivedate(RegisterPojo rp) throws SQLException {
		Connection con=null;
		PreparedStatement pstmt=null;
		try {
		con=ConnectionPage.connection();
		String query="update registerPage set lastactivedate=sysdate where id=?";
		pstmt=con.prepareStatement(query);
		pstmt.setInt(1, rp.getUserid());
		pstmt.executeUpdate();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
	}
	public  List<RegisterPojo> showUsers() throws SQLException {
		List<RegisterPojo> rp=new ArrayList<>();
		PreparedStatement pstmt=null;
		Connection con=null;
		ResultSet rs=null;
		String query="select id,first_name,last_name,email,phone_number,lastactivedate from registerPage where role='student'";
		try {
			con=ConnectionPage.connection();
			pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				RegisterPojo rpojo=new RegisterPojo(rs.getInt("id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"),rs.getLong("phone_number"),rs.getDate("lastactivedate"));
				rp.add(rpojo);
			}
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}
		return rp;
	}
	public  List<RegisterPojo> showInactiveUsers() throws SQLException {
		List<RegisterPojo> rp=new ArrayList<>();
		Connection con=null;
		String query="select id,first_name,last_name,email,phone_number,reason from registerPage where role='inactive'";
		ResultSet rs=null;
		PreparedStatement pstmt=null;
		try {
			con=ConnectionPage.connection();
			pstmt=con.prepareStatement(query);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				RegisterPojo rpojo=new RegisterPojo(rs.getInt("id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"),rs.getLong("phone_number"),rs.getString("reason"));
				rp.add(rpojo);
			}
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}
		return rp;
	}
	public ResultSet fetchlogin(RegisterPojo rp) throws SQLException, ClassNotFoundException {
		PreparedStatement pstmt=null;
		Connection con=null;
		ResultSet rs=null;
		try {
			con=ConnectionPage.connection();
			String query="select id,first_name,last_name,email,password,confirm_password,phone_number,role,profilepicture,reason,lastactivedate from registerPage where email=? and password=?";
			pstmt=con.prepareStatement(query);
			pstmt.setString(1, rp.getEmail());
			pstmt.setString(2, rp.getPassword());
			rs= pstmt.executeQuery();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}
		return rs;
		
	}
	public  RegisterPojo validUser(String email,String password) throws ClassNotFoundException, SQLException{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		RegisterPojo rpojo=null;
		try {
			con=ConnectionPage.connection();
			String que="select id,first_name,last_name,email,phone_number,role from registerPage where email=? and password=?";
			pstmt=con.prepareStatement(que);
			pstmt.setString(1, email);
			pstmt.setString(2, password);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				rpojo=new RegisterPojo(rs.getInt("id"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"),rs.getString("role"),rs.getLong("phone_number"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}
		return rpojo;
	}
	public RegisterPojo userprofile(int userid) throws SQLException {
		RegisterPojo rpp=null;
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		try {
			con=ConnectionPage.connection();
			String que="select first_name,last_name,email,phone_number,profilepicture from registerPage where id=?";
			pstmt=con.prepareStatement(que);
			pstmt.setInt(1, userid);
			rs=pstmt.executeQuery();
			while(rs.next()) {
				rpp=new RegisterPojo(rs.getString("first_name"),rs.getString("last_name"),rs.getString("email"),rs.getLong("phone_number"),rs.getString("profilepicture"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			if(pstmt!=null) {
				pstmt.close();
			}
			if(con!=null) {
				con.close();
			}
			if(rs!=null) {
				rs.close();
			}
		}
		
		return rpp;
	}
}
