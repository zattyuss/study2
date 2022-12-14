package dao;

import java.util.ArrayList;
import java.util.List;

import common.FoundNotMemberId;
import model.Member;

public class MemberDao {
	
	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao() {
		memberList.add(new Member(1, "홍길동", "1234", "hong@naver.com"));
		memberList.add(new Member(2, "고길동", "9988", "go@naver.com"));
		memberList.add(new Member(3, "상길동", "1651", "sang@naver.com"));
		memberList.add(new Member(4, "진길동", "2135", "jin@naver.com"));
		memberList.add(new Member(5, "박길동", "7986", "park@naver.com"));
		memberList.add(new Member(6, "박길동", "7986", "park@naver.com"));
	}
	public List<Member> selectAll(){
		return memberList;
		
	}
	public Member selectById(int id) {
		Member findMember = null;
		for(Member member : memberList) {
			if(member.getId() == id) {
				findMember = member;
			}
		}
		
		if(findMember == null) throw new FoundNotMemberId("존재하지 않는 회원");
		
		return findMember;
	}
	public List<Member> selectByName(String name) {
		List<Member> findMembers = new ArrayList<Member>();
		for(Member member : memberList) {
			if(name.equals(member.getName())) {
				findMembers.add(member);
			}
			if(findMembers.isEmpty()) {
				throw new FoundNotMemberId("나니모 나캇타");
			}
		}
		return findMembers;
	}
	
}
