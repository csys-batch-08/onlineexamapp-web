package com.onlineexam.exception;

public class InactiveUserException extends Exception {

	@Override
	public String getMessage() {
		return "You are in inactive mode.Request admin";
	}

}
