package section01;

public class RemainderOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� �ǿ����ڷ� 0�� ����ϸ� ArithmeticException�� �߻��Ѵ�.
		
// int Ÿ�ԻӸ� �ƴ϶� ��� ����Ÿ�Կ� % �����ڸ� ����� �� �ִ�.
		char ch1 = '��';
		char ch2 = 'A';
		int result1 = ch1%ch2;
		System.out.println("result1:"+result1);
		
		// �ǿ����ڰ� ������ ��� �������� ���� ����
		int num1 = -10;
		int num2 = -3;
		int result2 = num1/num2;
		System.out.println("result2:"+result2);
	
	}

}
