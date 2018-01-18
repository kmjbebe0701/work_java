package ch08.exam06;

public class Ex06 {

	public static void main(String[] args) {
		PrimeNumber03 pn = new PrimeNumber03(20, "소수 만드는 스레드");
		//pn.start();
		new Thread(new PrimeNumber03(25), "소수 만드는 스레드").start();

	}

}
