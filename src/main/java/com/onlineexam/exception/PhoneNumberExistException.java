package com.onlineexam.exception;

public class PhoneNumberExistException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Phone number already exist";
	}

}
