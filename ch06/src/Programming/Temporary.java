package Programming;

public class Temporary extends Employee{
	private int time;
	int wage = 10000;
	
	public Temporary(String name, int age, String address, String division) {
		super(name, age, address, division);
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
		this.wage = time * wage;
	}
	
	public void printInfo() {
		
		System.out.println("비정규직, 일한시간: "+ time + ", 월급여:" + wage);
	}


	

}
