package com.onlineexam.exception;

public class InvalidUserException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid Username or Password";
	}
}
