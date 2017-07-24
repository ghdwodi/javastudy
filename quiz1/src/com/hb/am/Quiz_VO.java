package com.hb.am;

public class Quiz_VO {
	private int quiz_number, quiz_answer;
	private String quiz;
	private String[] quiz_items;
	
	public Quiz_VO() {}
	
	public int getQuiz_number() {
		return quiz_number;
	}
	public void setQuiz_number(int quiz_number) {
		this.quiz_number = quiz_number;
	}
	public int getQuiz_answer() {
		return quiz_answer;
	}
	public void setQuiz_answer(int quiz_answer) {
		this.quiz_answer = quiz_answer;
	}
	public String getQuiz() {
		return quiz;
	}
	public void setQuiz(String quiz) {
		this.quiz = quiz;
	}
	public String[] getQuiz_items() {
		return quiz_items;
	}

	public void setQuiz_items(String[] quiz_items) {
		this.quiz_items = quiz_items;
	}
}
