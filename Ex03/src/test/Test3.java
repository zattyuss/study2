package test;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public class Test3 {
	public static void main(String[] args) {
		Member member1 = new Member(1, "ȫ?浿1", "51241", "hong1@naver.com");
		Member member3 = new Member(3, "ȫ?浿3", "55241", "hong3@naver.com");
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(member1);
		memberList.add(new Member(2, "ȫ?浿2", "2135", "hong2@naver.com"));
		memberList.add(member3);
		memberList.add(new Member(4, "ȫ?浿4", "24135", "hong4@naver.com"));

		
		
		System.out.println(memberList);
		int size = memberList.size();
		int lastIndex = memberList.size()-1;
		System.out.println("memberList?? ???? : " + size);
		System.out.println("memberList?? ???????ε??? : " + lastIndex);
		
		
		Member getMember1 = memberList.get(3);
		int id = getMember1.getId();
		String name = getMember1.getName();		
		System.out.println(memberList.get(3));		
		System.out.println("ȸ????ȣ : " + id);		
		System.out.println("ȸ???̸? : " + name);
		
		String name2 = memberList.get(1).getName();
		System.out.println(name2);
	}
}
