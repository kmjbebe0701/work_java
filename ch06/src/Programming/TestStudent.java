package Programming;

import java.util.Scanner;

public class TestStudent {
	public static void main(String[] args) {
		double[] a = new double[8];

		Scanner in = new Scanner(System.in);

		Student s = new Student("김다정", 20, "서울시 관악구", "동양서울대학교", "전산정보학과", 20132222);
		System.out.println("이름 : " + s.name);
		System.out.println("나이 : " + s.age);
		System.out.println("주소 : " + s.address);
		System.out.println("학교 : " + s.school);
		System.out.println("학과 : " + s.major);
		System.out.println("학번 : " + s.studentID);
		System.out.println("----------------------------------");
		System.out.println("8학기 학점을 순서대로 입력하세요");
		/*
		 * System.out.print("1학기 학점 → "); a[0] = in.nextDouble();
		 * System.out.print("2학기 학점 → "); a[1] = in.nextDouble();
		 * System.out.print("3학기 학점 → "); a[2] = in.nextDouble();
		 * System.out.print("4학기 학점 → "); a[3] = in.nextDouble();
		 * System.out.print("5학기 학점 → "); a[4] = in.nextDouble();
		 * System.out.print("6학기 학점 → "); a[5] = in.nextDouble();
		 * System.out.print("7학기 학점 → "); a[6] = in.nextDouble();
		 * System.out.print("8학기 학점 → "); a[7] = in.nextDouble();
		 */
		for (int i = 0; i < a.length; i++) {
			System.out.print((i + 1) + "학기 학점 → ");
			a[i] = in.nextDouble();
		}

		s.setAver(a);

		System.out.println("----------------------------------");
		s.average();

	}

}
