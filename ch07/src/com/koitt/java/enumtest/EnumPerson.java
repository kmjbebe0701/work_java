package com.koitt.java.enumtest;

public class EnumPerson {
	/*
	 * enum은 자바 1.5 버전부터 사용가능
	 * c언어에서 왔다
	 * 관련된 것들끼리 묶어 코딩할 수 있어 편리
	 * enum은 static처럼 접근한다.
	 */
	public enum StudentTest {GIL_DONG, JI_HYON, JA_MIN, BEONG_EUN};
	// 위 방식을 아래 처럼 사용 가능
	public enum Student {
		// 생성자 호출과 비슷
		GIL_DONG(100, "홍길동"),
		JI_HYON(101, "전지현"),
		JA_MIN(102, "민자민"),
		BEONG_EUN(103, "현병은");
		
		//클래스의 필드 선언과 비슷
		private int studentId;
		private String name;
		
		//클래스의 생성자와 비슷 (private 만 가능// 객체 생성을 허용하지 않는다.)
		private Student(int studentId, String name) {
			this.studentId = studentId;
			this.name = name;
		}
		
		//클래스의 grtter, setter와 비슷
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
	}
	
	public static void main(String[] args) {
		System.out.println(Student.GIL_DONG);
		System.out.println(Student.GIL_DONG.getStudentId());
		System.out.println(Student.GIL_DONG.getName());
		
		for (Student item : Student.values()) {				//Student.values()로 배열처럼 출력가능
			System.out.print("학번: " + item.getStudentId());
			System.out.println("이름: " + item.getName());
		}
		Student.GIL_DONG.setName("홍길자");
		System.out.println(Student.GIL_DONG.getName());
		
		//enum 을 사용하면 객체를 동적으로 사용가능
	}

}
