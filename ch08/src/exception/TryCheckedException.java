package exception;

public class TryCheckedException {

	public static void main(String[] args) {
		// Class.forName() 사용시 반드시 예외처리를 해야함
		try {				//Ctrl + 1 단축키로 생성 가능 (직접 처리 방법)
			System.out.println(Class.forName("java.lang.Object"));
		}
		catch (ClassNotFoundException ex) {
			System.out.println(ex);
		}

	}

}
