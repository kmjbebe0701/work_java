package ch04programming;

public class Programming10 {

	public static void main(String[] args) {

		int[][] rag = new int[10][];
		
		for (int i = 0; i <rag.length; i++) {
			rag[i] = new int [i + 1];
		}
			for (int n =0; n <rag.length; n++) {
				for (int r =0; r <rag[n].length; r++) {
					rag[n][r] = factorial(n)/(factorial(r)*factorial(n-r));
				}
			}
			
			//순차적으로 출력
			for (int n = 0; n<rag.length; n++) {
				for (int r = 0; r < rag[n].length; r++) {
					System.out.print(rag[n][r]+" ");
				}
				System.out.println();
			}
	}
	
	static int factorial(int n) {
		int mult =1;
		//0! 일 때
		if (n==0) {
			return 1;
		}
		//1부터 n 까지 곱하는 for문
		for (int i = 1; i <=n; i++) {
			mult *= i;
		}
		return mult;

		/*int ai = 1;
		int aj = 1;
		for (int i = 0, j = 0; i <= 9; i++) {
			if ((ai != aj||ai==1) && i != 0) {

				ai *= i;

				for (j = 0; j <= i; j++) {
					if (i == j ||j ==0) {
						System.out.println(1);
						continue;
					}
					aj *= j;
					int a = ai / (aj * (ai - aj));
					System.out.print(a);
				}
			} else if (i == j) {
				System.out.println(1);
				continue;
			}

		}*/

	}

}
