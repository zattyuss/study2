package section01;

public class SingOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = -100; // ���ͷ��տ� ��ȣ�����ڸ� �ٿ� ���� ǥ��
		int result1 = +x; // ��ȣ����
		int result2 = -x; // ��ȣ����
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		// byteŸ�� ����, shortŸ�� ������ ��ȣ�����ڸ� �ۿ��ϸ�
		// ������ ����� int Ÿ���̵ȴ�.
		short s = 100;
//		short result3 = -s; // ������ ����
//      short result3 = +s; // ������ ����
		int result3 = -s;
		System.out.println("result3="+result3);
	}

}
