package ch05programming;

public class Programming06 {
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
	public Programming06() {
	}
	public Programming06(String owner) {
		super();
		this.owner = owner;
	}
	public Programming06(long balance) {
		super();
		this.owner = owner;
	}
	public Programming06(String owner, long balance) {
		super();
		this.owner = owner;
		this.balance = balance;
	}
	
	

}
