package programming;

import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Programming07 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashSet<String> setA = new HashSet<>();
		HashSet<String> setB = new HashSet<>();
		

		System.out.println("표준입력으로 문자열을 여러 줄에 입력하세요.");
		System.out.println("결과를 보시려면 마지막에 표준입력으로 quit를 입력하세요.");

		//강사님 해설
		while (true) {
			String text = in.next();
			if (text.equals("quit")) {
				break;
			}
			boolean 중복 =! setA.add(text);			//변수명은 한글이 가능하다.(But 안쓰는 이유가 있겠지..)
			if (중복) {							//setA.add(text)는 boolean값을 갖는다.
				setB.add(text);
			}
			setA.add(text);
		}
		in.close();
		
		/* 내가 한 방법2
		while (true) {
			String text = in.next();
			if (text.equals("quit")) {
				break;
			}
			if (setA.contains(text)) {
				setB.add(text);
			}
			setA.add(text);
		}
		*/
		
		setA.removeAll(setB);
		System.out.println("중복되지 않은 문자열 => " + setA.toString());
		System.out.println("중복된 문자열 => " + setB.toString());
		
		/*내가 한 방법 1
		String[] ab = new String[100];
		for (int i = 0; i < 100; i++) {

			ab[i] = in.next();
			if (ab[i].equals("quit")) {
				ab[i] = null;
				break;
			}
		}

		for (int i = 0; i < ab.length; i++) {
			
			if (setA.contains(ab[i])) {
				setB.add(ab[i]);
			}
			setA.add(ab[i]);
		}

		
		setA.removeAll(setB);
		setB.remove(null);
		

		

		System.out.println(" 중복되지 않은 문자열 => " + setA.toString());
		System.out.println(" 중복된 문자열 => " + setB.toString());
		*/

	}

}
