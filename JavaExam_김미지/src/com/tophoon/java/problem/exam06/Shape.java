package com.tophoon.java.problem.exam06;
/*
 * 4. 추상클래스 Shape를 아래와 같이 생성하시오.
- 필드:
      double x, double y (중심좌표를 뜻하며, 접근지정자는 가장 제한적인 지정자를 사용하시오. 
      필요하다면 getter, setter 만들기.)
- 생성자:
      모든 필드를 초기화하는 생성자 1개 작성
- 메소드:
      public void drawCenter(): 중심좌표 x, y를 출력 / 출력예시: 중심좌표 (x, y) = 2.0, 3.0
      public abstract void draw(): 추상메소드
 */

public abstract class Shape {
	private double x;
	private double y;
	
	public Shape(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	 public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}



	public void drawCenter() {
		 System.out.println("중심좌표 (x, y) = " + x + ", " + y);
	 }
	 
	 public abstract void draw();
	

}
