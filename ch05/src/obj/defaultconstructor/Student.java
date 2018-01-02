package obj.defaultconstructor;

public class Student {
	public String name;
	
	//기본 생성자 구현
	public Student() {
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("학생이름 : " + this.name);
	}

	public static void main(String[] args) {
		Student lee = new Student("이승훈");
		lee.print();
		
		/*
		 * 이름을 인자로 하는 생성자가 구현되어 있으므로
		 * 기본 생성자를 직접 구현해야 다음과 같이 기본 생성자로 객체 생성가능
		 */
		Student kim = new Student();
		kim.name = "김다빈";
		kim.print();
	}

}
