package inheritance.overloading;

public class MyMath {
	double x, y;

	public MyMath(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double multiply() {

		return x * y;
	}

	public static double multiply(double a, double b) {		//static이 class 정보보다 메모리에 먼저 올라감
		return a * b;
		//return x * y;					//오류발생			//그래서 x,y를 찾을수 없어서 문제발생
		//return this.x * this.y;		//오류발생
	}

	public static void main(String[] args) {
		MyMath math = new MyMath(3.4, 6.7);
		System.out.println(math.multiply());
		System.out.println(MyMath.multiply(3.4, 6.7));
	}

}
