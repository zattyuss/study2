package test;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public class Test2 {
	
	
	
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<Member>();
		
		memberList.add(new Member(1, "ȫ�浿", "1234", "hong@naver.com"));
		memberList.add(new Member(2, "��浿", "5235", "kim@naver.com"));
		memberList.add(new Member(3, "���浿", "7656", "na@naver.com"));
		memberList.add(new Member(4, "�ڱ浿", "9787", "park@naver.com"));
		memberList.add(new Member(5, "�̱浿", "3454", "yee@naver.com"));
		memberList.add(new Member(6, "�̱浿", "5454", "2@naver.com"));
		memberList.add(new Member(9, "�̱浿", "2454", "e@naver.com"));
		
		Member member = memberList.get(2);
		System.out.println(member);
		
		int index = memberList.size()-1;
		Member member2 = memberList.get(index);
		System.out.println(member2);
		
		int memberNo = memberList.get(index).getId()+1;
		System.out.println("���� ����ϴ� ȸ����ȣ : " + memberNo);
		
		
		
//		int size = memberList.size();
//		System.out.println(memberList.get(0).getName());
//		System.out.println(memberList.get(size-1).getId());
//		
//		
//		Member member = new Member("������", "6516", "jeon@naver.com");
//		member.setId(10);
//		memberList.add(member);
	}
}