package ch04programming;

import java.util.Scanner;

public class Programming03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력해주세요");
		String a = in.next();
		char[] be =new char[a.length()];
		
		
		int i = 0;
		int j = 1;
		
		//String.length() : 글자 수 리턴
		
		do {
			char b = a.charAt(i);
			be[(a.length()-i-1)] = b;
			i++;
			
		}while(i<a.length());
		
		System.out.print(be);
			

	}

}
