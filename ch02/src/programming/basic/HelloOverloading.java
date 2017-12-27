package programming.basic;

public class HelloOverloading {

	public static void main(String[] args) {
		
		
		/*
		 * 메소드 오버로딩 호출조건
		 * 1. Argument(Parameter)의 타입 일치
		 * 2. Argument(Parameter)의 개수 일치
		 * */
		
		int sum = plus(10, 20);
		System.out.println(sum);
		
		double sum01 = plus(10, 20.5);
		System.out.println(sum01);		
		

	}
	
	static int plus(int a, int b) {
		int result = a + b;
		return result;
		
	}
	
	static double plus(int a, double b) {
		double result = a + b;
		return result;
		
	}

}
