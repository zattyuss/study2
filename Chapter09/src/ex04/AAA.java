package ex04;

public class AAA {
	
	void methodA() {
		System.out.println("Ŭ����AAA : methodA ȣ��");
		class DDD {
			int ddd; // �ν��Ͻ� �ʵ� ����
//			static int ddd2; // ����ƽ �ʵ� ���� �Ұ���
			public final static int CONT_DDD = 100000; // ���
//			static {} // ����ƽ���� �Ұ���
			public DDD() { // ������
				System.out.println("DDD ��ü ����");
			}
			
			//�ν��Ͻ� �޼ҵ�
			void methodD() {
				System.out.println("DDD Ŭ���� �ν��Ͻ� �޼ҵ� ȣ��");
			}
			
			//����(����ƽ) �޼ҵ� �Ұ���
//			static void methodD() {}						
		}
		DDD d = new DDD();
		d.ddd = 20;
		System.out.println("�ν��Ͻ� �ʵ� ���� : " + d.ddd);
		d.methodD();
		
		
		
										
	}
	void methodAA() {
//		DDD ddd = new DDD();
	}
}