package basicio;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class BufferedStream {

	public static void main(String[] args) {
		FileOutputStream fos = null;		
		//Connection Stream (Source 또는 Destination에 직접연결)
		
		BufferedInputStream bis = null;
		//Chain Stream(Source 또는 Destination에 직접연결 불가능,Connection Stream에 연결)
		BufferedOutputStream bos = null;
		//Chain Stream(Source 또는 Destination에 직접연결 불가능,Connection Stream에 연결)
		String fname = "src/basicio/test.buff";
		
		try {
			//새로 만들 파일 이름으로 FileOutputStream 생성
			fos = new FileOutputStream(fname);
			bos = new BufferedOutputStream(fos);
			byte[] data = {'A', 'B', 'C', 'D', 'E'};
			//한바이트씩 읽어 FileOutputStream으로 출력
			bos.write(data, 0, 5);
			bos.close();
			fos.close();
			System.out.println(fname + ": 파일이 생성되었습니다.");
			
			//읽을 파일 이름으로 FileInputStream 생성
			bis = new BufferedInputStream(new FileInputStream(fname));
			data = new byte[10];
			bis.read(data, 0, 10);
			bis.close();
			System.out.println(Arrays.toString(data));
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
