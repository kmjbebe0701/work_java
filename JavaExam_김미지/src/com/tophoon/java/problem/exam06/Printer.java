package com.tophoon.java.problem.exam06;
/*
 * 8. 인터페이스 Printer를 아래와 같이 생성하시오. 
(생성 후 5, 6, 7번에 해당하는 클래스에서 Printer 인터페이스를 상속받도록 한다.)
- 필드:
      String device ("출력 방법: Printer" 상수 값으로 초기화)
- 추상메소드:
      void printClassName() (상속받은 클래스의 클래스명을 출력)
 */

public interface Printer {
	
	public static String device = "출력 방법: Printer";
			
	public abstract void printClassName();
	

}
