package inheritance.access;

import java.util.Date;

/*
 * 접근제한자
 * - private : 같은 클래스 내부에서만 사용가능 
 * - (default, package 방식) : 패키지 내부에서만 사용가능
 * - protected : default접근 범위 + 상속받은 클래스 내부(main은 포함x)까지 사용가능
 * - public :어디서든 접근 가능
 */

public class Account {
	public String name;
	protected Date open;
	protected int num;
	/*package*/ int number;
	private long balance;

	//생성자(동일 패키지, 하위 클래스에서 사용 가능)
	protected Account(String name, int number) {
		super();
		this.name = name;
		this.number = number;
		this.open = new Date();
	}
	protected Account(String name, int number,long balance) {
		super();
		this.name = name;
		this.number = number;
		this.balance = balance;
		this.open = new Date();
	}
	public Account() {
	}
	
	//일반 메소드
	//입금메소드
	public long deposit (long amount) {
		return balance += amount;
	}
	//출금메소드
	public long withdraw (long amount) {
		return balance -= amount;
	}
	//계좌정보 및 잔액 출력 메소드
	public long checkBalance() {
		System.out.println(name + ": 계좌번호" + number + ", 잔액" + balance);
		return balance;
	}
	
	public void testAccess() {
		String a = this.name;
		Date b = this.open;
		int c = this.number;
		long d = this.balance;
	}

}
