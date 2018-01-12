package com.tophoon.java.problem.exam06;
/*
 * 5. 클래스 Circle을 아래와 같이 생성하시오.
- 상속: Shape 추상클래스
- 필드:
      double radius (반지름, 접근지정자는 가장 제한적인 지정자를 사용하시오. 필요하다면 getter, setter 만들기.)
- 생성자:
      부모클래스의 필드 포함 모든 필드를 초기화하는 생성자 1개 작성
- 메소드:
      부모클래스로부터 상속받은 추상메소드 구현: drawCenter() 메소드 호출 후, 
      반지름과 원 면적 출력 / 출력예시: 반지름: 4.82, 원 면적: 72.98
 */

public class Circle extends Shape implements Printer{
	private double radius;		//반지름

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;
	}
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	@Override
	public void draw() {
		super.drawCenter();
		System.out.printf("반지름: %.2f, 원면적: %.2f%n",radius, (radius*radius*3.141592));
	}


	@Override
	public void printClassName() {
		System.out.println("Clrcle");
		
	}
	
	

}
