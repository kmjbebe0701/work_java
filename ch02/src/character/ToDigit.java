package character;

import java.util.Scanner;

public class ToDigit {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("��ȯ�� ������ �Է��ϼ���.");
		
		int num = input.nextInt();
		
		System.out.printf("8���� : %1$o, 10���� : %1$d, 16���� : %1$h", num);
	}

}
