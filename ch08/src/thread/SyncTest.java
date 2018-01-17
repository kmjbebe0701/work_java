package thread;

import java.util.Random;

class BankAccount {
	int balance = 0;		//은행잔고
	
	//인출
	public void withdraw (int money) {
		//현재 출금하려는 금액보다 잔고가 많은지 검사
		if (money > 0 && balance >=money) {
			try {
				Thread.sleep(100);
			}
			catch (InterruptedException e){
				System.err.println(e);
			}
			balance -= money;
			System.out.printf("%s가 %d원 인출하여 현재 잔고 %d원 입니다.%n",
					Thread.currentThread().getName(), money, balance);
		}
		else if (balance < money) {
			System.out.printf("%s의 잔고가 부족하여 인출할 수 없습니다(인출요청금액: %d).%n", 
					Thread.currentThread().getName(), money);
		}
	}
	
	//입금
	public void deposit (int money) {
		if (money > 0) {
			balance +=money;
			System.out.printf("%s가 %d원 입금하여 현재 잔고 %d원 입니다.%n",
					Thread.currentThread().getName(), money, balance);
		}
	}
}


public class SyncTest implements Runnable{
	BankAccount act = new BankAccount();


	@Override
	public void run() {					//임계영역(Critical Section)
		//하나로 만들어 다중 스레드가 동시실행하지 못하게 막는다 =>원자화(Atomic)
		while (true) {
			int amount = new Random().nextInt(10000);		//0~10000까지 중 랜덤한 숫자를 가져온다
			amount = amount%10 * 1000;		//10으로 나눈 나머지에 1000을 곱한값
			/*int amount = new Random().nextInt(9);
			amount = amount * 1000;*/				//위와 동일
			System.out.printf("[%s] 금액: %d원 %n", Thread.currentThread().getName(), amount);
			act.deposit(amount);			//입금
			act.withdraw(amount *2);		//출금(*2 는 잔고를 바닥나게 하기 위해)
			if (act.balance < 0) {
				System.out.printf("[%s] ", Thread.currentThread().getName());
				System.out.println("잔고: " + act.balance + " =>오류 종료");
				return;
			}
		}
		
	}

	public static void main(String[] args) {
		Runnable r = new SyncTest();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		
		th1.setName("철수");
		th2.setName("영희");
		
		th1.start();
		th2.start();

	}

}
