package com.onlineexam.exception;

public class PhoneNumberExistException extends Exception {
	@Override
	public String getMessage() {
		return "Phone number already exist";
	}

}
