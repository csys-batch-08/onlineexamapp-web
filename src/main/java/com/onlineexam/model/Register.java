package com.onlineexam.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Register implements Serializable {
	@Override
	public String toString() {
		return "RegisterPojo [userid=" + userId + ", first_name=" + firstName + ", last_name=" + lastName + ", email="
				+ email + ", password=" + password + ", confirm_password=" + confirmPassword + ", phone_number="
				+ phoneNumber + ", photo=" + photo + ", reason=" + reason + "]";
	}

	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private long phoneNumber;
	private String role;
	private String photo;
	private String reason;
	private LocalDateTime lastActiveDate;

	public Register(int userid, String email, String password) {
		super();
		this.userId = userid;
		this.email = email;
		this.password = password;
	}

	public Register(String email, String reason) {
		super();
		this.email = email;
		this.reason = reason;
	}

	public Register(long phoneNumber, String password, String confirmPassword) {
		super();
		this.phoneNumber = phoneNumber;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}

	public Register(String firstName, String lastName, String email, String password, String confirmPassword,
			long phoneNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phoneNumber = phoneNumber;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Register(int userid) {
		super();
		this.userId = userid;
	}

	public Register(int userid, String photo) {
		super();
		this.userId = userid;
		this.photo = photo;
	}

	public Register(String firstName, String lastName, String email, long phoneNumber, String photo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.photo = photo;
	}

	public Register(int userid, String firstName, String lastName, String email, long phoneNumber) {
		super();
		this.userId = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public int getUserid() {
		return userId;
	}

	public void setUserid(int userid) {
		this.userId = userid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Register(int userid, String firstName, String lastName, String email, long phoneNumber, String reason) {
		super();
		this.userId = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.reason = reason;
	}

	public LocalDateTime getLastActiveDate() {
		return lastActiveDate;
	}

	public void setLastActiveDate(LocalDateTime lastActiveDate) {
		this.lastActiveDate = lastActiveDate;
	}

	public Register(int userid, String firstName, String lastName, String email, long phoneNumber,
			LocalDateTime lastActiveDate) {
		super();
		this.userId = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.lastActiveDate = lastActiveDate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Register(int userid, String firstName, String lastName, String email, String role, long phoneNumber) {
		super();
		this.userId = userid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

	public Register(int userId, String firstName, String lastName, String email) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public Register(int userId, String firstName, String email, String password, String confirmPassword,
			long phoneNumber, String role) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.phoneNumber = phoneNumber;
		this.role = role;
	}

}
