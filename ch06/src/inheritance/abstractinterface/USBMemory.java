package inheritance.abstractinterface;

public class USBMemory extends Device implements Connectable{
	
	public void print() {
		System.out.println("삼성 USB 메모리 입니다.");
	}
	
	public void connect() {
		System.out.println(name + ", 삼성 USB 메모리를 연결합니다.");
	}

}
