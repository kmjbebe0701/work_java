package ch03programming;

import java.util.Scanner;

public class Programming01 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("합과 평균을 구할 두 실수를 입력해주세요.");
	
	double a = in.nextDouble();
	double b = in.nextDouble();
	
	System.out.printf("%.2f 와 %.2f 의 합 : %.2f\n",a ,b ,a+b);
	System.out.printf("%.2f 와 %.2f 의 평균 : %.2f\n",a ,b ,(a+b)/2);
	
	in.close();
		

	}

}
