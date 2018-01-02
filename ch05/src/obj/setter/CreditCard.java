package obj.setter;

/**
 * @author KOITT
 *
 */
public class CreditCard {
	public String owner;
	private long number;
	private int point;
	private int balance;
	
	//카드 사용 메소드
	public void use(int amount) {
		this.balance += amount;
	}
	
	//카드 비용 지불 메소드
	public void payBill (int amount) {
		this.balance -=amount;
		addPoint(amount);
	}
	
	//카드 포인트 추가 메소드
	public void addPoint (int amount) {
		this.point +=amount/1000;
	}
	/*
	 * getter, setter (캡슐화)
	 * getter, setter 만들기 단축키 : Alt + Shift + S
	 */

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		if(number < 1000_0000_0000_0000L) {
			System.err.println("잘못된 카드 번호입니다.");
			return;
		}
		this.number = number;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

}
