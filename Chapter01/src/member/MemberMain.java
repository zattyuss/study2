package member;

import java.util.Arrays;

public class MemberMain {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		Member[] members = dao.findAll();
		
//		for(Member m : members) {
//			System.out.println("ȸ����ȣ : "+ m.getId());
//			System.out.println("ȸ����ȣ : "+ m.getName());
//		}
		System.out.println(Arrays.toString(members));
		
		
//		Member member1 = dao.findById(2);
//		System.out.println("2�� ȸ�� �̸� : "+ member1.getName());
//		Member member2 = dao.findById(4);
//		
//		System.out.println("4�� ȸ�� �̸� : "+ member2.getName());
//		
//		Member member3 = dao.findById(100);
//		System.out.println("100�� ȸ�� �̸� : "+ member3.getName());
	try {
		Member member1 = dao.findById(2);
		System.out.println("2�� ȸ�� �̸� : "+ member1.getName());
		Member member2 = dao.findById(4);
		System.out.println("4�� ȸ�� �̸� : "+ member2.getName());
		Member member3 = dao.findById(100);
		System.out.println("100�� ȸ�� �̸� : "+ member3.getName());

		
	} catch (NullPointerException e) {
		System.out.println("��ϵ� ȸ���� �����ϴ�.");
		}	
	}	
}
