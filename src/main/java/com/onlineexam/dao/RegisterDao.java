package com.onlineexam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.Register;

public interface RegisterDao {
	public void fetchregister(Register rd) throws ClassNotFoundException, SQLException;

	public boolean changepassword(Register rp) throws SQLException;

	public ResultSet getEmailDetails(Register rp) throws SQLException;

	public ResultSet getPhoneDetails(Register rp) throws SQLException;

	public void updatestatus(Register rp) throws SQLException;

	public void makeactive(Register rp) throws SQLException;

	public void changephoto(Register rp) throws SQLException;

	public void editprofile(Register rp) throws SQLException;

	public void userrequest(Register rp) throws SQLException;

	public void updatelastdate(Register rp) throws SQLException;

	public void updateactivedate(Register rp) throws SQLException;

	public List<Register> showUsers() throws SQLException;

	public List<Register> showInactiveUsers() throws SQLException;

	public ResultSet fetchlogin(Register rp) throws SQLException, ClassNotFoundException;

	public Register validUser(String email, String password) throws ClassNotFoundException, SQLException;

	public Register userprofile(int userid) throws SQLException;
}
