package ch05programming;

public class Programming03Cylinder {
	
	public double height;
	Programming03Circle c = new Programming03Circle(2.8);
	
	public Programming03Cylinder(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return height * c.getArea();
	}
	

	public static void main(String[] args) {
		Programming03Cylinder c = new Programming03Cylinder(5.6);
		System.out.println("원통의 부피 : " + c.getVolume());

	}

}
