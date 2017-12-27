package ch03programming;

import java.util.Scanner;

public class Programming07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("달(month)을 입력하세요.");
		int a = in.nextInt();
		
		String str = (a <= 6) ? "상반기 입니다." : "하반기 입니다.";
		System.out.printf("%d월달은 %s", a, str);
		
		

	}

}
