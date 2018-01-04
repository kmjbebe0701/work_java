package inheritance.typrcast;

public class UpCasting {

	public static void main(String[] args) {
		Person she = new Person("이소라", 2056432);
		System.out.println(she.name + " " + she.number);
		
		Faculty f = new Faculty("김영태", 1145782, "연한대학교", 38764);
		Person p = f;				//업캐스팅(부모는 자식객체를 저장할수있다.)
		
		System.out.print(p.name + " " + p.number + " ");
		//System.out.print(p.univ);		//참조 불가능 : Person 클래스에서 univ 필드를 찾을 수 없음
		System.out.println(f.name + " " + ((Person)f).number);	//f를 Person 형으로 업캐스팅하여 number 호출
		System.out.println(f.univ + " " + f.number);
		
		Staff s = new Staff ("김상기", 1187543, "강서대학교", 3456);
		s.division = "교학처";
		Person pn = s;				//업캐스팅
		Faculty ft = s;				//업캐스팅
		System.out.print(pn.name + " " + pn.number + " ");
		System.out.print(ft.univ + " " + ft.number + " ");
		System.out.println(s.division);

	}

}
