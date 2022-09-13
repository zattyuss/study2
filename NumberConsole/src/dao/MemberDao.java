package dao;

import java.util.ArrayList;
import java.util.List;

import model.Member;

// 데이터베이스에서 요청한 데이터를 가져오거나 삽입/수정/삭제
public class MemberDao {
	
	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao() {
		memberList.add(new Member(1,"홍길동","1234","qwer@naver.com"));
		memberList.add(new Member(2,"고길동","1234","asdf@naver.com"));
		memberList.add(new Member(3,"명길동","1234","zxcv@naver.com"));
		memberList.add(new Member(4,"도길동","1234","bnm@naver.com"));
		memberList.add(new Member(5,"박길동","1234","ghj@naver.com"));

		
	}
	
	public List<Member> selectAll() {
		System.out.println("│모든 멤버를 조회합니다람쥐 │");
		System.out.println("└───────────────────┘");
		return memberList;
	}

	public void insert(Member member) {
		member.setId(memberList.size()+1);
		memberList.add(member);
		System.out.println(member.getName()+ "님이 회원가입을 완료했습니다.");
	}
	
	
	
	
}
