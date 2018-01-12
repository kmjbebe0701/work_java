package com.koitt.java.javabean;

import java.io.Serializable;

public class Student extends Object implements Serializable {

	private int studentId; // 학번
	private String name; // 이름

	public Student() {

	}

	public Student(int studentId, String name) {
		this.studentId = studentId;
		this.name = name;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (obj instanceof Student) {
			Student p = (Student) obj;
			if (studentId == p.studentId) {
				return true;
			}
		}
		
		return false;
	}
	
	

	public int hashCode() {

		return (name.hashCode() + studentId);
	}



	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[이름: " + name + ", 학번: " + studentId + "]");
		String a = sb.toString();
		return a;
	}

	public static void main(String[] args) {
		Student s1 = new Student(20122042, "김미지");
		Student s2 = new Student(20120818, "황하늘");
		Student s3 = new Student(20122042, "박민희");

		if (s1.equals(s2)) {
			System.out.println("두사람은 같은 사람 입니다");
		} else {
			System.out.println("두사람은 다른 사람 입니다");
		}
		if (s1.equals(s3)) {
			System.out.println("두사람은 같은 사람 입니다");
		} else {
			System.out.println("두사람은 다른 사람 입니다");
		}
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.toString());
		System.out.println(s2);
		System.out.println(s3);
	}

}
