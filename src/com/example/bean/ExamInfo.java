package com.example.bean;

import java.io.Serializable;

public class ExamInfo implements Serializable {

	private String course;
	private int total;
	private int time;
	private String question;
	private Users users;

	public ExamInfo() {

	}

	public ExamInfo(String course, int total, int time, String question) {
		this.course = course;
		this.total = total;
		this.time = time;
		this.question = question;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Override
	public String toString() {
		int userId = 0;
		if (users != null) {
			userId = users.getId();
		}
		return "���Կ�Ŀ��" + this.course + "\t ������ţ�" + userId + "\n ����������"
				+ this.total + "\t ����ʱ�䣺" + this.time;
	}

}
