package com.aman.module;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="table2")
public class Question 
{
	
	@Id
	private int number;
	private String question;
	private String answer;
	
	public Question()
	{
		
	}

	public Question(int number, String question, String answer) {
		super();
		this.number = number;
		this.question = question;
		this.answer = answer;
	}
	
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	@Override
	public String toString() {
		return "Question [number=" + number + ", question=" + question + ", answer=" + answer + "]";
	}
}
