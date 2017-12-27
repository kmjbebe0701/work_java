package ch03programming;

import java.util.Scanner;

public class Programming10 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("지불 금액을 입력하세요.(최소 천원단위)");
		int a = in.nextInt();
		int na = a;
		
		int fyt = (a / 50000);
		na %= 50000;
		
		int tyt = (na/10000);
		na %= 10000;
		
		int ft = (na/5000);
		na %= 5000;
		
		int t = (na/1000);
		
		System.out.printf("지불 금액 : %d\n50000원권 : %d장%n10000원권 : %d장%n5000원권 : %d장%n1000원권 : %d장%n", a, fyt, tyt, ft, t);
		

	}

}
