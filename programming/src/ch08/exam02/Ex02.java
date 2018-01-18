package ch08.exam02;

public class Ex02 {
	
	public static void main(String[] args) {
		BankAccount ba = new BankAccount(-100000);
		try {
			ba.withdraw(500000);
		} catch (InvalidWithdraw e) {
			System.out.println(e);
		}
		
	}

}
