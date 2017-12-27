package array.basic;

public class ArrayDeclaration {

	public static void main(String[] args) {
		
		int[] month;
		double[] values;
		
		
		month = new int[4];
		values = new double[3];
		System.out.println(month.length);
		System.out.println(values.length);
		
		
		char[] ch = new char[6];
		float[] data = new float[5];
		data = new float[7];				//다른 배열 객체를 생성하여 저장
		System.out.println(ch.length);		//ch 배열 크기 출력
		System.out.println(data.length);	//data 배열 크기 출력
		
		//정적배열
		String[] weeks = {"월","화","수", "목", "금", "토", "일"};
		System.out.println(weeks.length);	//배열 크기 출력

	}

}
