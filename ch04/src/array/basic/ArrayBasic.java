package array.basic;

public class ArrayBasic {

	public static void main(String[] args) {
		
		double[] points = new double[3];
		
		points[0] = 28.567;				//첨자가 0-3 까지 유효
		points[1] = 29;
		points[2] = 30;
		//points[3] = 31;			//실행시 오류 발생
		
		System.out.println(points.length);
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		//System.out.println(points[3]);			//실행시 첨자 유효 값을 벗어난 오류(3) 발생



	}

}
