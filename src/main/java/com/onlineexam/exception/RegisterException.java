package com.onlineexam.exception;

public class RegisterException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "credentials already exist";
	}

}
