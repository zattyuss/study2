package ex01;

public class Example03 {
	public static void main(String[] args) {
		Member member1 = new Member("ȫ�浿");
		Member member2 = new Member("ȫ�浿");
		
		//member1�� member2�� ���� �ٸ� ��ü�̴�.
		System.out.println(member1 != member2);
		
		//member1�� member2�� ������ �����̴�
		System.out.println(member1.equals(member2));
		//������ ������ �Ǵ��� �� �ְ� equals�޼ҵ带 �������ؾ���
		// String Ŭ������ equals�޼ҵ�� �̹� ������ �Ǿ�����
		
		//������ ���� ���� ������� ����
		System.out.println(member1 == member2);
		System.out.println(member1.equals(member2));
		
	}
}

class Member {
	String name;

	public Member(String name) {
		this.name = name;
	}
	
	
}