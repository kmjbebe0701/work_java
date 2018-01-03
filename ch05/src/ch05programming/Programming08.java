package ch05programming;

public class Programming08 {
	private String owner;
	private long balance;

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public Programming08() {
	}

	public Programming08(String owner) {
		super();
		this.owner = owner;
	}

	public Programming08(long balance) {
		super();
		this.owner = owner;
	}

	public Programming08(String owner, long balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}

	public long deposit(long amount) {
		return this.balance += amount;
	}

	public long withdraw(long amount) {
		long a = this.balance -= amount;
		if (a < 0) {
			System.err.println("잔액이 부족하여 인출이 불가합니다.\n");
			return this.balance = 0;
		} 
		else {
			return this.balance -= amount;
		}
	}

	public static void main(String[] args) {
		Programming08 p = new Programming08();
		p.deposit(100000);
		p.deposit(50000);
		p.deposit(5000);
		p.withdraw(1400000);
		System.out.println("잔액: " + p.balance);
	}

}
