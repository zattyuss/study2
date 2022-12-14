package service;

import java.util.List;

import dao.IMemberDao;
import dao.MemberDao;
import model.Member;

public class MemberService {

	private IMemberDao dao;
	
	public MemberService(IMemberDao dao) {
		this.dao = dao;
	}
	public MemberService() {}
	
	

	public void setDao(MemberDao dao) {
		this.dao = dao;
	}

	public List<Member> findAll(){
		return dao.memberList();
	}
	public Member findById(int id) {
		
		
		return dao.selectById(id);
	}
	public List<Member> findByName(String Name) {
		
		return dao.selectByName(Name);
	}
	public void join(Member member) {
		dao.insert(member);
	}
	public void remove(int id) {
		dao.delete(id);
	}
	

	
}
