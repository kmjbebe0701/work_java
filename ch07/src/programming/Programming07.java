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
		String[] ab = new String[100];
		String str;
		
		
		System.out.println("표준입역으로 문자열을 여러 줄에 입력하세요.");
		System.out.println("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요");
		
		
		for (int i = 0; i <100; i++) {
			if (in.next().equals("quit")) {
				System.out.println("quit");
				break;
			}
			setA.add(in.next());
		}
		
		System.out.println(setA.toString());

		/*System.out.println(str);
		StringTokenizer st1 = new StringTokenizer(str);*/
		
		System.out.println(" 중복되지 않은 문자열 => " + setA.toString());
		System.out.println(" 중복되지 않은 문자열 => " + setB.toString());
		
		
	}
	
	public static void printToken(StringTokenizer st) {
		System.out.println("토큰 수: " + st.countTokens());
		int cnt = 0;
		while (st.hasMoreTokens()) {
			System.out.print(++cnt + ". " + st.nextToken() + " ");
		}
		System.out.println();
	}
	

}
