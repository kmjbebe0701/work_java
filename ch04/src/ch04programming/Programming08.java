package ch04programming;

public class Programming08 {

	public static void main(String[] args) {

		int[][] a = { { 78, 48, 78, 98 }, { 99, 92 }, { 29, 64, 83 }, { 34, 78, 92, 56 } };


		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			int vc = 0;

			/*
			 * for (int j = 0; j < a[i].length; j++) { 
			 * System.out.print(a[i][j]+" ");
			 * sum += a[i][j];
			 * }
			 * System.out.printf("행의 합~~~~
			 * sum = 0;
			 */

			for (int value : a[i]) {
				++vc;
				System.out.print(value + " ");
				sum += value;
				}
			System.out.println("행의 합 : "+ sum +", 평균 : "+ sum / vc);

		}

	}

}
