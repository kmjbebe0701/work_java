package ch03programming;

import java.util.Scanner;

public class Programming08 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("�� ������ �Է��ϼ���.");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		
		int max = (a>b) ? ((a>c)? a : c) : ((b>c)? b : c);
		
		System.out.printf("���� ū ���� %d �Դϴ�.", max);
			
		}
		

}
