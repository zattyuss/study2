package section01;

public class OperationPriorityEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ������ ������
		System.out.println("12�� 5�� �������� �� ������ : " + 12%5);
		
		// ��������ڿ� ���� ������ �������� �������̴�.
		int num = 9 * 4 / 3 % 5;
		System.out.println("num : " + num);
		
		// ���Կ����ڿ� �켱����
		int a,b,c; //Ÿ���� ���ٸ� ��ǥ�� ����Ͽ� ���ÿ� ���� ����
		
		// ���Կ������� ���� ������ �����ʿ��� �����̴�.
		// ��, c=5, b=c, a=b ������ ���� ������ ����ȴ�.
		a=b=c=5;
		
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		System.out.println("c=" +c);
	}

}
