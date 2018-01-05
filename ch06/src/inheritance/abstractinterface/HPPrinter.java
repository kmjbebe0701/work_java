package inheritance.abstractinterface;

public class HPPrinter extends Device implements Connectable{
	public void print() {
		System.out.println("HP 프린터 입니다.");
	}
	
	public void connect() {
		System.out.println(Connectable.name + ", HP프린터를 연결합니다.");
	}

}
