package inheritance.overriding;

public class Faculty extends Person {
	public String univ;
	public long number;
	
	public Faculty(String name, long number, String univ, long idNnumber) {
		super(name, number);
		this.univ = univ;
		this.number = idNnumber;
	}

	public long getSNumber() {
		return super.number;
	}

	public void setSNumber(long number) {
		this.number = number;
	}
	
	@Override
	public void printInfo() {
		System.out.print("이름: " + super.name + ", 주민번호: " + super.number);
		System.out.println(", 대학: " + univ + ", 직원번호: " + number);
	}
	
	
	
	


}
