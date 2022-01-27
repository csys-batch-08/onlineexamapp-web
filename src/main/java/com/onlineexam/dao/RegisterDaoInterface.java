package com.onlineexam.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.onlineexam.model.RegisterPojo;

public interface RegisterDaoInterface {
	public  void fetchregister(RegisterPojo rd) throws ClassNotFoundException, SQLException;
	public boolean changepassword(RegisterPojo rp);
	public ResultSet getEmailDetails(RegisterPojo rp) throws SQLException;
	public ResultSet getPhoneDetails(RegisterPojo rp) throws SQLException;
	public void updatestatus(RegisterPojo rp) throws SQLException;
	public void makeactive(RegisterPojo rp) throws SQLException;
	public void changephoto(RegisterPojo rp) throws SQLException;
	public void editprofile(RegisterPojo rp) throws SQLException;
	public void userrequest(RegisterPojo rp) throws SQLException;
	public void updatelastdate(RegisterPojo rp) throws SQLException;
	public void updateactivedate(RegisterPojo rp) throws SQLException;
	public  List<RegisterPojo> showUsers();
	public  List<RegisterPojo> showInactiveUsers();
	public ResultSet fetchlogin(RegisterPojo rp) throws SQLException, ClassNotFoundException;
	public  ResultSet validUser(String email,String password) throws ClassNotFoundException, SQLException;
	public RegisterPojo userprofile(int userid) throws SQLException;
}
