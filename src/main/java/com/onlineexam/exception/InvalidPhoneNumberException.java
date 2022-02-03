package com.onlineexam.exception;

public class InvalidPhoneNumberException extends Exception {

	@Override
	public String getMessage() {
		return "Entered Phone number is invalid";
	}

}
