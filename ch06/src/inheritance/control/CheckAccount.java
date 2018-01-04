package inheritance.control;

import inheritance.access.Account;
import inheritance.access.SavingAccount;

public class CheckAccount extends Account{
	long minimum;

	public CheckAccount(String name, int number, long minimum) {
		super(name, number);
		this.minimum = minimum;
		super.deposit(minimum);			//deposit(minimum); 으로도 가능
	}

	public static void main(String[] args) {
		SavingAccount myAccount = new SavingAccount("김태희", 23467654, 0.34);
		myAccount.deposit(250000);
		myAccount.withdraw(50000);
		myAccount.checkBalance();
		
		System.out.println(myAccount.name);			//접근가능
		//System.out.println(myAccount.open);		//접근불가
		//System.out.println(myAccount.number);		//접근불가
		//System.out.println(myAccount.balance);	//접근불가
		
		CheckAccount cAccount = new CheckAccount("이민정", 87542356, 500000);
		cAccount.deposit(250000);
		cAccount.withdraw(50000);
		cAccount.checkBalance();
		
		System.out.println(cAccount.name);			//접근가능
		System.out.println(cAccount.open);			//접근가능
		//System.out.println(cAccount.number);		//접근불가
		//System.out.println(cAccount.balance);		//접근불가

	}

}
