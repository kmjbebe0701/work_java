package programming.basic;

public class HelloChars {

	public static void main(String[] args) {
		
		System.out.println('a');			//�Ϲݹ��� char ��
		System.out.println('\\');			//Ư������ \ ���
		System.out.println('\142');			//�ڵ尪 8���� ǥ�� 142�� ASCII�ڵ尪 (10���� 98��)
		System.out.println('\uAC00');		//�ڵ尪 16���� ǥ�� UTF-8(Unicode)��
		System.out.println('\uAC01');		//�ڵ尪 16���� ǥ�� UTF-8(Unicode)��
		System.out.println('��');			//�Ϲݹ���
		
		System.out.println("Hello\nWorld\tHi\bA\rB");
		System.out.println("\'");
	}

}
