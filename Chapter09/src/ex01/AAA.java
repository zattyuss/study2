package ex01;

public class AAA {
	
	
	// BBB, CCC : ��� Ŭ����
	class BBB{
		// �ν��Ͻ� ��� Ŭ����
		// AAAŬ������ ��ü ���� ���� BBBŬ������ ��ü������ ������
		public BBB() {
			System.out.println("BBB��ü����");
		}
	}
	
	static class CCC{
		// ����(����ƽ) ��� Ŭ����
		//AAAŬ������ ���� �� �ٷ� ��ü ���� ����
		public CCC() {
			System.out.println("CCC��ü����");
		}
	}
	
	
	void methodA() {
		System.out.println("methodA ȣ��");
		class DDD{
			// ���� Ŭ����
			// methodA()�ۿ��� ��� �Ҽ� ����
		public DDD() {
			System.out.println("DDD��ü����");
		}	
			
		}
		DDD ddd = new DDD();
	}
	
	void methodB() {
		
	}
	
	
}
