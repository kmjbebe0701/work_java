package exercise;

public class Exercise05 {
	private String name;
	private int age;
	
	//가능한 모든 생성자 구현
	
	public Exercise05() {
		super();
	}
	public Exercise05(String name) {
		super();
		this.name = name;
	}
	public Exercise05(int age) {
		super();
		this.age = age;
	}
	public Exercise05(String name, int age) {
		//생성자 구현에서 this(...) 사용
		this(name);
		this.age = age;
	}
	// 가능한 모든 getter, setter 구현
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	public static void main(String[] args) {
		

	}
	

}
