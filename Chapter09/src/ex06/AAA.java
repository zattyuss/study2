package ex06;

public class AAA { // ���� Ŭ����
	
	int aaa = 10; // �ܺ�Ŭ������ �ν��Ͻ� �ʵ� ����
	static int aa = 100; //�ܺ�Ŭ������ ����ƽ �ʵ� ����
	void methodA() {
		System.out.println("�ܺ�Ŭ���� �ν��Ͻ� �޼ҵ� ȣ��");
	}
	
	static void methodAA(){
		System.out.println("����Ŭ���� ����ƽ �޼ҵ� ȣ��");
	}
	
	class BBB{ // ���� Ŭ���� : �ν��Ͻ� ��� Ŭ����
		void methodB() {
			System.out.println(aaa);
			System.out.println(aa);
			methodA();
			methodAA();
		}
	}
	
	static class CCC{ // ����Ŭ���� : ����ƽ ��� Ŭ����
		void methodC() {
//			System.out.println(aaa); // �ܺ�Ŭ������ �ν��Ͻ� �ʵ� ���� �Ұ�
			System.out.println(aa); // �ܺ�Ŭ������ ����ƽ �ʵ� ���� ����
//			methodA(); // �ܺ�Ŭ������ �ν��Ͻ� �޼ҵ�� ���� �Ұ�
			methodAA(); // �ܺ�Ŭ������ ����ƽ �޼ҵ� ����
		}
		static void methodCC() { // ���� Ŭ������ ����ƽ �޼ҵ忡��
//			System.out.println(aaa); // �ܺ�Ŭ������ �ν��Ͻ� �ʵ� ���� �Ұ�
			System.out.println(aa); // �ܺ�Ŭ������ ����ƽ �ʵ� ���� ����
//			methodA(); // �ܺ�Ŭ������ �ν��Ͻ� �޼ҵ�� ���� �Ұ�
			methodAA(); // �ܺ�Ŭ������ ����ƽ �޼ҵ� ����
		}
		
	}
	
	
}