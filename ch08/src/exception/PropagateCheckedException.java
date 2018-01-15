package exception;

public class PropagateCheckedException {
	// 메소드 선언 에서 다시 예외 ClassNotFoundException의 발생을 전달

	public static void main(String[] args) throws ClassNotFoundException {
		// 상위 메소드로 예외를 전달
		// Class.forName() 사용시 반드시 예외처리를 해야함

		System.out.println(Class.forName("java.lang.Object"));

	}

}
