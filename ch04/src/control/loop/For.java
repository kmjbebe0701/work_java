package control.loop;

public class For {

	public static void main(String[] args) {
		int i = 1;
		for (i = 1; i <=10; i++)
			System.out.print(i + " ");
		System.out.println();
		
		int sum = 0;
		for (i = 1, sum = 0; i <= 10; sum += i, i++);
		//for (i = 1, sum = 0; i <=10; i++)
		//sum += i;
		System.out.printf("합 : %d%n", sum);
		
		for (int j = 1, total = 0; j <=5; j++) {
			total += j;
			System.out.printf("1에서 %d까지 합은%d 입니다.%n", j, total);
		}
		
		//다음 문장 오류 발생, 변수 j, total 사용불가
		//System.out.printf("1에서 %d까지 합은%d 입니다.%n", j-1, total);

	}

}
