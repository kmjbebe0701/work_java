package ch03programming;

import java.util.Scanner;

public class Programming09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("키와 몸무게를 입력하세요.");
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		String str = (b <= (a-100)*0.9) ? "정상입니다." : "비만입니다";
		System.out.println(str);

	}

}
