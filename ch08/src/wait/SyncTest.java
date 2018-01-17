package wait;

import java.util.Random;

class BankAccount {
	int balance = 0;			//은행잔고

	public synchronized void withdraw(int money) {
		if (money < 0) {
			System.out.println("인출 금액이 잘못됐습니다.");
			return;
		}
		int count = 0;
		while (balance < money) {
			System.out.printf("[%s] ", Thread.currentThread().getName());
			// 지속적으로 잔금이 부족하여 메소드 종료
			if (++count > 3) {
				System.out.println("잔액이 부족하여 출금처리 못하고 종료합니다.");
				return;
			}
			System.out.printf("%16s", "wait(1000) 호출: ");
			System.out.printf("인출 요구금액 = %6d원, balance=%6d원 %n", money, balance);
			try {
				// wait();
				wait(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
		System.out.printf("[%s] ", Thread.currentThread().getName());
		balance -= money;

		System.out.printf("%12s 정상인출금액 = %6d원, balance=%6d원 %n", "정상 출금처리: ", money, balance);

	}

	// 블록 동기화로 메소드 전체의 동기화 처리
	public synchronized void deposit(int money) {
		if (money < 0) {
			System.out.println("입금 금액이 잘못됐습니다.");
			return;
		}
		balance += money;
		System.out.printf("[%s] ", Thread.currentThread().getName());
		System.out.printf("%16s", "notify() 호출: ");
		System.out.printf("계좌입금금액 = %6d원, balance=%6d원 %n", money, balance);
		// notify();
		notifyAll();

	}
}

public class SyncTest implements Runnable {
	BankAccount act = new BankAccount();

	@Override
	public void run() {
		for (int i = 0; i < 3; i++) {
			int amount = (int) (new Random().nextDouble() * 5 + 1) * 10000;
			act.deposit(amount);
			amount = (int) (new Random().nextDouble() * 5 + 1) * 10000;
			act.withdraw(amount);
		}
	}

	public static void main(String[] args) {
		Runnable r = new SyncTest();
		new Thread(r).start();
		new Thread(r).start();

	}

}
