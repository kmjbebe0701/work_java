package com.koitt.java.exception02;

import java.util.ArrayList;
import java.util.List;

/*
 * DAO (Data Access Object): 실제 데이터에 접근하는 객체를 위한 클래스
 * insert(Person p): 사람 객체를 저장
 * readAll(): 저장된 사람 전체 리스트를 가져오기
 */

public class PersonDao {
	List<Person> list; 			//DB대신 사용자의 자료를 저장
	
	public PersonDao() {
		this.list = new ArrayList<Person>();
	}
	
	public void insert(Person p) throws MyException{
		//list에서 중복된 인적 정보 찾기
		for (Person item : this.list) {
			//사람 이름 비교해서 같다면 중복된 사람으로 처리
			if (item.equals(p)) {
				throw new MyException("E01: Person 객체 중복");
			}
		}
		this.list.add(p);
	}
	
	public List<Person> selectAll() {
		return this.list;
	}
	
	//Argument로 전달받은 객체를 list에서 제거
	public void delete(Person p) throws MyException{
		//list에서 Argument로 전달받은 객체의 name과 동일한 객체가 있는지 확인
		for (Person item : this.list) {
			if (item.equals(p)) {
				list.remove(item);
				return;
			}
		}
		throw new MyException("E02: 삭제할 사람이 없습니다.");
	}
	
	public void updata(Person p) throws MyException{
		//list에서 Argument로 전달받은 객체의 name과 동일한 객체가 있는지 확인
		for (Person item : this.list) {
			if (item.equals(p)) {
				//item.setName(p.getName());		
				//동일 이름으로 검색했으므로 이름은 같을것, 업데이트 할 필요 없다
				item.setAge(p.getAge());
				return;
			}
		}
		throw new MyException("E03: 수정 할 사람이 없습니다.");
	}

}
