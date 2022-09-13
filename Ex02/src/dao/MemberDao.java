package dao;

import java.util.ArrayList;
import java.util.List;

import common.FoundNotMemberId;
import model.Member;

public class MemberDao {
	
	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao() {
		memberList.add(new Member(1, "ȫ�浿", "1234", "hong@naver.com"));
		memberList.add(new Member(2, "���浿", "9988", "go@naver.com"));
		memberList.add(new Member(3, "��浿", "1651", "sang@naver.com"));
		memberList.add(new Member(4, "���浿", "2135", "jin@naver.com"));
		memberList.add(new Member(5, "�ڱ浿", "7986", "park@naver.com"));
		memberList.add(new Member(6, "�ڱ浿", "7986", "park@naver.com"));
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
		
		if(findMember == null) throw new FoundNotMemberId("�������� �ʴ� ȸ��");
		
		return findMember;
	}
	public List<Member> selectByName(String name) {
		List<Member> findMembers = new ArrayList<Member>();
		for(Member member : memberList) {
			if(name.equals(member.getName())) {
				findMembers.add(member);
			}
			if(findMembers.isEmpty()) {
				throw new FoundNotMemberId("���ϸ� ��ıŸ");
			}
		}
		return findMembers;
	}
	
}