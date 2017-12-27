package operator;

public class DevideByZero {

	public static void main(String[] args) {
		short data1 = 32766;
		short data2 = 1;
		
		short data3 = (short)(data1 + data2);
		short data4 = 32766 + 1;
		
		System.out.println(data3 + " " +data4);
		
		System.out.println(0.0 / 0.0);
		System.out.println(3 / 0.0);
		//System.out.println(3 / 0);
		
		String money = "10000";
		double moneyDouble = Double.parseDouble(money);
		if (!Double.isNaN(moneyDouble)) {	//money값에 NaN이 입력될때 안전하게 추가 값을 보존 할수 있는 장치
			double balance = 30000;
			balance = balance + moneyDouble;
			System.out.println(balance);
		}
		else {
			System.out.println("금액을 다시 입력해주세요.");
		}
		}

}

