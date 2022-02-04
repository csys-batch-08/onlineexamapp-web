package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.model.Register;

public interface RegisterDao {
	public int fetchregister(Register rd);

	public boolean changepassword(Register rp);

	public Register getEmailDetails(Register rp);

	public Register getPhoneDetails(Register rp);

	public void updatestatus(Register rp);

	public void makeactive(Register rp);

	public void changephoto(Register rp);

	public int editprofile(Register rp);

	public void userrequest(Register rp);

	public void updatelastdate(Register rp);

	public void updateactivedate(Register rp);

	public List<Register> showUsers();

	public List<Register> showInactiveUsers();

	public Register fetchlogin(Register rp);

	public Register validUser(String email, String password);

	public Register userprofile(int userid);
}
