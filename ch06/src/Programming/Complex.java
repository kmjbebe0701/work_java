package Programming;

public class Complex {
	double a;
	double bi;
	
	
	public Complex(double a, double bi) {
		super();
		this.a = a;
		this.bi = bi;
	}
	
	public static Complex add (Complex c1, Complex c2) {
		int c1A = (int)(c1.a + 10.0);
		int c1B = (int)(c1.bi + 10.0);
		int c2A = (int)(c2.a + 10.0);
		int c2B = (int)(c2.bi + 10.0);
		Complex c = new Complex((c1A + c2A)/10.0, (c1B + c2B)/10.0);
		return c ;
	}
	public static Complex sub (Complex c1, Complex c2) {
		int c1A = (int)(c1.a + 10.0);
		int c1B = (int)(c1.bi + 10.0);
		int c2A = (int)(c2.a + 10.0);
		int c2B = (int)(c2.bi + 10.0);
		Complex c = new Complex((c1A - c2A)/10.0, (c1B - c2B)/10.0);
		return c ;
	}
	public double abs() {
		//Math.sqrt(a*a + bi*bi);
		Math.sqrt(Math.pow(this.a,2) + Math.pow(this.bi, 2));
		return Math.sqrt(Math.pow(this.a,2) + Math.pow(this.bi, 2));
	}
	
	public String print() {
		return this.a + " + " + this.bi + "i";
	}


}
