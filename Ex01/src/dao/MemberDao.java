package dao;

import java.util.ArrayList;
import java.util.List;

import model.Member;

//��ü ����, ��ü���� �������踦 ���� (����)
// DAO��ü����, ���񽺰�ü ����, ��Ʈ�ѷ� ��ü ����
public class MemberDao {

	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao() {
		memberList.add(new Member(1, "�浿1", "235", "1111@11.com"));
		memberList.add(new Member(1, "�浿2", "235", "2222@22.com"));
		memberList.add(new Member(1, "�浿3", "235", "3333@33.com"));
		memberList.add(new Member(1, "�浿4", "235", "4444@44.com"));
		memberList.add(new Member(1, "�浿5", "235", "5555@55.com"));
		
	}
	
	
	public List<Member> selectAll() {
		return memberList;
	}
	
}
