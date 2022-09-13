package test;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public class Test2 {
	
	
	
	public static void main(String[] args) {
		List<Member> memberList = new ArrayList<Member>();
		
		memberList.add(new Member(1, "홍길동", "1234", "hong@naver.com"));
		memberList.add(new Member(2, "김길동", "5235", "kim@naver.com"));
		memberList.add(new Member(3, "나길동", "7656", "na@naver.com"));
		memberList.add(new Member(4, "박길동", "9787", "park@naver.com"));
		memberList.add(new Member(5, "이길동", "3454", "yee@naver.com"));
		memberList.add(new Member(6, "이길동", "5454", "2@naver.com"));
		memberList.add(new Member(9, "이길동", "2454", "e@naver.com"));
		
		Member member = memberList.get(2);
		System.out.println(member);
		
		int index = memberList.size()-1;
		Member member2 = memberList.get(index);
		System.out.println(member2);
		
		int memberNo = memberList.get(index).getId()+1;
		System.out.println("새로 등록하는 회원번호 : " + memberNo);
		
		
		
//		int size = memberList.size();
//		System.out.println(memberList.get(0).getName());
//		System.out.println(memberList.get(size-1).getId());
//		
//		
//		Member member = new Member("전윤동", "6516", "jeon@naver.com");
//		member.setId(10);
//		memberList.add(member);
	}
}
