package com.onlineexam.exception;

public class InactiveUserException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "You are in inactive mode.Request admin";
	}

}
