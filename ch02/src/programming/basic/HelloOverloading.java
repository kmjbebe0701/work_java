package programming.basic;

public class HelloOverloading {

	public static void main(String[] args) {
		
		
		/*
		 * �޼ҵ� �����ε� ȣ������
		 * 1. Argument(Parameter)�� Ÿ�� ��ġ
		 * 2. Argument(Parameter)�� ���� ��ġ
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
