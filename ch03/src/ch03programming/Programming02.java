package ch03programming;

import java.util.Scanner;

public class Programming02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("�հ� ����� ���� �� �Ǽ��� �Է����ּ���.");
		
		//����� ����ȯ
		int a = (int)in.nextDouble();
		int b = (int)in.nextDouble();
		
		//������ ����ȯ
		double a1 = a + b;
		double b1 = a1 / 2;
				

		System.out.printf("%.2f �� %.2f �� �� : %.2f\n", a, b, a1);
		System.out.printf("%.2f �� %.2f �� ��� : %.2f\n", a, b, b1);

	}

}
