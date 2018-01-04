package ch05programming;

public class Programming08Test {

	public static void main(String[] args) {
		Programming08 p = new Programming08();
		p.deposit(100000);
		p.deposit(50000);
		p.deposit(5000);
		p.withdraw(1400000);
		System.out.println("잔액: " + p.getBalance());
	}

}
