package com.onlineexam.exception;

public class EmailAlreadyExistException extends Exception {
	@Override
	public String getMessage() {
		return "Email already exist";
	}

}
