package com.koitt.java.deliver;

public class Pizza extends Process{

	@Override
	public void ordering() {
		System.out.println("피자 주문을 받는다.");
		
	}

	@Override
	public void cooking() {
		System.out.println("피자 요리를 한다.");
		
	}

	@Override
	public void delivering() {
		System.out.println("피자 배달을 한다.");
		
	}

	@Override
	public void payment() {
		System.out.println("피자결제를 받는다.");
		
	}

}
