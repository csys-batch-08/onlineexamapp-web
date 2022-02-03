package com.onlineexam.dao;

import java.sql.ResultSet;
import java.util.List;

import com.onlineexam.model.Register;

public interface RegisterDao {
	public void fetchregister(Register rd);

	public boolean changepassword(Register rp);

	public ResultSet getEmailDetails(Register rp);

	public ResultSet getPhoneDetails(Register rp);

	public void updatestatus(Register rp);

	public void makeactive(Register rp);

	public void changephoto(Register rp);

	public void editprofile(Register rp);

	public void userrequest(Register rp);

	public void updatelastdate(Register rp);

	public void updateactivedate(Register rp);

	public List<Register> showUsers();

	public List<Register> showInactiveUsers();

	public ResultSet fetchlogin(Register rp);

	public Register validUser(String email, String password);

	public Register userprofile(int userid);
}
