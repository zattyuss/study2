package member2;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		MemberDao dao = MemberDao.getInstance();
		ArrayList<Member> members = dao.findAll();
		
		printMemberAllInfo(members);		
		dao.addMember(new Member(3,"고길동"));
		printMemberAllInfo(members);
		
		Member member = dao.findById(3);
		System.out.println(member.getId());
		System.out.println(member.getName());
		
		dao.modifyMember(1,"허공답보");
		printMemberAllInfo(members);
	}

	private static void printMemberAllInfo(ArrayList<Member> members) {
		System.out.println("========================================");
		for(Member member : members) {
			System.out.println(member.getId());
			System.out.println(member.getName());
		}
		System.out.println("===========================================");
	}
}
