package programming;

import java.util.Calendar;
import java.util.Scanner;

public class ScannerDay {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Calendar cal = Calendar.getInstance();
		
		
		System.out.println("년, 월 , 일을 입력하세요 (yyyy mm dd)");
		int yy = in.nextInt();
		int mm = in.nextInt();
		int dd = in.nextInt();
		
		
		cal.set(yy, mm, dd);
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
