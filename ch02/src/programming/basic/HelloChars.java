package programming.basic;

public class HelloChars {

	public static void main(String[] args) {
		
		System.out.println('a');			//일반문자 char 형
		System.out.println('\\');			//특수문자 \ 출력
		System.out.println('\142');			//코드값 8진수 표현 142의 ASCII코드값 (10진수 98값)
		System.out.println('\uAC00');		//코드값 16진수 표현 UTF-8(Unicode)값
		System.out.println('\uAC01');		//코드값 16진수 표현 UTF-8(Unicode)값
		System.out.println('강');			//일반문자
		
		System.out.println("Hello\nWorld\tHi\bA\rB");
		System.out.println("\'");
	}

}
