package ch03programming;

import java.util.Scanner;

public class Programming02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("합과 평균을 구할 두 실수를 입력해주세요.");
		
		//명시적 형변환
		int a = (int)in.nextDouble();
		int b = (int)in.nextDouble();
		
		//묵시적 형변환
		double a1 = a + b;
		double b1 = a1 / 2;
				

		System.out.printf("%.2f 와 %.2f 의 합 : %.2f\n", a, b, a1);
		System.out.printf("%.2f 와 %.2f 의 평균 : %.2f\n", a, b, b1);

	}

}
