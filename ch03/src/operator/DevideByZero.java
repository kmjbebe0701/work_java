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
		if (!Double.isNaN(moneyDouble)) {	//money���� NaN�� �Էµɶ� �����ϰ� �߰� ���� ���� �Ҽ� �ִ� ��ġ
			double balance = 30000;
			balance = balance + moneyDouble;
			System.out.println(balance);
		}
		else {
			System.out.println("�ݾ��� �ٽ� �Է����ּ���.");
		}
		}

}

