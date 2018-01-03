package obj.constructor;

public class Car {
	private int maxSpeed;
	private String brandName;
	private int speed;

	// 브랜드 이름을 지정하는 생성자
	public Car(String brandName) {
		this.brandName = brandName;
	}

	public Car(String brandName, int maxSpeed) {
		this.brandName = brandName;
		this.maxSpeed = maxSpeed;
	}

	// 속도 관련 메소드
	public int speedUp() {
		int tempSpeed = this.speed;
		tempSpeed += 30;

		// 최대 속도보다 더 높다면 이전 속도 유지
		if (tempSpeed > this.maxSpeed) {
			return this.speed;
		}
		// 최대속도보다 같거나 작다면 현재 속도를 갱신
		this.speed = tempSpeed;
		return this.speed;
	}

	public int speedDown() {
		int sDint = this.speed;
		sDint -= 20;

		if (sDint < 0) {
			return 0;
		}

		this.speed = sDint;
		return speed;

	}
	

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
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
		System.out.println("차종: " + myCar.brandName + ", 최고속도: " + myCar.getMaxSpeed() + ", 현재속도: " + myCar.speedDown());
		
	}

}
