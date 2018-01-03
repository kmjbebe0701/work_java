package ch05programming;

public class Programming10 {
	public int a;
	public String[] osType = {"윈도7", "애플OS X", "안드로이드"};
	public int m;
	
	public Programming10(String[] osType, int m) {
		super();
		this.osType = osType;
		this.m = m;
	}
	public Programming10(int a, int m) {
		super();
		this.a = a;
		this.m = m;
	}


	public void print() {
		System.out.println("운영체제 : " + osType[a] + ", 메인메모리 : " + m);
		
	}




	public static void main(String[] args) {
		Programming10 pc = new Programming10(0, 16);
		Programming10 apple = new Programming10(1, 32);
		Programming10 galaxy = new Programming10(2, 16);
		
		pc.print();
		apple.print();
		galaxy.print();

	}

}
