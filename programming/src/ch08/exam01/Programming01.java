package ch08.exam01;

import java.util.Scanner;

public class Programming01 {

	public static void main(String[] args) {
		Integer x = 0, y = 0, z = 0;
		Scanner in = new Scanner(System.in);

		System.out.println("곱하고 싶은 두개의 정수 값을 입력하세요.");
		try {
			x = in.nextInt();
			y = in.nextInt();
			z = x * y;
			System.out.printf("%d * %d = %d%n", x, y, z);
		} catch (Exception e) {
			System.out.println("정수를 입력해주세요.");
		}

	}

}
