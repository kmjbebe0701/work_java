package programming.basic;

public class HelloVar {

	public static void main(String[] args) {
		
		//변수선언
		int var01;
		
		//변수 초기화
		var01 = 10;
		
		//변수선언 + 초기화
		int var02 = 100;
		
		//여러변수 선언하기
		int a1, b1, c1;
		a1 = 100;
		b1 = 200;
		c1 = 300;
		
		//지역변수는 초기화를 해야 사용 가능하다.
		int x1 = 1, y1 = 3;
		System.out.println(x1);
		
		
		byte b = 0xA;
		short s = 32767;					//32768은 문법 오류 발생
		long distance = 1500_00_000000L;	//21억을 초과하므로 L은 반드시 필요
		double d  = 1500E8D;				//정수형이 아님에 주의 (1500*E^8)
		
		int x, y = 10, z = 20;				//int 형의 여러 변수 선언
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(distance);
		System.out.println(d);
		System.out.println(y);
		System.out.println(z);
		
		
		
		

	}

}
