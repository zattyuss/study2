package service;

import java.util.List;

import common.FoundNotMemberId;
import dao.MemberDao;
import model.Member;

public class MemberService {
	
	
	private MemberDao dao;

	public MemberService(MemberDao dao) {
		this.dao = dao;
	}
	
	public List<Member> memberList(){
		System.out.println("���ȸ������ ��ȸ");
		return dao.selectAll();
	}
	
	public Member findById(String id) {
		int inputId = Integer.parseInt(id);
		Member member = null;
		try {
			member  = dao.selectById(inputId);//���ܹ߻����ɼ�			
		} catch (FoundNotMemberId e) {
			System.out.println(e.getMessage());
		}
			
		return member;
		}
//		if(member == null) {
//			System.out.println("ã�� ȸ���� �������� ����");
//		
//		}
		
	public List<Member> findByName(String name){
		List<Member> members = null;
		try {
			members =  dao.selectByName(name);
		} catch (FoundNotMemberId e) {
			System.out.println(e.getMessage());
		}
		return members;
	}
		
			
}