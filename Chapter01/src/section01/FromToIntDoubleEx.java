package section01;

public class FromToIntDoubleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		double num3 = num2; //int���� double���� �ڵ�Ÿ�Ժ�ȯ
		num2 = (int) num3; // double���� int ����Ÿ�Ժ�ȯ
		//����Ÿ �ս��� ���ٸ� ���� ������� 0�� �Ǿ�� �Ѵ�.
		int result = num1 - num2;
		System.out.println(result);
	}

}
