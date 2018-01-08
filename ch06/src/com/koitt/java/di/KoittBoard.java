package com.koitt.java.di;

public class KoittBoard {
	
	public static void main(String[] args) {
		/*
		OraDB db = new OraDB();
		db.insert();
		db.remove();
		*/
		/*KoittDB db = new MySDB();
		db.insert();
		db.remove();
		*/	
		KoittDB db = DBFactory.getDB("MyS");		//DI(의존성 주입)
		db.insert();
		db.remove();
	}

}
