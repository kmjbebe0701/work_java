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

	public static void main(String[] args) {
		
	}

}
