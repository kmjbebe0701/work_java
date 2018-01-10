package enumeration;

public class EnumTest {
	public enum pl {c, cpp, java, csharp};				//클래스 기반으로 만든 타입
	public int[] a = {10, 20, 30};
	

	public static void main(String[] args) {
		pl clang = pl.c;								//정의한 열거 유형은 하나의 자료 유형으로 이용
		System.out.println(clang/*.toString()*/);		//저장된 상수 문자열이 출력(.toString 컴파일러가 자동 만듬)
		
		clang = pl.csharp;
		switch(clang) {
		case csharp:
			System.out.println(clang + ": C#언어");
			
		}
		for (pl p : pl.values()) {
			System.out.print(p + " ");
		}
		System.out.println();
		
		
		EnumTest e = new EnumTest();
		for (int item : e.a) {
			System.out.print(item + " ");
		}
		System.out.println();


	}

}
