package ex01;

public class Example02 {
	public static void main(String[] args) {
		String str1 = "ȫ�浿"; //��ü ����
		String str2 = "ȫ�浿"; //��ü ���� x
		String str3 = new String("ȫ�浿");
		
		System.out.println(str1 == str2); //�ּҰ� ��
		System.out.println(str1.equals(str2)); // ��ü�� ����� �� ��
		//������ ���� : ��ü�� ����� ���� ��� ���� ��
		
		// str2 �� str3�� ���� �ٸ� ��ü
		System.out.println(str2 == str3);
		
		// str2 �� str3�� ������ �����̴� 
		System.out.println(str2.equals(str3));
		
		
	}
}