package character;

import java.util.Scanner;

public class ToDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("변환할 정수를 입력하세요.");
		
		int num = input.nextInt();
		
		System.out.printf("8진수 : %1$o, 10진수 : %1$d, 16진수 : %1$h", num);
	}

}
