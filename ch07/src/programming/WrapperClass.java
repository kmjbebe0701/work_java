package programming;

public class WrapperClass {

	public static void main(String[] args) {
		/*
		Byte b = new Byte("1");							//String 타입, 명시적 형변환 이용
		Short s = new Short((short)100);				//String 타입, 명시적 형변환 이용
		Integer i = new Integer(20);
		Long l = new Long(100_000_000_000L);
		Float f = new Float(1.2);
		Double d = new Double(3.45);
		Character c = new Character('c');
		Boolean bool1 = new Boolean("true");
		*/
		
		Byte by = 1;
		Short sh = 100;
		Integer in = 20;
		Long lo = 100_000_000_000L;
		Float fl = new Float(1.2);
		Double dou = 3.45;
		Character ch = 'c';
		Boolean bool = new Boolean("true");
		
		System.out.printf("%d %d %d %d %.2f %.2f %c %b",by, sh, in, lo, fl, dou, ch, bool);
		

	}
	
}
