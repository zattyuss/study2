package dao;

import java.util.ArrayList;
import java.util.List;

import common.FoundNotMember;
import common.FoundNotMemberId;
import model.Member;

public class MemberDao {
	
	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao() {
		memberList.add(new Member(1, "홍길동", "1234", "hong@naver.com"));
		memberList.add(new Member(2, "김길동", "5235", "kim@naver.com"));
		memberList.add(new Member(3, "나길동", "7656", "na@naver.com"));
		memberList.add(new Member(4, "박길동", "9787", "park@naver.com"));
		memberList.add(new Member(5, "이길동", "3454", "yee@naver.com"));
		memberList.add(new Member(6, "이길동", "5454", "2@naver.com"));
		memberList.add(new Member(9, "이길동", "2454", "e@naver.com"));
	}
	//모든회원 조회
	public List<Member> memberList(){
		return memberList;
	}
	//회원번호로 조회
	public Member selectById(int id) {
		Member findMember =null;
		for(Member m : memberList) {
			if(id == m.getId()) {
				findMember = m;
			}
		}
		
		if(findMember == null) throw new FoundNotMember("존재하지 않는 회원입니다.");
		
		return findMember;
	}
	
	public List<Member> selectByName(String name){
		List<Member> findMembers = new ArrayList<Member>();
		for(var m : memberList) {
			if(name.equals(m.getName())) {
				findMembers.add(m);
			}
		}
		if(findMembers.isEmpty()) throw new FoundNotMember("존재하지 않는 회원입니다.");
		return findMembers;
	}
	//회원가입
	public void insert(Member member) {
		int index = memberList.size()-1;
		member.setId(memberList.get(index).getId()+1);
		memberList.add(member);
		System.out.println(member.getName()+ "님이 회원가입을 완료했습니다.");
		
	}
	
	//회원삭제
	public void delete(int id) { //회원번호 6번이 전달된다면
//		memberList.add(new Member(5, "이길동", "3454", "yee@naver.com"));
		Member selectById = selectById(id); //리스트에서 5번 인덱스의 위치
		int index = memberList.indexOf(selectById);
		System.out.println(selectById.getId()+ "번 회원삭제");
		memberList.remove(index);
		
		
		
	}
	public void update(int id, String email) {
		Member selectById = selectById(id);
		int index = memberList.indexOf(selectById);
		memberList.get(index).setEmail(email);
		
		
		
		
	}
}
