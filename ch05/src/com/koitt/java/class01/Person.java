package com.koitt.java.class01;

public class Person extends Animal {

	//부모인 Animal의 필드를 상속받기 때문에 중복으로 작성하지 않아도 된다.
	String ssn;					//주민등록번호
	String address;				//주소
	
	
	public String getSsn() {
		return this.ssn;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	//메소드 - Person의 내용을 출력
	public void print() {
		System.out.println("주민등록번호 : "+ this.ssn + ", 주소 : " + this.address);
	}
	
	

}
