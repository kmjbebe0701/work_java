package basicio;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyInputStreamReader {

	public static void main(String[] args) {
		String line;

		// 읽을 파일 이름 지정
		// 원본 파일 경로
		String fname = "src/basicio/MyInputStreamReader.java";
		
		try {
			//읽을 파일 이름으로 FileInputStream생성
			FileInputStream fis = new FileInputStream(fname);
			//파일 입력 스트림을 다시 InputStreamReader로 연결
			InputStreamReader isr = new InputStreamReader(fis);		//Chain
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
			System.out.println("다음 파일이 없습니다. : " + fname);
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		
		

	}

}
