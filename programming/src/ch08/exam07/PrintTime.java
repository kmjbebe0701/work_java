package ch08.exam07;

import java.util.Date;

public class PrintTime implements Runnable{
	private int max;
	
	public PrintTime() {
	}
	public PrintTime(int max) {
		super();
		this.max = max;
	}



	@Override
	public void run() {
		for (int i =0; i < max; i++) {
			Date d = new Date();
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("순위: " + Thread.currentThread().getPriority() +" " + d
					 + " " + Thread.currentThread().getName());
			
		}
		
		
	}

}
