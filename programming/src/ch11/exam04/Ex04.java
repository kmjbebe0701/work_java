package ch11.exam04;

import java.io.File;
/*
 * 현재 폴더 기준
 * 이클립스: 프로젝트 최상위폴더
 * cmd: 현재 실행 폴더 //cmd로 실행할때 src폴더들어가서 실행
 * 
 * ./은 현재 폴더 하위 폴더
 */

public class Ex04 {
	public static void main(String[] args) {
		
		//명령행에서 폴더명을 입력받아 File객체화
		File directory = new File("src/ch11/exam04/", args[0]);
		
		//폴더 생성
		boolean isMake = directory.mkdir();
		if (isMake) {
			System.out.println("폴더가 생성되었습니다");
		}
		else {
			System.out.println("폴더가 생성 실패했습니다");
		}
	}

}
