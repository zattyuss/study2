package section01;

public class PromotionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
//		char chValue = byteValue; // ������ ���� : byteŸ���� charŸ������ �ڵ� Ÿ�� ��ȯ�� �� ����.
		int intValue = byteValue; //byte Ÿ���� int Ÿ������ �ڵ� Ÿ�� ��ȯ
		System.out.println(intValue);
		
		char charValue = '��';
		intValue = charValue; // char Ÿ���� int Ÿ������ �ڵ� Ÿ�� ���ѵȴ�.
		System.out.println("���� �����ڵ�=" + intValue);
		
		intValue = 500;
		long longValue = intValue; // int Ÿ���� long Ÿ������ �ڵ� Ÿ�� ��ȯ
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // int Ÿ���� double Ÿ������ �ڵ� Ÿ�� ��ȯ
		System.out.println(intValue);
				
		
	}

}
