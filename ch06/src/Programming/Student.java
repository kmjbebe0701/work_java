package Programming;

public class Student extends Person {
	String school;
	String major;
	int studentID;
	double []aver;

	
	public Student(String name, int age, String address, String school, String major, int studentID) {
		super(name, age, address);
		this.school = school;
		this.major = major;
		this.studentID = studentID;
		this.aver = new double [8];
	}
	public double[] getAver() {
        return aver;
    }

    public void setAver(double[] aver) {
        this.aver = aver;
    }



	public void average() {
		double sum = 0;	
		for (int i =0; i<aver.length; i++) {
			sum += aver[i];			
		}
		System.out.println("8학기 총 평균 평점은 " + sum/8 + "점입니다.");
	}
	

}
