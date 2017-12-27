package character;

import java.util.Scanner;

public class ToPound {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("무게를 입력하세요");
		
		double num1 = input.nextDouble();
		
		System.out.println(num1 + "kg");
		System.out.println(num1*2.2 + "ld");

	}

}
