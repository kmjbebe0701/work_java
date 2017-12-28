package ch04programming;

public class Programming10 {

	public static void main(String[] args) {
		
		int[][]rag = new int [10][];
		
		int ai = 1;
		int aj = 1;
		for (int i = 1; i<=9; i++) {
			ai *= i;
			if (ai == aj) {
				System.out.println(1); continue;
			}
			for (int j = 1; j<=i; j++) {
				aj *= j;
				int a = ai/(aj * (ai-aj));
				System.out.print(a);
			}
			System.out.println();
		}



	}

}
