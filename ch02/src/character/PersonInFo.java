package character;

import java.util.Scanner;

public class PersonInFo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ű�� �����Ը� �Է��ϼ���.");
		
		double num1 = input.nextDouble();
		int num2 = input.nextInt();
		
		System.out.printf("Ű : %.1f cm, ������ : %d kg", num1, num2);
		
		input.close();
		

	}

}
