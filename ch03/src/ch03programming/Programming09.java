package ch03programming;

import java.util.Scanner;

public class Programming09 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Ű�� �����Ը� �Է��ϼ���.");
		double a = in.nextDouble();
		double b = in.nextDouble();
		
		String str = (b <= (a-100)*0.9) ? "�����Դϴ�." : "���Դϴ�";
		System.out.println(str);

	}

}
