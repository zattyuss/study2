package section01;

public class FromIntToFloat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		float num3 = num2; // int���� float���� �ڵ�Ÿ�Ժ�ȯ
		num2 = (int) num3; // float���� int ����Ÿ�Ժ�ȯ
		
		// ������ �ս��� ���ٸ� ���� ������� 0�̵Ǿ�� �Ѵ�.
		int result = num1 - num2;
		System.out.println(result);
	}

}
