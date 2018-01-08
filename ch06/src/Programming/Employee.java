package Programming;

public class Employee {
	String name;
	int age;
	String address;
	String division;
	public int salary;
	
	public Employee(String name, int age, String address, String division) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.division = division;
	}
	
	public int getSalary() {
		return salary;
	}





	public void setSalary(int salary) {
		this.salary = salary;
	}





	public void printInfo() {
		System.out.println("이름: "+ name + ", 나이: " + age + ", 주소" + address + ", 부서" + division);
	}
	
	public void setTime(int time) {}
	

}
