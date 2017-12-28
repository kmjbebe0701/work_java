package ch04programming;

public class Programming01 {
	public static void main(String[] args) {
		
		int i = 1;
		int sum = 1;
		
		for (i = 1; i <= 100; i++) {
			if (i%2 == 0 || i%3 == 0 || i%5 ==0 ||i%7 ==0) {
				continue;
			}
			
			if (sum%10 == 0) {
				System.out.println(i);
				++sum;
				continue;
				
			}
			System.out.printf("%d ",i);
			++sum;
		}

	}

}
