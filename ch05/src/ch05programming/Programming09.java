package ch05programming;

public class Programming09 {
	double width;
	double height;
	
	public Programming09(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	public double getCircumference() {
		return 2 * width + 2 * height;
	}

	public static void main(String[] args) {
		Programming09 rc = new Programming09(3.82, 8.65);
		System.out.println("면적 : " + rc.getArea());
		System.out.println("둘레 : " + rc.getCircumference());

	}

}
