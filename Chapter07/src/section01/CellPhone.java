package section01;

public class CellPhone {
	static String company = "����";
	String model;
	String color;
	
	static void methodA() {
		System.out.println("�����޼ҵ�");
	}
	
	void powerOn() {
		System.out.println("���� ��");
	}
	void powerOff() {
		System.out.println("���� ��");
	}
	void bell() {
		System.out.println("�� �︲");
	}
	void sendVoice(String message) {
		System.out.println("���� : " + message);
	}
	void receiveVoice(String message) {
		System.out.println("���� : " + message);
	}
	void hangup() {
		System.out.println("��ȭ ����");
	}
}
