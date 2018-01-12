package com.tophoon.java.problem.exam06;
/*
 * 1. 패키지(Package) com.tophoon.java.problem.exam06을 생성하시오.
2. 클래스(Class) Exam06를 생성하시오.
3. Exam06 클래스에 main 메소드(Method)를 작성하시오.
4. 추상클래스 Shape를 아래와 같이 생성하시오.
- 필드:
      double x, double y (중심좌표를 뜻하며, 접근지정자는 가장 제한적인 지정자를 사용하시오. 
      필요하다면 getter, setter 만들기.)
- 생성자:
      모든 필드를 초기화하는 생성자 1개 작성
- 메소드:
      public void drawCenter(): 중심좌표 x, y를 출력 / 출력예시: 중심좌표 (x, y) = 2.0, 3.0
      public abstract void draw(): 추상메소드
5. 클래스 Circle을 아래와 같이 생성하시오.
- 상속: Shape 추상클래스
- 필드:
      double radius (반지름, 접근지정자는 가장 제한적인 지정자를 사용하시오. 필요하다면 getter, setter 만들기.)
- 생성자:
      부모클래스의 필드 포함 모든 필드를 초기화하는 생성자 1개 작성
- 메소드:
      부모클래스로부터 상속받은 추상메소드 구현: drawCenter() 메소드 호출 후, 
      반지름과 원 면적 출력 / 출력예시: 반지름: 4.82, 원 면적: 72.98
6. 클래스 Rectangle을 아래와 같이 생성하시오.
- 상속: Shape 추상클래스
- 필드:
      double width, double height (사각형의 너비와 높이, 접근지정자는 가장 제한적인 지정자를 사용하시오. 
      필요하다면 getter, setter 만들기.)
- 생성자:
      부모클래스의 필드 포함 모든 필드를 초기화하는 생성자 1개 작성
- 메소드:
      부모클래스로부터 상속받은 추상메소드 구현: drawCenter() 
      메소드 호출 후, 가로와 세로, 사각형 면적 출력 / 출력예시: 가로: 3.67, 세로: 7.89
7. 클래스 Other를 아래와 같이 생성하시오.
- 상속: 없음
- 필드:
      int angles (도형 각의 수, 접근지정자는 가장 제한적인 지정자를 사용하시오. 필요하다면 getter, setter 만들기.)
- 생성자:
      모든 필드를 초기화하는 생성자 1개 작성
- 메소드:
      없음
8. 인터페이스 Printer를 아래와 같이 생성하시오. 
(생성 후 5, 6, 7번에 해당하는 클래스에서 Printer 인터페이스를 상속받도록 한다.)
- 필드:
      String device ("출력 방법: Printer" 상수 값으로 초기화)
- 추상메소드:
      void printClassName() (상속받은 클래스의 클래스명을 출력)
9. main 메소드에서 아래와 같이 작성
- Shape 배열을 만들고 그 배열에 Circle과 Rectangle 객체를 집어 넣는다.
- for문을 이용하여 Shape 배열에 있는 객체의 draw() 메소드 호출
- Printer 배열을 만들고 그 배열에 Circle, Rectangle, Other 객체를 집어 넣는다.
- while문을 이용하여 Printer 배열에 있는 객체의 printClassName() 메소드 호출
출력예시)
중심좌표 (x, y) = 3.0, 4.0
반지름: 4.82, 원 면적: 72.99
중심좌표 (x, y) = 2.0, 3.0
가로: 3.67, 세로: 7.89, 사각형 면적: 28.96
Circle
Rectangle
Other
 */

public class Exam06 {

	public static void main(String[] args) {
		Shape[] sh = {new Circle(3.0, 4.0, 4.82), new Rectangle(2.0, 3.0, 3.67, 7.89)};
		
		sh[0].draw();
		sh[1].draw();
		
		/*
		for(int i = 0; i<sh.length; i++) {
			sh[i].draw();
		}
		*/
		
		Printer[] pr = {new Circle(3.0, 4.0, 4.82), new Rectangle(2.0, 3.0, 3.67, 7.89),
				new Other(4)};
		
		pr[0].printClassName();
		pr[1].printClassName();
		pr[2].printClassName();
		
		/*
		int i = 0;
		while(i < pr.length) {
			pr[i].printClassName();
			i++;
		}
		*/

	}

}
