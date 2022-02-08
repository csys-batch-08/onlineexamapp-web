package com.onlineexam.exception;

public class ExamAlreadyExistException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Exam already exist";
	}

}
