package ch03programming;

import java.util.Scanner;

public class Programming04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("ȭ��(F, f)�� ����(C, c)�� ��ȯ �� �µ��� �Է��ϼ���.");
		String a = in.next();
		double b = in.nextDouble();
		double c = (double)(5.0 / 9.0)*(b - 32);
		double f = (double)(9.0 / 5.0)*b + 32;
		
		
		switch (a) {
			case "F" :
			case "f" :
				System.out.printf("%.3s �� ������ ��ȯ�ϸ� : %.3f", a, c);
				
				break;
				
				
			case "C" :
			case "c" :
				
				System.out.printf("%.3s �� ȭ���� ��ȯ�ϸ� : %.3f", a, f);
				
				break;
				
			default:
				System.out.println("���ڸ� �߸� �Է��ϼ̽��ϴ�.");
		
		}

	}

}
