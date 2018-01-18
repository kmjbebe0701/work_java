package ch08.exam02;

public class InvalidWithdraw extends Exception{

	private static final long serialVersionUID = 1L;
	//해당 클래스의 버전을 적는다.(임의로)
	public InvalidWithdraw(String msg) {
		super(msg);
	}

}
