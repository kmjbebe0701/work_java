package com.koitt.java.ch07;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> hm = new HashMap<String, String>();
		
		hm.put("대한민국", "서울");		//add는(index, value) put(key, value)
		hm.put("일본", "동경");
		hm.put("중국", "북경");
		hm.put("태국", "방콕");
		hm.remove("태국");				//key값 삭제(value는 삭제해도 의미없다)
		hm.put("중국", "북경");			//해당key의 값을 갱신한다
		
		System.out.print("키: " + hm.keySet());
		System.out.println(" 값: " + hm.values());
		
		//1.Iterator이용
		Iterator<String> keys = hm.keySet().iterator();		//keySet : key값만 있는 Set가 나온다.
		while (keys.hasNext()) {
			String key = keys.next();
			String value = hm.get(key);
			System.out.println(key + ": " + value);
		}
		
		//2. for-each문
		for(String key : hm.keySet()) {
			String value = hm.get(key);
			System.out.println(key + ": " + value);
		}
		
		//3. key 값을 알고 있어서 직접 입력하여 값을 가져온다.
		String value = hm.get("대한민국");
		System.out.println(value);

	}

}
