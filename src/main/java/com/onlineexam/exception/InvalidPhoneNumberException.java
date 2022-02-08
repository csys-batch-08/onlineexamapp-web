package com.onlineexam.exception;

public class InvalidPhoneNumberException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Entered Phone number is invalid";
	}

}
