package programming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Programming09 {
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		Scanner in = new Scanner(System.in);
		map.put("김미현", "010-3675-8754");
		
		System.out.println("검색할 이름을 적으세요>>");
		
		String name = in.next();
		
		if (map.containsKey(name)) {
			System.out.println("입력하신 "+ name + "의 전화번호는 " +  map.get(name) + "입니다.");
		}
		else {
			System.out.println("입력된 번호가 없습니다." );
		}
		
		
	}
	

}
