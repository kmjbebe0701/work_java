package com.tophoon.java.problem.exam06;
/*
 * 7. 클래스 Other를 아래와 같이 생성하시오.
- 상속: 없음
- 필드:
      int angles (도형 각의 수, 접근지정자는 가장 제한적인 지정자를 사용하시오. 필요하다면 getter, setter 만들기.)
- 생성자:
      모든 필드를 초기화하는 생성자 1개 작성
- 메소드:
      없음
 */

public class Other implements Printer{
	private int angles;

	public Other(int angles) {
		super();
		this.angles = angles;
	}

	public int getAngles() {
		return angles;
	}

	public void setAngles(int angles) {
		this.angles = angles;
	}

	@Override
	public void printClassName() {
		System.out.println("Other");
		
	}
	

}
