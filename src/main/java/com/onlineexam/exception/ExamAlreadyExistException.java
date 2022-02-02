package com.onlineexam.exception;

public class ExamAlreadyExistException extends Exception{

	@Override
	public String getMessage() {
		return "Exam already exist";
	}
	
}
