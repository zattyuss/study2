package dao;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public class MemberDao2 implements IMemberDao {

	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao2() {
		memberList.add(new Member(1, "�ڱ浿", "1234", "12342314@naver.com"));
		memberList.add(new Member(2, "��浿", "2234", "23423@naver.com"));
		memberList.add(new Member(3, "�̱浿", "2334", "123145@naver.com"));
		memberList.add(new Member(4, "���浿", "2434", "345342314@naver.com"));
		memberList.add(new Member(5, "���浿", "2534", "765534534@naver.com"));
	}
	
	
	
	@Override
	public List<Member> memberList() {
		return memberList;
	}

	@Override
	public Member selectById(int id) {
		
		return null;
	}

	@Override
	public List<Member> selectByName(String name) {
		
		return null;
	}

	@Override
	public void insert(Member meber) {
	}

	@Override
	public void delete(int id) {
	}

	@Override
	public void update(int id, String email) {
	}

	

	
	
}
