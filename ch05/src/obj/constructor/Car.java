package obj.constructor;

public class Car {
	private int maxSpeed;
	public String brandName;
	public int speed;
	
	//브랜드 이름을 지정하는 생성자
	public Car(String brandName) {
		this.brandName = brandName;
	}
	public Car(String brandName,int maxSpeed) {
		this.brandName = brandName;
		this.maxSpeed = maxSpeed;
	}
	
	//속도 관련 메소드
	public int speedUp () {
		return speed += 30;
	}
	public int speedDown () {
		return speed -= 20;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐", 300);
		myCar.speedUp();
		myCar.speedUp();
		System.out.println("차종: " + myCar.brandName + ", 최고속도: " + myCar.getMaxSpeed()
							+ ", 현재속도: " + myCar.speedDown());
	}

}
