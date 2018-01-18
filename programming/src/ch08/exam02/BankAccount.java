package ch08.exam02;

public class BankAccount {
	int limit; // 최저잔금
	int balance; // 잔액

	public BankAccount() {
	}

	public BankAccount(int limit) {
		this.limit = limit;
	}

	// 출금메소드
	public void withdraw(int money) throws InvalidWithdraw {
		if (money < 0 || balance - money < limit) {
			throw new InvalidWithdraw("인출 금액을 다시 설정해주세요.");
		} else {
			balance -= money;
			System.out.printf("정상 출금 처리: 인출금액 = %8d, 잔금 = %8d%n", money, balance);
		}
	}

	// 입금메소드
	public void deposit(int money) {

		balance += money;
		System.out.printf("정상 입금 처리: 입금금액 = %8d, 잔금 = %8d%n", money, balance);

	}

}
