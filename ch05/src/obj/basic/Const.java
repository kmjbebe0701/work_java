package obj.basic;

public class Const {

	public static void main(String[] args) {
		//final : 변수형 말고도 class(마지막 클래스, 상속받지 못함), 메소드(오버라이드를 할 수 없음)...사용가능
		final int maxSize = 5;			//final 사용시 선언과 초기화를 동시에 사용
		//maxSize = 8;			오류발생
		int data[] = new int[maxSize];
		System.out.println("배열크기 : " + data.length + "%n 배열크기 : " + maxSize);

	}

}
