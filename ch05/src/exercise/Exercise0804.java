package exercise;

public class Exercise0804 {
	String dept;
	int uNumber;
	
	public Exercise0804(int uNumber) {
		this.uNumber = uNumber;
	}

	public Exercise0804(String dept) {
		this.dept = dept;
	}

	public Exercise0804(String dept, int uNumber) {
		this(dept);
		this.uNumber = uNumber;
	}
	
 
}
