package programming;

import java.util.Calendar;

public class Programming06 {
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(2018,(01-1),01);

		System.out.println(cal.getTime());
		System.out.printf("   2018년 1월 달력    %n");
		System.out.printf(" 일   월   화   수   목   금   토  %n");
		
		
		//int a = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		
		
		for (int i = 1, a = 1;a<=31;i++) {
			if (i < cal.get(Calendar.DAY_OF_WEEK)) {
				System.out.printf("   ");
				continue;
			}
			if (i % 7 ==0) {
				System.out.printf("%2d%n", a);
				++a;
				continue;
			}
			System.out.printf("%2d ", a);
			++a;
		}
		
 		
		
	}

}
