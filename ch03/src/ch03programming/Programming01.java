package ch03programming;

import java.util.Scanner;

public class Programming01 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("�հ� ����� ���� �� �Ǽ��� �Է����ּ���.");
	
	double a = in.nextDouble();
	double b = in.nextDouble();
	
	System.out.printf("%.2f �� %.2f �� �� : %.2f\n",a ,b ,a+b);
	System.out.printf("%.2f �� %.2f �� ��� : %.2f\n",a ,b ,(a+b)/2);
	
	in.close();
		

	}

}
