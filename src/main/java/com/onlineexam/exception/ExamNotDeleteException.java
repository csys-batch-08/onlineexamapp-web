package com.onlineexam.exception;

public class ExamNotDeleteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return "Exam already registered so couldn't delete.";
	}

}
