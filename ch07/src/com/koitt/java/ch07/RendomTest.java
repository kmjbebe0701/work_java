package com.koitt.java.ch07;

import java.util.Random;

public class RendomTest {

	public static void main(String[] args) {
		Random rd = new Random();
		//Random rd = new Random(45);
		
		for (int i =0; i<6; i++) {
			System.out.print(rd.nextInt() + " ");
		}
		System.out.println();
		
		for (int i =0; i<6; i++) {
			System.out.print((rd.nextInt(44)+1) + " ");			//1부터 45까지의 숫자(
		}
		System.out.println();
		
		for (int i =0; i<6; i++) {
			System.out.printf("%.2f",rd.nextDouble());
		}
		System.out.println();

	}

}
