package exception;

public class ExceptionHandling {
	static int num[];

	public static void main(String[] args) {
		String str[] = { "안녕하세요!", "Hello" };

		try {
			System.out.println(str[0]);
			System.out.println(num.length);				//예외발생
			System.out.println(str[2]);					//예외발생으로 이 문장은 실행 안됨.
		} catch (Exception e) {
			//System.out.println("예외발생: " + e.toString());
			System.out.println("예외 발생: " + e);
			System.out.println("예외 발생 메세지: " + e.getMessage());		
			//지금은 나타나지 않는다.(메세지가 입력되지 않았기때문)
			e.printStackTrace();			//원래 출력되는 오류 메세지
		} finally {
			System.out.println("try 실행");
		}
		System.out.println("프로그램이 정상적으로 종료됩니다.");

	}
}
