package ch08.exam04;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumber01 extends Thread {
	int max;
	List<Integer> array = new ArrayList<>();

	public PrimeNumber01() {
	}

	public PrimeNumber01(int max) {
		super();
		this.max = max;
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

		for (int b : array) {
			System.out.print(b + " ");
		}

	}

}
