package thread;
class IncThread extends Thread {
	//생성자 구현
	public IncThread(String name) {
		setName(name);				//생성자 이름 지정
	}
	
	public void run () {
		for (int i = 1; i < 5; i++) {
			try {
				sleep(50);
				/*System.out.print(getName() + ": " + i);
				System.out.println(", 활성화된 스레드 수: " + activeCount());*/
				System.out.println(getName() + ": " + i + ", 활성화된 스레드 수: " + activeCount());
				//한줄로 합치면 중간에 겹치는 현상이 사라진다.
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class DecThread extends Thread {
	public void run() {
		for(int i = 5; i >1; i--) {
			try {
				sleep(50);				//50밀리초 동안에 잠깐 쉬어라 (1000밀리초 = 1초)
				/*System.out.print(getName() + ": " + i);
				System.out.println(", 활성화된 스레드 수: " + activeCount());*/
				System.out.println(getName() + ": " + i + ", 활성화된 스레드 수: " + activeCount());
				//한줄로 합치면 중간에 겹치는 현상이 사라진다.
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadTest {

	public static void main(String[] args) {
		IncThread inc = new IncThread("증가 스레드");
		inc.start();							//시작점이 위에 있다고 먼저 시작하지 않는다.
		DecThread dec = new DecThread();
		dec.start();

	}

}
