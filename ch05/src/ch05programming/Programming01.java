package ch05programming;

public class Programming01 {
	String major;
	int studentID;

	public static void main(String[] args) {
		Programming01 p = new Programming01();
		p.major = "반도체 전자";
		p.studentID = 20122042;
		System.out.println("전공 : " + p.major + ", 학번 : " + p.studentID);

	}

}
