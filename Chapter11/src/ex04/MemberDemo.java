package ex04;

public class MemberDemo {
	public static void main(String[] args) {
		Member member1 = new Member(1, "ȫ�浿", "adfsdfa");
		Address address1 = new Address("��ɱ�", "�밡���� ����2�� 8-8", 40136);
		member1.setAddress(address1);
		printInfo(member1);
		
		Member member2 = new Member(1, "ȫ�浿", "adfsdfa");
		Address address2 = new Address("��ɱ�", "�밡���� ����2�� 8-8", 40136);
		member2.setAddress(address2);
		
		System.out.println(member1.equals(member2));
	}

	private static void printInfo(Member member) {
		System.out.println("================================");
		System.out.println("ȸ����ȣ : " + member.getId());
		System.out.println("ȸ���̸� : " + member.getName());
		System.out.println("ȸ�� �̸��� : " + member.getEmail());
		Address addr = member.getAddress();
		System.out.println("�ּ� : " + member.getAddress().getState() + 
								" " + member.getAddress().getCity() +
								" " + member.getAddress().getZip());
		
	}
}
