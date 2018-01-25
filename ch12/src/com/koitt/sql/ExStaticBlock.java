package com.koitt.sql;

public class ExStaticBlock {
	static int staticNum = 20;
	int num = 10;
	
	//static block
	static {
		System.out.println("static block 실행: " + ExStaticBlock.staticNum);
	}
	
	/*
	 * instance block: 생성자보다 먼저 실행이 되는데
	 * 		여러 생성자의 공통적인 코드부분을 instance block에 구현하면 편리.
	 */
	{
		System.out.print("instance block실행: ");
		System.out.print(ExStaticBlock.staticNum + " / ");
		System.out.println(this.num);
	}
	
	//기본생성자
	public ExStaticBlock() {
		System.out.println("기본 생성자 실행: " +this.num);
	}
	
	public ExStaticBlock(String test) {
		System.out.println("ExStaticBlock(String test) 생성자 실행");
	}
	
	public static void main(String[] args) {
		/*try {
			//객체 생성 - 기본생성자 호출
			ExStaticBlock block = new ExStaticBlock();
			
			//static 키워드가 붙은 항목들이 실행 (우선순위)
			Class.forName("com.koitt.sql.ExStaticBlock");
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}*/
		
	}

}
