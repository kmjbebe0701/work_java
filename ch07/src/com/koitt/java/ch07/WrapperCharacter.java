package com.koitt.java.ch07;

public class WrapperCharacter {

	public static void main(String[] args) {
		//Character ch = new Character('@');
		Character ch = '@';								//boxing
		Character ch2 = '!';	
		System.out.print(ch + " ");						//unboxing (자동으로 변환하여 출력하는것)
		System.out.print(ch.charValue() + " ");			//메소드 호출(char 형)
		System.out.println(ch.toString());				//메소드 호출(String 형)
		System.out.print(ch.compareTo('@') + " ");		
		//compareTo('@') <- ()안 값과비교 //(주소값 비교 x-y 형식)다른점이 없어서 0출력
		System.out.println(ch.hashCode());				//가짜 주소 값(@의 주소값)
		System.out.println(ch2.hashCode());				//constant pool 에 @하나를 ch,ch2가 같이 지목,
		System.out.println();
	
		
		//정적 메소드
		System.out.print(Character.toUpperCase('d') + " ");
		System.out.println(Character.toLowerCase('F'));
		System.out.print(Character.getName('@') + ", ");
		System.out.print(Character.getName('|') + ", ");
		System.out.println(Character.getName('^') + " ");
		System.out.print(Character.isDigit('$') + " ");		//숫자인지 아닌지 비교 //숫자가 아니므로false
		System.out.println(Character.isDigit('5'));			//숫자인지 아닌지 비교 //숫자가 이므로true



	}

}
