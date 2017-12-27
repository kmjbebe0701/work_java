package character;

import java.util.Scanner;

public class PersonInFo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력하세요.");
		
		double num1 = input.nextDouble();
		int num2 = input.nextInt();
		
		System.out.printf("키 : %.1f cm, 몸무게 : %d kg", num1, num2);
		
		input.close();
		

	}

}
