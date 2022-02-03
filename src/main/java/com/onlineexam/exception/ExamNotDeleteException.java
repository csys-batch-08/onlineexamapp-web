package com.onlineexam.exception;

import java.sql.SQLIntegrityConstraintViolationException;

public class ExamNotDeleteException extends SQLIntegrityConstraintViolationException {

	@Override
	public String getMessage() {
		return "Exam already registered so couldn't delete.";
	}

}
