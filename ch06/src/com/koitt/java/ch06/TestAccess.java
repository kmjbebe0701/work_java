package com.koitt.java.ch06;

import javax.security.auth.login.AccountException;

import inheritance.access.Account;

public class TestAccess extends Account {
	

	public TestAccess(String name, int num, long balance) {
		super(name, num, balance);
	}

	public TestAccess() {
	}


	public static void main(String[] args) {
		Account account = new Account();
		String name = account.name;
		//int num = account.num;
		TestAccess t = new TestAccess();
		//int num = t.num;

	}

}
