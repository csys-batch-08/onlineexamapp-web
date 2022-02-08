package com.onlineexam.exception;

public class EmailAlreadyExistException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Email already exist";
	}

}
