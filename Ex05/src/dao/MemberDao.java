package dao;

import java.util.ArrayList;
import java.util.List;

import model.Member;


public class MemberDao implements IMemberDao {

	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao() {
		memberList.add(new Member(1, "?ڹμ?", "1234", "12342314@naver.com"));
		memberList.add(new Member(2, "???μ?", "2234", "23423@naver.com"));
		memberList.add(new Member(3, "?̹μ?", "2334", "123145@naver.com"));
		memberList.add(new Member(4, "???μ?", "2434", "345342314@naver.com"));
		memberList.add(new Member(5, "???μ?", "2534", "765534534@naver.com"));
		memberList.add(new Member(6, "???μ?", "2534", "765534534@naver.com"));
		memberList.add(new Member(7, "???μ?", "2534", "765534534@naver.com"));
	}
	
	
	
	@Override
	public List<Member> memberList() {
		return memberList;
	}

	@Override
	public Member selectById(int id) {		
		Member findMember = null;	
		for(Member m : memberList) {
				if(id == m.getId()){
					findMember = m;
				}
			}
			if(findMember == null) throw new NotFoundMemberException("???????? ?ʴ? ȸ??");
			return findMember;
		}
	

	@Override
	public List<Member> selectByName(String name) {
		List<Member> findMembers = new ArrayList<Member>();
		for(Member m : memberList) {
			if(name.equals(m.getName())){
				findMembers.add(m);
			}
		}
		if(findMembers == null) throw new NotFoundMemberException("ã?? ȸ?? ????");
		return findMembers;
	}

	@Override
	public void insert(Member member) {
		int size = memberList.size();
		int id = memberList.get(size-1).getId()+1;
		member.setId(id);
		memberList.add(member);
		System.out.println(member.getName() + "?? ȸ?????? ????");
		
	}

	@Override
	public void delete(int id) {
		Member findMember = selectById(id);
		int index = memberList.indexOf(findMember);
		memberList.remove(index);
		System.out.println(findMember.getName() + "?? ȸ?????? ????");
	}

	@Override
	public void update(int id, String email) {
	}

	

	
	
}
