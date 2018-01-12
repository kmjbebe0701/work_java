package com.tophoon.java.problem.exam06;
/*
 * 6. 클래스 Rectangle을 아래와 같이 생성하시오.
- 상속: Shape 추상클래스
- 필드:
      double width, double height (사각형의 너비와 높이, 접근지정자는 가장 제한적인 지정자를 사용하시오. 
      필요하다면 getter, setter 만들기.)
- 생성자:
      부모클래스의 필드 포함 모든 필드를 초기화하는 생성자 1개 작성
- 메소드:
      부모클래스로부터 상속받은 추상메소드 구현: drawCenter() 
      메소드 호출 후, 가로와 세로, 사각형 면적 출력 / 출력예시: 가로: 3.67, 세로: 7.89 사각형면적: 3.45
 */

public class Rectangle extends Shape implements Printer{
	private double width;			//너비
	private double height;			//높이
	
	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
	@Override
	public void draw() {
		super.drawCenter();
		System.out.printf("가로: %.2f, 세로: %.2f, 사각형 면적: %.2f%n",width, height, (width*height));
		
		
	}

	@Override
	public void printClassName() {
		System.out.println("Rectangle");
		
	}
	
	
	
	
	
	
	
}
