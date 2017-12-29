package exercise;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요>>");
		int num = in.nextInt();

		char[][] a = new char[num][num];
		/*
		 * int[][] a = new int[num][];
		 * 
		 * for (int i = 0; i < a.length; i++) { 
		 * for (int j = 0; j <= i; j++) {
		 * num[i][j] = '*'
		 * System.out.print(num[i][j]
		 * } 
		 * System.out.println();
		 */

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i >= j) {
					a[i][j] = '*';
				}

			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);

			}
			System.out.println();
		}
		in.close();

	}

}
