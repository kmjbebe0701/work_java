package array.basic;

public class Arrycopy {

	public static void main(String[] args) {
		int[] copyFrom = {1, 2, 3, 4, 5, 6, 7};
		int[] copyTo = {10, 20, 30, 40, 50, 60, 70, 80};
		
		//System.arraycopy(src(소스), srcPos(소스위치(어디부터 진행?)), dest(목적지), destPos(목적지 위치), length(몇칸 사용?);
		System.arraycopy(copyFrom, 4, copyTo, 1, 3);
		
		for (int i = 0; i < copyFrom.length; i++)
			System.out.print(copyFrom[i] + " ");
		System.out.println();
		
		//for-each문
		for (int value : copyTo)
			System.out.print(value + " ");

	}

}
