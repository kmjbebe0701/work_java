package programming;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Programming07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		//Set<String> set = new HashSet<>();
		HashSet<String> setA = new HashSet<>();
		HashSet<String> setB = new HashSet<>();
		StringTokenizer st = new StringTokenizer(str);
		
		System.out.println("표준입역으로 문자열을 여러 줄에 입력하세요.");
		System.out.println("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요");

		for (int i =0; setA.contains("quit"); i++) {
		setA.add(in.next());
		}
		if(setA.contains("quit")) {
			in.close();
		}
		
		System.out.println(" 중복되지 않은 문자열 => " + setA.toString());
		System.out.println(" 중복되지 않은 문자열 => " + setB.toString());
		
		
	}

}
