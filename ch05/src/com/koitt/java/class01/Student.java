package com.koitt.java.class01;

public class Student extends Person {
	
	//Animal 과 Person의 필드값을 상속받기 때문에 중복으로 작성하지 않아도 된다.
	//단, Teacher는 상속받지 않았기 때문에  Teacher의 필드는 사용할 수 없다.
	
	private int studentID;			//학번
	private String major;			//전공
	private int grade;				//학년
	
	public int getStudentID() {
		return this.studentID;
	}
	public String getMajor() {
		return this.major;
	}
	public int getGrade() {
		return this.grade;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}	
	public void setMajor(String subject) {
		this.major = major;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}

}
