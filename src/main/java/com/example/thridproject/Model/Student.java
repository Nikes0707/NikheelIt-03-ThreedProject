package com.example.thridproject.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
private int student_id;
	
	private String student_name;
	
	private String student_Email;
	
	private int student_age;

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_Email() {
		return student_Email;
	}

	public void setStudent_Email(String student_Email) {
		this.student_Email = student_Email;
	}

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_Email="
				+ student_Email + ", student_age=" + student_age + "]";
	}

}
