package ex09;

public class AAA {
	int aaa = 10; // �ܺ�Ŭ������ �ν��Ͻ� �ʵ�
	static int aa = 100; // �ܺ�Ŭ������ ����ƽ �ʵ�
	
	void methodA() { // �ܺ�Ŭ������ �ν��Ͻ� �޼ҵ�
		System.out.println("�ܺ� Ŭ������ �ν��Ͻ� �޼ҵ�");
	}
	static void methodAA() { // �ܺ�Ŭ������ ����ƽ �޼ҵ�
		System.out.println("�ܺ�Ŭ������ ����ƽ �޼ҵ�");
	}
	void methodD() { // ����Ŭ������ �����ϴ� �޼ҵ�
		class DDD{ // ����Ŭ���� : ����Ŭ����
			void methodD() { // ����Ŭ������ �ν��Ͻ� �޼ҵ�
				// �ܺ�Ŭ������ ��� �ʵ�, �޼ҵ忡 ������ �� �յ�.
				System.out.println(aaa);
				System.out.println(aa);
				methodA();
				methodAA();
			}
		}
		new DDD().methodD();
	}	
	
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.methodD();
	}
	
	
	
	
}