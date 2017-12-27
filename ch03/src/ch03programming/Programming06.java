package ch03programming;

import java.util.Scanner;

public class Programming06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("천만 이하의 정수를 입력하세요.");
		int intt = in.nextInt();
		int na = intt;

		int a = (na / 10000);
		na %= 10000;

		int b = (na / 1000);
		na %= 1000;

		int c = (na / 100);
		na %= 100;

		int d = (na / 10);
		na %= 10;

		if (a > 0 &&  intt <= 10000000) {
			System.out.printf("입력 : %d만%d천%d백%d십%d원 입니다.%n", a, b, c, d, na);
		}
		else if (b > 0 &&  intt <= 10000000) {
			System.out.printf("입력 : %d천%d백%d십%d원 입니다.%n", b, c, d, na);
		}
		else if (c > 0 &&  intt <= 10000000) {
			System.out.printf("입력 : %d백%d십%d원 입니다.%n", c, d, na);
		}
		else if (d > 0 &&  intt <= 10000000) {
			System.out.printf("입력 : %d십%d원 입니다.%n", d, na);

		}
		else if (na >= 0 &&  intt <= 10000000) {
			System.out.println("입력 : " + na + "원 입니다");
		}

		else {
			System.out.println("입력이 잘못되었습니다.");
		}

	}

}
