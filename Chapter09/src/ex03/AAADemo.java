package ex03;

public class AAADemo {
	public static void main(String[] args) {
		System.out.println("����ƽ �ʵ� ������ ���� : " + AAA.CCC.ccc2);
		System.out.println("(��)����� ���� : " + AAA.CCC.CONT_CCC);
		AAA.CCC.methodCC();
		
		
		// ���� ��� Ŭ���� ����
		AAA.CCC ccc = new AAA.CCC();
		ccc.ccc = 23232;
		System.out.println("�ν��Ͻ� �ʵ� ������ ���� : " + ccc.ccc);
		ccc.methodC();
		
		
		
		
		
		
		
	}
}