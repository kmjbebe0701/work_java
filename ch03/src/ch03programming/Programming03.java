package ch03programming;

import java.util.Scanner;

public class Programming03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("파운드로 변환할 무게(kg)을 입력하세요.");
		
		double a = in.nextDouble();
		double b = a * 2.2;
		
		System.out.printf("%.3f kg을 파운드 변환 : %.3f lb", a, b);

	}

}
