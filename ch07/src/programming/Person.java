package programming;

public class Person {
	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public boolean equals (Object name) {
		//1.Argument의 객체와 나 자신의 주소값비교
		if (this.name == name) {
			return true;
		}
		
		//2.Argument의 객체가 이 클래스를 상속받고 있는지 검사
		if (!(name instanceof Person)) {
			return false;
		}
		
		//3.실제 name 필드 값이 같은지 비교
		Person p = (Person) name;		//obj의 name 필드에 접근하기 위해 다운캐스팅
		if (this.name.equals(p.name)) {		//실제name 필드 값 끼리 비교
			return true;
		}
		return false;				//boolean의 기본값이 false이기 때문에 기본 리턴값은 false로 한다.
	}



	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		System.out.println(p1.equals(new Person("홍길동")));
		System.out.println(p1.equals(new Person("최영태")));

	}

}
