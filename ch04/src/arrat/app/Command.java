package arrat.app;

public class Command {

	public static void main(String[] args) {
		System.out.println("명령형 인자 갯수 >" + args.length);
		
		for (String value : args)
			System.out.print(value + " ");

	}

}
