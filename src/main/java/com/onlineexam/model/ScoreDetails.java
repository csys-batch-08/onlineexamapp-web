package com.onlineexam.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class ScoreDetails implements Serializable {
	private int studentId;
	private int examId;
	private String examName;
	private int score;
	private String passOrFail;
	private String grade;
	private LocalDateTime examdate;

	public LocalDateTime getExamdate() {
		return examdate;
	}

	public void setExamdate(LocalDateTime examdate) {
		this.examdate = examdate;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
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

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPassOrFail() {
		return passOrFail;
	}

	public void setPassOrFail(String passOrFail) {
		this.passOrFail = passOrFail;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public ScoreDetails(int studentId, int examId, String examName, int score, String passOrFail, String grade) {
		super();
		this.studentId = studentId;
		this.examId = examId;
		this.examName = examName;
		this.score = score;
		this.passOrFail = passOrFail;
		this.grade = grade;
	}

	public ScoreDetails(LocalDateTime examdate) {
		this.examdate = examdate;
	}

	public ScoreDetails(int score, String passOrFail) {
		super();
		this.score = score;
		this.passOrFail = passOrFail;
	}

	public ScoreDetails(String passOrFail, String grade) {
		super();
		this.passOrFail = passOrFail;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "ScoreDetails [studentId=" + studentId + ", examId=" + examId + ", examName=" + examName + ", score="
				+ score + ", passOrFail=" + passOrFail + ", grade=" + grade + "]";
	}

	public ScoreDetails(int studentId) {
		super();
		this.studentId = studentId;
	}

	public ScoreDetails(int studentId, int examId, String examName, int score, String passOrFail, String grade,
			LocalDateTime examdate) {
		super();
		this.studentId = studentId;
		this.examId = examId;
		this.examName = examName;
		this.score = score;
		this.passOrFail = passOrFail;
		this.grade = grade;
		this.examdate = examdate;
	}
}
