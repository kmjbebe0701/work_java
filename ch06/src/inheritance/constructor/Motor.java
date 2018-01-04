package inheritance.constructor;


public class Motor extends Vehicle{
	private String name = "자동차";
	private int displacement;
	
	public Motor() {
	}
	public Motor(double maxSpeed, int seater, int displacement) {
		super(maxSpeed,seater);
		this.displacement = displacement;
	}

	public void printInfo() {
		System.out.print(super.getName() + ": " + this.name);
		System.out.println(", 최대속도: " + super.getMaxSpeed() + "km");
		System.out.print("정원: " + this.getSeater() + "명");
		System.out.println(", 배기량 " + displacement + "cc");
	}

	public static void main(String[] args) {
		
		Motor myCar = new Motor(300, 4, 500);
		myCar.printInfo();
		

	}

}