package section01;

public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Ÿ��
		byte byteValue = 100; //����Ʈ Ÿ��
		char chValue = 'F'; //ĳ���� Ÿ��
		short shValue = 100; // �� Ÿ��
		int intValue = 124; // ��Ʈ Ÿ��
		long longValue = 1535; //�� Ÿ��
		
		System.out.println(byteValue+10);
		System.out.println(chValue);
		System.out.println(shValue*2);
		System.out.println(intValue+26);
		System.out.println(longValue-1534);
		
		System.out.println("=========���м�=========");
		
		// �Ǽ� Ÿ��
		float floatvalue1 = 10.111f;
		float floatvalue2 = 3.14F;  //���� �Ұ���
		double doublevalue1 = 3.1415920;
		double doublevalue2 = 3.141592d;
		double doublevalue3 = 3.141592; //���� ����
		
		System.out.println(floatvalue1+11.889);
		System.out.println(floatvalue2+2);
		System.out.println(doublevalue1+3.14);
		System.out.println(doublevalue2*123);
		System.out.println(doublevalue3-2.456465);
		
		System.out.println("=========���м�=========");
		//�� Ÿ��
		boolean booleanvalue1 = true;
		boolean booleanvalue2 = false;
		
		System.out.println(booleanvalue1);
		System.out.println(booleanvalue2);
	}

}
