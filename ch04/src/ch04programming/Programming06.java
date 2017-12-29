package ch04programming;

public class Programming06 {

	public static void main(String[] args) {
		
		
		for (int i = -60; i <=140; i=i+20) {
			double f = (9.0/5.0)*i + 32;
			System.out.printf("섭씨온도(C) %d의 화씨온도(F)는 : %.0f%n", i, f);
		}
		
		

	}

}
