package ch04programming;

/*
 * Math.abs() : 절대 값 리턴
 */

public class Programming02 {

	public static void main(String[] args) {
		//행의 수
		for (int i = 0; i<=7; i++) {
			for (int j = 7; j >= -7; j--) {
				if (Math.abs(j) > i) {
					System.out.print(' ');
				}
				else {
					System.out.printf("%d", Math.abs(j));
				}
			}
			System.out.println();
		}
		
	
	}
	
}
