package ex05;

public class AAA {
	
	BBB bbb = new BBB("�ν��Ͻ� �ʵ�� ����");
	CCC ccc = new CCC("�ν��Ͻ� �ʵ�� ����");
	
	// �ν��Ͻ� ��� Ŭ������ ����ƽ �ʵ�� ������ �� ����.
//	static BBB bbb1 = new BBB("�ν��Ͻ� �ʵ�� ����");
	
	// ����ƽ ��� Ŭ������ �ν��Ͻ��ʵ�, ����ƽ �ʵ� ��� ���� �����ϴ�.
	static CCC ccc1 = new CCC("�ν��Ͻ� �ʵ�� ����");
	
	static {
//		BBB b = new BBB(); 
		CCC c = new CCC("����ƽ ���Ͽ� ����");
	}
	
	void methodA() { //�ν��Ͻ� �޼ҵ� : �ν��Ͻ� ���Ŭ����, ����ƽ ��� Ŭ���� ��� ��밡��
		System.out.println("=======================�ν��Ͻ� �޼ҵ� ȣ��=================================");
		BBB bbb = new BBB("�ν��Ͻ� �޼ҵ忡�� ��ü����");
		CCC ccc = new CCC("�ν��Ͻ� �޼ҵ忡�� ��ü����");
		System.out.println("=======================�ν��Ͻ� �޼ҵ� ȣ��=================================");
	}
	
	static void methodAA() {
		System.out.println("=======================�ν��Ͻ� �޼ҵ� ȣ��=================================");
//		BBB bbb = new BBB("�ν��Ͻ� �޼ҵ忡�� ��ü����");
		CCC ccc = new CCC("�ν��Ͻ� �޼ҵ忡�� ��ü����");
		System.out.println("=======================�ν��Ͻ� �޼ҵ� ȣ��=================================");
	}
	
	
	class BBB{  // �ν��Ͻ� ��� Ŭ����
		public BBB(String message) {
			System.out.println("�ν��Ͻ� ��� Ŭ���� BBB ��ü ���� : " + message);
		}
	}
	
	static class CCC{ // ����ƽ ��� Ŭ����
		public CCC(String message) {
			System.out.println("����ƽ ��� Ŭ���� CCC ��ü ���� : " + message);
		}
	}
	
	
}