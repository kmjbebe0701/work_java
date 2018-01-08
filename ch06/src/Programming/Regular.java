package Programming;

public class Regular extends Employee {

	public Regular(String name, int age, String address, String division) {
		super(name, age, address, division);
	}	
	

		public void printInfo() {
			
			System.out.println("정규직, 월급: "+ super.getSalary());
		}
	

}
