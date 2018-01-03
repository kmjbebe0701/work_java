package exercise;

//8-2번 Person문제
public class Exercise0802 {
	String name;

	public Exercise0802(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		Exercise0802 p = new Exercise0802("예진");
		System.out.println(p.name);
		p.name = "진태";
		System.out.println(p.name);

	}

}
