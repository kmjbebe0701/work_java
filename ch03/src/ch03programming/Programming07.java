package ch03programming;

import java.util.Scanner;

public class Programming07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("��(month)�� �Է��ϼ���.");
		int a = in.nextInt();
		
		String str = (a <= 6) ? "��ݱ� �Դϴ�." : "�Ϲݱ� �Դϴ�.";
		System.out.printf("%d������ %s", a, str);
		
		

	}

}
