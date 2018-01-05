package inheritance.abstractinterface;

public abstract class Shape {
	protected double x, y;

	public Shape(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void drawCenter() {			//일반메소드
		System.out.println("(x, y) = " + x + ", " + y);
	}
	/*
	 * 메소드 본체가 없는 이유
	 * - 상속받은 클래스에서 구현하라는 의미
	 *  - 형태만 만들고 자식 클래스에서 구현하라는 의미
	 */

	public abstract void draw();		//추상메소드: 헤드부분만 있고 바디가 없다

	public static void main(String[] args) {
		//Shape s = new Shape(3.1, 4.5);			//객체화 오류
		/*
		 * 추상 메소드 때문에 객체화를 시킬수 없다
		 *  - 추상 메소드로 인해 클래스 구현이 완료되지 않았기 때문에 객체 생성이 안됨.
		 */
		Shape s = new Circle(3.1, 4.5, 3.0);
		s.draw();

	}

}
