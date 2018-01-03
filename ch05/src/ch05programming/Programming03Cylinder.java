package ch05programming;

public class Programming03Cylinder {
	
	public double height;
	//Programming03Circle c = new Programming03Circle(2.8);
	Programming03Circle circle;
	
	public Programming03Cylinder(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		//return height * c.getArea();
		double area = circle.getArea();			//원 넓이 구하기
		double volume = height * area;
		return volume;
	}
	//방법1 : circle 필드를 setter를 이용하여 초기화
	public void setCircle(Programming03Circle circle) {
		this.circle = circle;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public static void main(String[] args) {
		//1. 원을 만든다.
		Programming03Circle c = new Programming03Circle(2.8);
		System.out.println(c.getArea() + " " + c.radius);
		
		//2.실린더를 만든다.
		Programming03Cylinder cy = new Programming03Cylinder(5.6);
		cy.setCircle(c);
		cy.setHeight(5.6);
		
		System.out.println("원통의 부피 : " + cy.getVolume());

	}

}
