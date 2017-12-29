package ch04programming;

public class Programming09 {

	public static void main(String[] args) {
		int[] prime = new int [1001];
		for (int i=0; i<prime.length; i++) {
			prime[i] = 0;
		}
		for (int i = 2; i<prime.length; i++) {
			prime[i] = 1;
		}
		
		int limit = (int)Math.sqrt(1000);		//Math.sqrt() 메소드는 제곱근
		//i : i 의 배수
		for (int i = 2; i <=limit; i++) {
			if (prime[i]==1) {
				for (int j = 2 * i; j<=1000;j++) {
					if(j%i==0) {
						//j%i ==0 이면 소수가 아니다.
						prime[j] = 0;
					}
				}
			}
		}
		int count=0;
		for (int i = 2; i<1000; i++) {
			if (prime[i] ==1) {
				System.out.print(i+" ");
				count++;
			}
			
			if (count == 20) {
				System.out.println();
				count = 0;
			}
		}
		

	}

}
