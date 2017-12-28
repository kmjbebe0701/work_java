package ch04programming;

public class Programming05 {

	public static void main(String[] args) {
		
		int won = 1000000;
		
		for (int i = 1; i <10; i++) {
			
			double a = won * i * 0.045;
			int won2 = won + (int) a;
			System.out.printf("%d 년 해지시 금액 : %d%n", i ,won2);
		}
		double b = won * (1+ 0.045 * 10);
		int won3 = (int) b; 
		System.out.printf("만기 해지시 금액 : %d%n" ,won3);
	}

}
