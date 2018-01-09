package programming;

import java.util.Calendar;

public class CalenderTest {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		//System.out.println("이 달의 " +cal.get(Calendar.DAY_OF_WEEK_IN_MONTH)+ "번째 " +  + " 입니다.");
		System.out.println("이 달의 " +cal.get(Calendar.WEEK_OF_MONTH)+ "번째 주 입니다.");
		System.out.println("이 해의 " +cal.get(Calendar.DAY_OF_YEAR)+ "일 입니다.");
		System.out.println("이 해의 " + cal.get(Calendar.WEEK_OF_YEAR) + "번째 주 입니다.");
		
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));
		System.out.println(cal.getTime());
		System.out.println(cal.getTime());
		System.out.println(cal.getTime());
		
		switch (cal.get(Calendar.DAY_OF_WEEK)){
	    case 1:
	        System.out.println("일요일");
	        break;
	    case 2:
	        System.out.println("월요일");
	        break;
	    case 3:
	        System.out.println("화요일");
	        break;
	    case 4:
	        System.out.println("수요일");
	        break;
	    case 5:
	        System.out.println("목요일");
	        break;
	    case 6:
	        System.out.println("금요일");
	        break;
	    case 7:
	        System.out.println("토요일");
	        break;
		}
		
	}
		

	

}
