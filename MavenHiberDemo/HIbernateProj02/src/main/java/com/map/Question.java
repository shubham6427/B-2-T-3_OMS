package com.map;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question {
@Id
@Column(name= "Question_No")
	private int questionId;

private String question;

@OneToOne(cascade = CascadeType.ALL)
private Answer answer;

public Question() {
	super();
	// TODO Auto-generated constructor stub
}
public Question(int questionId, String question, Answer answer) {
	super();
	this.questionId = questionId;
	this.question = question;
	this.answer = answer;
}
public int getQuestionId() {
	return questionId;
}
public void setQuestionId(int questionId) {
	this.questionId = questionId;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public Answer getAnswer() {
	return answer;
}
public void setAnswer(Answer answer) {
	this.answer = answer;
}
	
	
}
