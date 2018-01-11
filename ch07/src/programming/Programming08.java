package programming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Programming08 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		List<Object> word = new ArrayList<>(); 
		word.add("java");
		word.add("c");
		word.add("java");
		word.add("cpp");
		word.add("cpp");
		word.add("coble");
		word.add("java");
		
		
		for (int i = 0; i < word.size(); i++) {
			if (map.containsKey(word.get(i))) {
				map.put((String)word.get(i), map.get(word.get(i))+1);
				continue;
			}
			map.put((String)word.get(i), 1);
		}
		
		
		System.out.println(word);
		System.out.println(map.size() + " distinct words detected:");
		System.out.println(map.toString());

	}

}
