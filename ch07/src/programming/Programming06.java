package programming;

import java.util.Calendar;

public class Programming06 {
	
	public static void main(String[] args) {
		Calendar start = Calendar.getInstance();
		Calendar end = Calendar.getInstance();
		
		int year = start.get(Calendar.YEAR);
		int month = start.get(Calendar.MONTH);
		
		start.set(year,month,01);
		end.set(year,month+1,01);
		end.add(Calendar.DATE, -1);

		System.out.printf("   %d년 %d월 달력    %n",year, month +1);
		System.out.println();
		System.out.printf(" 일   월   화   수   목   금   토  %n");
		
		
		for (int i = 1, a = 1; a <= end.get(Calendar.DATE);i++) {
			if (i < start.get(Calendar.DAY_OF_WEEK)) {
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
