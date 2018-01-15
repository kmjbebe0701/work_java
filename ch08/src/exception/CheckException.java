package exception;

public class CheckException {

	public static void main(String[] args) {
		// Class.forName() 사용시 반드시 예외처리를 해야함
		try {
			System.out.println(Class.forName("java.lang.Object"));
		} catch (ClassNotFoundException e) {
			/*
			 * 자동완성의 폐해
			 * printStackTrace()는 예외에 대한 상세한 정보를 콘솔에 출력하기 때문에
			 * 프로그램 배포시에는 꼭 막아야한다. (오류 클릭시 코드 노출)
			 * (Debug용으로만 제발!!!!!! 사용 바랍니다.)
			 */
			e.printStackTrace();
		}
		
		/*
		System.out.println(Class.forName("java.lang.Object");
		
		Class<?> forName = Class.forName("java.lang.Object");
		System.out.println(forName);			//위와 같음
		*/
	}

}
