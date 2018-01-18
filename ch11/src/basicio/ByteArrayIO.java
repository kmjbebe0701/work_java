package basicio;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class ByteArrayIO {

	public static void main(String[] args) throws IOException{
		int c;
		byte[] b = {'a', 'b', 'c', 'd'};
		
		//배열b를 읽는 ByteArrayInputStream 객체 생성
		ByteArrayInputStream bInput = new ByteArrayInputStream(b);
		//배열b의 소문자들을 대문자로 출력하는 ByteArrayOutputStream 객체를 생성
		ByteArrayOutputStream bOutput = new ByteArrayOutputStream();
		
		System.out.println("문자를 읽어 대문자로 출력");
		while ((c = bInput.read()) != -1) {					//배열의 끝이 -1
			System.out.print((char)c);						//문자로 변환
			//객체 ByteArrayOutputStream에 대문자를 출력
			bOutput.write(Character.toUpperCase((char)c));
			
		}
		System.out.println();
		//객체 ByteArrayOutputStream을 출력하면 출력된 자료가 그대로 출력
		System.out.println(bOutput);
		
		//배열 Array 메소드 toString() 사용하여 각각 입력값과 출력값을 출력
		System.out.println(Arrays.toString(b));				//문자열이 byte 타입으로 변환되어 출력
		System.out.println(Arrays.toString(bOutput.toByteArray()));
		
	}

}
