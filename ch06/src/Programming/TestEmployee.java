package Programming;

public class TestEmployee {

	public static void main(String[] args) {
		Regular r = new Regular("이순신", 35, "서울", "인사부");
		Temporary t = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		t.setTime(120);
		t.printInfo();
		
		Employee r1 = new Regular("이순신", 35, "서울", "인사부");
		Employee t1 = new Temporary("장보고", 25, "인천", "경리부");
		r.setSalary(5000000);
		r.printInfo();
		t.setTime(120);
		t.printInfo();
		

	}

}
