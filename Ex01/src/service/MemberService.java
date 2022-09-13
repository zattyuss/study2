package service;

import java.util.List;

import dao.MemberDao;
import model.Member;

//���� ��ü�� DAO��ü�� �����Ѵ�.

public class MemberService {

	MemberDao dao;
	
	
	
	public MemberService(MemberDao dao) {
		this.dao = dao;
	}
	public List<Member> memberList() {
		System.out.println("��� ȸ�������� ��ȸ�մϴ�.");
		List<Member> members = dao.selectAll();
		return members;
	}
	
}
