package inheritance.abstractinterface;

public interface Connectable {
	//상수정의
	/*
	 * (public), static, final만 사용가능
	 * 생략시 컴파일러가 자동으로 public 생성
	 */
	public static final String name = "연결방법: USB";
	
	//추상 메소드 선언
	public abstract void connect();

}
