package section01;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting ="������ǥ��";
		System.out.println("proceed�޼ҵ带 ȣ���մϴ�.");
		proceed(greeting); //�޼ҵ� ȣ��
		System.out.println("���θ޼ҵ带 �����մϴ�.");
	}
	
	public static void proceed(String message) {
		System.out.println("�޼ҵ带 ȣ���ϸ� �� ����� �����մϴ�.");
		System.out.println("���� ���� �޽��� ��� : "+ message);
	}
}
