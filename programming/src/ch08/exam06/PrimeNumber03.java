package ch08.exam06;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber03 implements Runnable {
	int max;
	List<Integer> array = new ArrayList<>();
	String name;

	public PrimeNumber03() {
	}
	
	public PrimeNumber03(int max) {
		super();
		this.max = max;
	}

	public PrimeNumber03(int max, String name) {
		super();
		this.max = max;
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 2, count = 0; i <= max; i++) {
			
			array.add(i);
			try {
				for (int b : array) {
					if (i != b && i % b == 0) {
						array.remove(count);
						--count;
						break;
					}
				}
				++count;
			} catch (Exception e) {
				System.out.println(e);
			}

		}
		System.out.println(Thread.currentThread().getName() + ":");

		for (int b : array) {
			System.out.print(b + " ");
		}

	}

}
