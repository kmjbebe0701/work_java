package Programming;

public class Car {
	int maxSpeed;
	int speed;

	public Car(int maxSpeed) {
		super();
		this.maxSpeed = maxSpeed;
	}

	public int speedUp() {
		if (speed+5 > maxSpeed) {
			System.out.printf("speedUp() 호출: 최대속도보다 높아 최대 속도로 지정, 최대속도: %d, 현재속도: %d\n",maxSpeed,maxSpeed);
			return this.speed = maxSpeed;
		}
		else {
			this.speed += 5;
		System.out.printf("speedUp() 호출: 최대속도: %d, 현재속도: %d\n",maxSpeed,this.speed);
		}
		return this.speed;
		
	}

	public int speedUp(int speed) {
		if (speed + this.speed > maxSpeed) {
			System.out.printf("speedDown(%d) 호출: 최대속도보다 높아 최대 속도로 지정, 최대속도: %d, 현재속도: %d\n", speed, maxSpeed, maxSpeed);
			return this.maxSpeed;
		}

		else if (speed < 0) {
			System.out.printf("speedUp(%d) 호출: 오류: 속도가 음수이므로 0으로 지정: 최대속도: %d, 현재속도: %d\n", speed, maxSpeed, this.speed);
			speed = 0;
		} else {
			this.speed += speed;
			System.out.printf("speedUp(%d) 호출: 최대속도: %d, 현재속도: %d\n", speed, maxSpeed, this.speed);
		}
		return this.speed;
	}

	public int speedDown() {
		if (speed-5 < 0) {
			System.out.printf("speedDown() 호출: 오류: 속도가 0보다 작아져 0으로 지정: 최대속도: %d, 현재속도: %d\n",  maxSpeed,0);
			speed = 0;
		} else {
			this.speed -= 5;
			System.out.printf("speedDown(%d) 호출: 최대속도: %d, 현재속도: %d\n", speed, maxSpeed, this.speed);
		}
		return this.speed;
	}

	public int speedDown(int speed) {
		int a = this.speed - speed ;
		if (speed < 0) {
			System.out.printf("speedDown(%d) 호출: 오류: 속도가 음수이므로 0으로 지정: 최대속도: %d, 현재속도: %d\n", speed, maxSpeed,
					this.speed);
			
		}
		else if (a < 0) {
			
			System.out.printf("speedDown(%d) 호출: 오류: 속도가 0보다 작아져 0으로 지정: 최대속도: %d, 현재속도: 0\n",speed, maxSpeed);
			this.speed = 0;
		}
		else {
			this.speed -= speed;
			System.out.printf("speedDown(%d) 호출: 최대속도: %d, 현재속도: %d\n", speed, maxSpeed, this.speed);
		}
		return this.speed;
	}
	public static void main(String[] args) {
		Car myCar = new Car(300);
		myCar.speedUp();
		myCar.speedUp();
		myCar.speedUp(-50);
		myCar.speedUp(50);
		myCar.speedDown(-30);
		myCar.speedDown(30);
		myCar.speedDown(30);
		myCar.speedDown(30);
		myCar.speedUp(100);
		myCar.speedUp(300);
		
		
	}

}
