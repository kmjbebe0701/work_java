package basicio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {
	public static void main(String[] args) {
		int data;

		String fname = "src/basicio/ReadFiles.java";

		try {
			FileInputStream fis = new FileInputStream(fname);

			while ((data = fis.read()) != -1) {
				char c = (char) data;
				System.out.print(c);
			}
		} catch (FileNotFoundException e) {
			System.out.println("다음 파일이 없습니다 : " + fname);
		} catch (IOException e) {
			System.out.println(e);
		}
		System.out.println();

	}

}
