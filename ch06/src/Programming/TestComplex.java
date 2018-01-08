package Programming;

public class TestComplex {

	public static void main(String[] args) {
		Complex x = new Complex(3.4, 4.5);
		Complex y = new Complex(5.2, -2.4);

		Complex res1 = Complex.add(x, y);
		Complex res2 = Complex.sub(x, y);

		System.out.println("더한 결과: " + res1.print());
		System.out.println("뺀 결과: " + res2.print());
		

		System.out.println("x의 절대값: " + x.abs());
		System.out.println("y의 절대값: " + y.abs());
		
		
	}

}
