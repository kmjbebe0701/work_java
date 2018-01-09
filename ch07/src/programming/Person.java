package programming;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}



	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최영태")));

	}

}
