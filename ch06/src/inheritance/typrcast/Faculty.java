package inheritance.typrcast;

public class Faculty extends Person {
	public String univ;
	public long number;
	
	public Faculty(String name, long number, String univ, long idNnumber) {
		super(name, number);
		this.univ = univ;
		this.number = idNnumber;
	}

	public long getNumber() {
		return number;
	}

	public void setSNumber(long number) {
		this.number = number;
	}
	
	
	
	


}
