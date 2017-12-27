package ch03programming;

import java.util.Scanner;

public class Programming04 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("화씨(F, f)나 섭씨(C, c)와 변환 할 온도를 입력하세요.");
		String a = in.next();
		double b = in.nextDouble();
		double c = (double)(5.0 / 9.0)*(b - 32);
		double f = (double)(9.0 / 5.0)*b + 32;
		
		
		switch (a) {
			case "F" :
			case "f" :
				System.out.printf("%.3s 를 섭씨로 변환하면 : %.3f", a, c);
				
				break;
				
				
			case "C" :
			case "c" :
				
				System.out.printf("%.3s 를 화씨로 변환하면 : %.3f", a, f);
				
				break;
				
			default:
				System.out.println("문자를 잘못 입력하셨습니다.");
		
		}

	}

}
