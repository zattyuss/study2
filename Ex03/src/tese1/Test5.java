package tese1;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public class Test5 {
	public static void main(String[] args) {
		
		List<Member> memberList = new ArrayList<Member>();
		
		Member member1 = new Member(1, "ȫ1", "??", "??");
		Member member2 = new Member(2, "ȫ2", "??", "??");
		Member member3 = new Member(3, "ȫ3", "??", "??");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		System.out.println(memberList);
		//????
		
		Member member = memberList.get(1);
		member.setEmail("??");
		System.out.println(memberList);
		System.out.println("==========================================================");
		//????
		memberList.remove(0);
		System.out.println(memberList);
		
	}
}
