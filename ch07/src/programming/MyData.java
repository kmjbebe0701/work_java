package programming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyData<K, V1, V2> {
	private Set<K> keySet;					//key 값들을 저장하는 Set
	private List<K> keys;					
	private List<V1> values1;				
	private List<V2> values2;
	private int size;						//데이터의 개수
	
	public MyData() {
		keySet = new HashSet<K>();
		keys = new ArrayList<K>();
		values1 = new ArrayList<V1>();
		values2 = new ArrayList<V2>();
	}
	
	public void put(K key, V1 value, V2 value) {
		for (int i =0; i<keys.size(); i++) {
			//이 조건이 맞으면 해당 key의 value를 수정
			if (keys.get(i).equals(key)) {
				values1.set(i, value);
				return;
			}
		}
		keySet.add(key);
		keys.add(key);
		values1.add(value);
		size +=1;
	}
	
	public V get(K key) {
		for (int i = 0; i < keys.size(); i++) {
			if (keys.get(i).equals(key)) {
				return values.get(i);
			}
		}
		
		return null;
	}
	
	public Set<K> getKeySet() {
		return this.keySet;
	}
	

}
