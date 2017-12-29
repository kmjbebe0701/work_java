package exercise;

public class Exercise01 {
// 구구단을 옆으로 2단에서 9단까지 출력하세요
	public static void main(String[] args) {
		
		
		for (int i = 2; i <=9; i++) {
			for (int j = 1; j <=9; j++) {
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println();
		}

	}

}
