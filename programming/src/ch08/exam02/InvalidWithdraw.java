package ch08.exam02;

public class InvalidWithdraw extends Exception{

	private static final long serialVersionUID = 1L;
	public InvalidWithdraw(String msg) {
		super(msg);
	}

}
