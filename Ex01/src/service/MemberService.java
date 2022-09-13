package service;

import java.util.List;

import dao.MemberDao;
import model.Member;

//서비스 객체는 DAO객체에 의존한다.

public class MemberService {

	MemberDao dao;
	
	
	
	public MemberService(MemberDao dao) {
		this.dao = dao;
	}
	public List<Member> memberList() {
		System.out.println("모든 회원정보를 조회합니다.");
		List<Member> members = dao.selectAll();
		return members;
	}
	
}
