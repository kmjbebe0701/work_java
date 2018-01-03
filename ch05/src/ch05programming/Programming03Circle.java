package ch05programming;

public class Programming03Circle {
	public double radius;
	public static double PI = 3.141592;
	
	public Programming03Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return radius * radius * PI;
	}


}
