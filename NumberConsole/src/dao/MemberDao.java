package dao;

import java.util.ArrayList;
import java.util.List;

import model.Member;

// �����ͺ��̽����� ��û�� �����͸� �������ų� ����/����/����
public class MemberDao {
	
	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao() {
		memberList.add(new Member(1,"ȫ�浿","1234","qwer@naver.com"));
		memberList.add(new Member(2,"��浿","1234","asdf@naver.com"));
		memberList.add(new Member(3,"��浿","1234","zxcv@naver.com"));
		memberList.add(new Member(4,"���浿","1234","bnm@naver.com"));
		memberList.add(new Member(5,"�ڱ浿","1234","ghj@naver.com"));

		
	}
	
	public List<Member> selectAll() {
		System.out.println("����� ����� ��ȸ�մϴٶ��� ��");
		System.out.println("������������������������������������������");
		return memberList;
	}

	public void insert(Member member) {
		member.setId(memberList.size()+1);
		memberList.add(member);
		System.out.println(member.getName()+ "���� ȸ�������� �Ϸ��߽��ϴ�.");
	}
	
	
	
	
}
