package com.onlineexam.dao;

import java.util.List;

import com.onlineexam.model.ExamDetails;

public interface ExamDetailsDao {
	public int addExam(ExamDetails edp);

	public boolean updateExam(ExamDetails edp);

	public boolean deleteExam(ExamDetails edp);

	public ExamDetails showExams();

	public List<ExamDetails> showAllExams();

	public List<ExamDetails> showExamsEasy();

	public List<ExamDetails> showExamsHard();
}
