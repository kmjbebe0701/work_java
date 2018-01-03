package ch05programming;

public class Programming04Cylinder {
	
	public double height;
	Programming03Circle c = new Programming03Circle(2.8);
	
	public Programming04Cylinder(double height) {
		this.height = height;
	}
	
	public Programming04Cylinder(Programming03Circle c, double height) {
		this.height = height;
		this.c = c;
	}


	public double getVolume() {
		return height * c.getArea();
	}
	

	public static void main(String[] args) {
		Programming04Cylinder cd = new Programming04Cylinder (new Programming03Circle(2.8),5.6);
		System.out.println("원통의 부피 : " + cd.getVolume());

	}

}
