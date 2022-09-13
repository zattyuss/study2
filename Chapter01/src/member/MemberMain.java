package member;

import java.util.Arrays;

public class MemberMain {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		Member[] members = dao.findAll();
		
//		for(Member m : members) {
//			System.out.println("회원번호 : "+ m.getId());
//			System.out.println("회원번호 : "+ m.getName());
//		}
		System.out.println(Arrays.toString(members));
		
		
//		Member member1 = dao.findById(2);
//		System.out.println("2번 회원 이름 : "+ member1.getName());
//		Member member2 = dao.findById(4);
//		
//		System.out.println("4번 회원 이름 : "+ member2.getName());
//		
//		Member member3 = dao.findById(100);
//		System.out.println("100번 회원 이름 : "+ member3.getName());
	try {
		Member member1 = dao.findById(2);
		System.out.println("2번 회원 이름 : "+ member1.getName());
		Member member2 = dao.findById(4);
		System.out.println("4번 회원 이름 : "+ member2.getName());
		Member member3 = dao.findById(100);
		System.out.println("100번 회원 이름 : "+ member3.getName());

		
	} catch (NullPointerException e) {
		System.out.println("등록된 회원이 없습니다.");
		}	
	}	
}
