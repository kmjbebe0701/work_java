package ch03programming;

import java.util.Scanner;

public class Programming03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("�Ŀ��� ��ȯ�� ����(kg)�� �Է��ϼ���.");
		
		double a = in.nextDouble();
		double b = a * 2.2;
		
		System.out.printf("%.3f kg�� �Ŀ�� ��ȯ : %.3f lb", a, b);

	}

}
