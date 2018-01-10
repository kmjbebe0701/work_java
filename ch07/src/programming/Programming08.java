package programming;

import java.util.HashMap;
import java.util.Map;

public class Programming08 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("java", 1);
		map.put("c", 1);
		map.put("java", 2);
		map.put("cpp", 1);
		map.put("cpp", 2);
		map.put("cobol", 1);
		map.put("java", 3);
		
		System.out.println(map.toString());
		System.out.println(map.size() + " distinct words detected:");
		System.out.println(map);

	}

}
