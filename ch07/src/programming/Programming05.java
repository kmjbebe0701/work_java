package programming;

import java.util.Calendar;

public class Programming05 {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		String day = null;

		switch (cal.get(Calendar.DAY_OF_WEEK)) {
		case 1:
			day ="일요일";
			break;
		case 2:
			day ="월요일";
			break;
		case 3:
			day ="화요일";
			break;
		case 4:
			day ="수요일";
			break;
		case 5:
			day ="목요일";
			break;
		case 6:
			day ="금요일";
			break;
		case 7:
			day ="토요일";
			break;
		}

		System.out.println("오늘은 " + cal.get(Calendar.YEAR) + "년 " + (cal.get(Calendar.MONTH) + 1) + "월 "
				+ cal.get(Calendar.DATE) + "일 " + day + "입니다.");
		System.out.println("이 달의 " + cal.get(Calendar.DAY_OF_WEEK_IN_MONTH) + "번째 " + day + " 입니다.");
		System.out.println("이 달의 " + cal.get(Calendar.WEEK_OF_MONTH) + "번째 주 입니다.");
		System.out.println("이 해의 " + cal.get(Calendar.DAY_OF_YEAR) + "일 입니다.");
		System.out.println("이 해의 " + cal.get(Calendar.WEEK_OF_YEAR) + "번째 주 입니다.");

	}

}
