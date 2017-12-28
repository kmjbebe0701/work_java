package ch04programming;

public class Programming07 {

	public static void main(String[] args) {
		
		int sum = 0;
		int i=0;
		
		do { 
			++i; 
			sum += i;

		}while (sum < 5000);
			
		System.out.printf("1~n 까지의 합 중 5000미만의 가장 큰 값 : %d%nn 값 : %d",sum-i, i-1);

	}

}
