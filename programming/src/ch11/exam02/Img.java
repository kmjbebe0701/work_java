package ch11.exam02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Img {
	public static void main(String[] args) {
		String line;

		//읽을 파일 이름 지정
		String fname = "src/ch11/exam02/Koala.jpg";
		
		FileInputStream fis = null;
		InputStreamReader isr = null;
		
		try {
			fis = new FileInputStream(fname);
			isr = new InputStreamReader(fis);		//Chain
			//현재 InputStreamReader의 인코딩 방식 출력
			System.out.println(isr.getEncoding());
			//InputStreamReader를 다시 BufferedReader로 연결
			BufferedReader br = new BufferedReader(isr);			//Chain
			System.out.println();
			
			//한 줄씩 읽어 문자로 변환하여 출력
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
			isr.close();
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
	}

}
