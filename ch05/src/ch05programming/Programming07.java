package ch05programming;

public class Programming07 {
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
	
	public Programming07() {
	}
	public Programming07(String owner) {
		super();
		this.owner = owner;
	}
	public Programming07(long balance) {
		super();
		this.owner = owner;
	}
	public Programming07(String owner, long balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	
	public long deposit (long amount) {
		return this.balance += amount;
	}
	public long withdraw (long amount) {
		return this.balance -= amount;
	}
	
	public static void main(String[] args) {
		Programming07 p = new Programming07();
		p.deposit(100000);
		p.deposit(50000);
		p.deposit(5000);
		p.withdraw(115000);
		System.out.println("잔액: " + p.balance);
	}
	

}
