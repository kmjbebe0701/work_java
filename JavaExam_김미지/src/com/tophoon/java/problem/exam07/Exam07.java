package com.tophoon.java.problem.exam07;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;

/*
 * 1. 패키지(Package) com.tophoon.java.problem.exam07을 생성하시오.
2. 클래스(Class) Exam07를 생성하시오.
3. Exam07 클래스에 main 메소드(Method)를 작성하시오.
4. public static void printTime() 메소드를 작성하시오.
- 클래스 Calendar 이용
- "2018년 1월 10일 08:59:05 | " 형식으로 출력하도록 작성

5. 표준입력으로 이름과 전화번호를 입력받아 클래스 HashMap을 사용하여
이름은 key으로 전화번호는 value로 저장하세요.
6. quit를 입력받으면 입력 받던 것을 멈추고
HashMap에 저장했던 전화번호부 내용을 출력하세요.
입출력예시)
2018년 1월 10일 08:59:05 | 이름을 입력하세요(quit: 종료) > 홍길동
2018년 1월 10일 08:59:14 | 전화번호를 입력하세요(quit: 종료) > 010-4500-7700
2018년 1월 10일 08:59:21 | 이름을 입력하세요(quit: 종료) > 김영희
2018년 1월 10일 08:59:25 | 전화번호를 입력하세요(quit: 종료) > 010-7788-1100
2018년 1월 10일 08:59:33 | 이름을 입력하세요(quit: 종료) > quit
=== 저장된 전화번호부 내용 ===
홍길동 : 010-4500-7700
김영희 : 010-7788-1100
 */

public class Exam07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("이름과 전화번호를 입력해주세요");
		String name;
		String num;

		while (true) {

			printTime();
			System.out.print("이름을 입력하세요(quit: 종료) > ");
			name = in.next();
			
			if (name.equals("quit")) {
				System.out.println("=== 저장된 전화번호부 내용 ===");
				for (String key : hm.keySet()) {
					String value = hm.get(key);
					System.out.println(key + ": " + value);
					
				}
				break;
				
			}
			printTime();
			System.out.print("번호을 입력하세요(quit: 종료) > ");
			num = in.next();
			if (num.equals("quit")) {
				System.out.println("=== 저장된 전화번호부 내용 ===");
				for (String key : hm.keySet()) {
					String value = hm.get(key);
					System.out.println(key + ": " + value);
					
				}
				break;
			}
			hm.put(name, num);

		}

	}

	public static void printTime() {
		Calendar cal = Calendar.getInstance();
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH);
		int dd = cal.get(Calendar.DATE);
		
		System.out.print(yy + "년 " + (mm+1) + "월 " + dd + "일 " );
		//System.out.print(cal.getTime() + " ");

	}

}
