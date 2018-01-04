package ch05programming;

public class Programming05 {
	int salary = 1000000;
	

	public Programming05() {
	}
	public Programming05(int salary) {
		this.salary = salary;
	}
	
	public int getAnnualGross() {
		return salary * 12 + salary *5;
	}


	public static void main(String[] args) {
		System.out.println(new Programming05().getAnnualGross());
		System.out.println(new Programming05(2_000_000).getAnnualGross());

	}

}
