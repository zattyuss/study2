package section01;

public class OperationPriority2Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ���տ����� : ��ȣ������
		int num1 = -10; // ��ȣ������ �ѹ�����
		int num2 = -+10; // ������ ���� +10, -+10
		int num3 = - -10; // ������ ���� -10, - -10
		System.out.println("num1: "+ num1);
		System.out.println("num2: "+ num2);
		System.out.println("num3: "+ num3);

		//��ȣ�� �ֿ켱���� ������ ���´�.
		int var1=1;
		int var2=2;
		int var3=3;
		int result = (var1 + var2) * var3;
		System.out.println("result:"+ result);
	}

}
