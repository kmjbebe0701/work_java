package ch03programming;

import java.util.Scanner;

public class Programming05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("년도를 입력하세요.");
		int a = in.nextInt();

		/*
		 * if (a%4 == 0) { if (a%100 == 0) { if (a%400 == 0) {
		 * System.out.printf("%d년도는 윤년입니다.", a); } else {
		 * System.out.printf("%d년도는 평년입니다.", a); } } }
		 */

		if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
			System.out.printf("%d년도는 윤년입니다.", a);
		} 
		else {
			System.out.printf("%d년도는 평년입니다.", a);
		}

	}

}
