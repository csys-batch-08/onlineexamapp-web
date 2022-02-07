package com.onlineexam.model;

import java.io.Serializable;

public class ExamDetails implements Serializable {
	private int examId;
	private String examName;
	private String examType;
	private String difficultyLevel;
	private int durationMinutes;

	public int getDurationMinutes() {
		return durationMinutes;
	}

	public void setDurationMinutes(int durationMinutes) {
		this.durationMinutes = durationMinutes;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
	}

	public String getExamName() {
		return examName;
	}

	public void setExamName(String examName) {
		this.examName = examName;
	}

	public String getExamType() {
		return examType;
	}

	public void setExamType(String examType) {
		this.examType = examType;
	}

	public String getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(String difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	// for adding exam
	public ExamDetails(String examName, String examType, String difficultyLevel, int durationMinutes) {
		super();
		this.examName = examName;
		this.examType = examType;
		this.difficultyLevel = difficultyLevel;
		this.durationMinutes = durationMinutes;
	}

	// for updating exam
	public ExamDetails(String difficultyLevel, int durationMinutes, int examId) {
		super();
		this.examId = examId;
		this.difficultyLevel = difficultyLevel;
		this.durationMinutes = durationMinutes;
	}

	// for deleting exam
	public ExamDetails(int examId) {
		this.examId = examId;
	}

	@Override
	public String toString() {
		return "ExamDetailsPojo [examId=" + examId + ", examName=" + examName + ", examType=" + examType
				+ ", difficultyLevel=" + difficultyLevel + ", durationMinutes=" + durationMinutes + "]";
	}

	public ExamDetails(int examId, String examName, String examType, String difficultyLevel, int durationMinutes) {
		super();
		this.examId = examId;
		this.examName = examName;
		this.examType = examType;
		this.difficultyLevel = difficultyLevel;
		this.durationMinutes = durationMinutes;
	}

	public ExamDetails(String examName, String examType, String difficultyLevel) {
		super();
		this.examName = examName;
		this.examType = examType;
		this.difficultyLevel = difficultyLevel;
	}

}
