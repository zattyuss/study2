package tese1;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public class Test5 {
	public static void main(String[] args) {
		
		List<Member> memberList = new ArrayList<Member>();
		
		Member member1 = new Member(1, "È«1", "±æ", "µ¿");
		Member member2 = new Member(2, "È«2", "±æ", "µ¿");
		Member member3 = new Member(3, "È«3", "±æ", "µ¿");
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		System.out.println(memberList);
		//¾¥Á¤
		
		Member member = memberList.get(1);
		member.setEmail("Àü");
		System.out.println(memberList);
		System.out.println("==========================================================");
		//½ÏÁ¦
		memberList.remove(0);
		System.out.println(memberList);
		
	}
}
