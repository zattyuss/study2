package section.exam05;

public class Test00 {
	public static void main(String[] args) {
		String greeting = "�ȳ��ϼ���";
		System.out.println("proceed�޼ҵ带 ȣ���մϴ�");
		
		Test00.proceed(greeting);
		
		proceed(greeting);
		
		System.out.println("���θ޼ҵ带 �����մϴ�.");
		
	}
	public static void proceed(String message) {
		System.out.println("�޼ҵ带 ȣ���ϸ� �� ���� �����մϴ�.");
		System.out.println("���� ���� �޽��� ��� : "+ message);
	}
}
