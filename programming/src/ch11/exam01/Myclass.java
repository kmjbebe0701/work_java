package ch11.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Myclass {
	public static void main(String[] args) {
		int data;

		//읽을 파일 이름 지정
		String inname = "src/ch11/exam01/Myclass.java";
		String outname = "src/ch11/exam01/Myclass.num";
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream(inname);
			fos = new FileOutputStream(outname);
			
			int i=1;
			fos.write(i);
			System.out.print(i +" ");
			
			while ((data = fis.read()) != -1) {
				char c = (char) data;
				
				if (c == '\n') {
					fos.write(c);
					fos.write(++i);
					System.out.print(c);
					System.out.print(i + " ");
					continue;
				}
				fos.write(c);
				System.out.print(c);
			}

			System.out.println("파일이 생성되었습니다.");
			fos.close();
			fis.close();
			
		} catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다 : " + outname);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println();

	}

}
