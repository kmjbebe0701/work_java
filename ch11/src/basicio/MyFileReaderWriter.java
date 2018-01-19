package basicio;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileReaderWriter {

	public static void main(String[] args) {
		int data;

		// 읽을 파일 이름 지정
		// 원본 파일 경로
		String inFname = "src/basicio/MyFileReaderWriter.java";
		// 파일 생성 경로
		String outFname = "src/basicio/MyFileReaderWriter.back";
		
		try {
			FileReader fr = new FileReader(inFname);
			FileWriter fw = new FileWriter(outFname);
			
			//한 바이트씩 읽어 문자로 변환하여 출력
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);
				fw.write(data);
			}
			fr.close();
			fw.close();
			System.out.println();
			System.out.println("위 파일이 생성 되었습니다. : " + outFname);
		} catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다. : " + inFname);
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		

	}

}
