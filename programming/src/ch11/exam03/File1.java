package ch11.exam03;

import java.io.File;

public class File1 {
	
	public static void main(String[] args) {
		
		//exam03 폴더 객체화
		File f1 = new File("src/ch11/exam03");
		
		//f1폴더 내부 목록 제공
		String[] list = f1.list();
		
		for(int i = 0; i < list.length; i++) {
			String name = list[i];
			//f1 폴더내의 파일 혹은 폴더를 객체화
			File f2 = new File("src/ch11/exam03/" + name);
			
			//File클래스의 API(메소드)를 이용해서 파일인지 폴더인지 구분
			if(f2.isDirectory()) {						//폴더이면 ture
				System.out.println("폴더: " + name);
			}
			else if(f2.isFile()) {						//파일이면 ture
				System.out.println("파일: " + name);
			}
		}		
	
}

}
