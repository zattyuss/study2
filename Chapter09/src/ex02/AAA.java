package ex02;

public class AAA {
	
	int a = 10; // �ν��Ͻ� �ʵ� ����
	static int b; // ����ƽ �ʵ� ����
	public final static int C = 1000; //(��)���
	
	public AAA() { // ������
		System.out.println("AAA��ü ����");
	} 
	void methodA() { // �ν��Ͻ� �޼ҵ�
		System.out.println("��øŬ���� AAA�޼ҵ� : methodA");
	} 
	static void methodAA() {} // ����ƽ �޼ҵ�
	
	class BBB{ // �ν��Ͻ� ��� Ŭ����
		int aa = 20; // �ν��Ͻ� �ʵ� ���� ok
//		static int bb; // ����ƽ �ʵ� ���� ������ ���� 
		public final static int CC = 100; // ��� �ʵ� ���� ����
		
		public BBB() { // ������
			System.out.println("BBB��ü ����");
		} 

		//		static {} // ����ƽ��� ������ ����
		
		void methodB() { // �ν��Ͻ� �޼ҵ� ���� ���� 
			System.out.println("���� Ŭ����BBB �޼ҵ� : methodB");
		}
//		static methodBB() {} // ����ƽ �޼ҵ� ������ ����
		
		
		
		
		
	}
}
