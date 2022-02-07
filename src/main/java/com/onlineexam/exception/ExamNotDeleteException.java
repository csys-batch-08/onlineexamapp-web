package com.onlineexam.exception;

public class ExamNotDeleteException extends Exception {

	@Override
	public String getMessage() {
		return "Exam already registered so couldn't delete.";
	}

}
