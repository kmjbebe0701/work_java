package exercise;

public class Exercise06 {
	double width, height;

	public Exercise06() {
		super();
	}
	public Exercise06(double width) {
		super();
		this.width = width;
	}
	public Exercise06(double width, double height) {
		//문법오류 수정
		this(width);
		this.height = height;
	}
	public static void main(String[] args) {
		//오류 수정(기본 메소드 추가)
		Exercise06 ex = new Exercise06();
	}
	

}
