package ex11;

public class AAA {
	String str = "AAAŬ���� �ν��Ͻ� �ʵ� ����";
	
	class BBB{ // �ν��Ͻ� ��� Ŭ����
		String str = "BBBŬ���� �ν��Ͻ� �ʵ� ����"; // �ν��Ͻ� �ʵ� ����
		
		void print() {
			String str = "print�޼ҵ��� ��������";
			System.out.println(this.str);
			System.out.println(AAA.this.str);
		}
	}
	public static void main(String[] args) {
		AAA aaa = new AAA(); // �ܺ�Ŭ���� ��ü���� ���� ��
		BBB bbb = aaa.new BBB(); // ����Ŭ���� �ν��Ͻ� ��ü ����
		bbb.print();
	}
}