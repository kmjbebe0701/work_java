package ch05programming;

public class Programming02 {
	private String major;
	private int studentID;
	

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public int getStudentID() {
		return studentID;
	}
	
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public static void main(String[] args) {
		Programming02 p = new Programming02();
		p.setMajor ("반도체 전자");
		p.setStudentID (20122042);
		System.out.println("전공 : " + p.getMajor() + ", 학번 : " + p.getStudentID());

	}


}
