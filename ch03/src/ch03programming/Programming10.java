package ch03programming;

import java.util.Scanner;

public class Programming10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("���� �ݾ��� �Է��ϼ���.(�ּ� õ������)");
		int a = in.nextInt();
		int na = a;
		
		int fyt = (a / 50000);
		na %= 50000;
		
		int tyt = (na/10000);
		na %= 10000;
		
		int ft = (na/5000);
		na %= 5000;
		
		int t = (na/1000);
		
		System.out.printf("���� �ݾ� : %d\n50000���� : %d��%n10000���� : %d��%n5000���� : %d��%n1000���� : %d��%n", a, fyt, tyt, ft, t);
		

	}

}
