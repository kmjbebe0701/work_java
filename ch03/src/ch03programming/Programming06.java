package ch03programming;

import java.util.Scanner;

public class Programming06 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("õ�� ������ ������ �Է��ϼ���.");
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
			System.out.printf("�Է� : %d��%dõ%d��%d��%d�� �Դϴ�.%n", a, b, c, d, na);
		}
		else if (b > 0 &&  intt <= 10000000) {
			System.out.printf("�Է� : %dõ%d��%d��%d�� �Դϴ�.%n", b, c, d, na);
		}
		else if (c > 0 &&  intt <= 10000000) {
			System.out.printf("�Է� : %d��%d��%d�� �Դϴ�.%n", c, d, na);
		}
		else if (d > 0 &&  intt <= 10000000) {
			System.out.printf("�Է� : %d��%d�� �Դϴ�.%n", d, na);

		}
		else if (na >= 0 &&  intt <= 10000000) {
			System.out.println("�Է� : " + na + "�� �Դϴ�");
		}

		else {
			System.out.println("�Է��� �߸��Ǿ����ϴ�.");
		}

	}

}
