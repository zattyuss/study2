package dao;

import java.util.ArrayList;
import java.util.List;

import common.FoundNotMember;
import common.FoundNotMemberId;
import model.Member;

public class MemberDao {
	
	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao() {
		memberList.add(new Member(1, "ȫ�浿", "1234", "hong@naver.com"));
		memberList.add(new Member(2, "��浿", "5235", "kim@naver.com"));
		memberList.add(new Member(3, "���浿", "7656", "na@naver.com"));
		memberList.add(new Member(4, "�ڱ浿", "9787", "park@naver.com"));
		memberList.add(new Member(5, "�̱浿", "3454", "yee@naver.com"));
		memberList.add(new Member(6, "�̱浿", "5454", "2@naver.com"));
		memberList.add(new Member(9, "�̱浿", "2454", "e@naver.com"));
	}
	//���ȸ�� ��ȸ
	public List<Member> memberList(){
		return memberList;
	}
	//ȸ����ȣ�� ��ȸ
	public Member selectById(int id) {
		Member findMember =null;
		for(Member m : memberList) {
			if(id == m.getId()) {
				findMember = m;
			}
		}
		
		if(findMember == null) throw new FoundNotMember("�������� �ʴ� ȸ���Դϴ�.");
		
		return findMember;
	}
	
	public List<Member> selectByName(String name){
		List<Member> findMembers = new ArrayList<Member>();
		for(var m : memberList) {
			if(name.equals(m.getName())) {
				findMembers.add(m);
			}
		}
		if(findMembers.isEmpty()) throw new FoundNotMember("�������� �ʴ� ȸ���Դϴ�.");
		return findMembers;
	}
	//ȸ������
	public void insert(Member member) {
		int index = memberList.size()-1;
		member.setId(memberList.get(index).getId()+1);
		memberList.add(member);
		System.out.println(member.getName()+ "���� ȸ�������� �Ϸ��߽��ϴ�.");
		
	}
	
	//ȸ������
	public void delete(int id) { //ȸ����ȣ 6���� ���޵ȴٸ�
//		memberList.add(new Member(5, "�̱浿", "3454", "yee@naver.com"));
		Member selectById = selectById(id); //����Ʈ���� 5�� �ε����� ��ġ
		int index = memberList.indexOf(selectById);
		System.out.println(selectById.getId()+ "�� ȸ������");
		memberList.remove(index);
		
		
		
	}
	public void update(int id, String email) {
		Member selectById = selectById(id);
		int index = memberList.indexOf(selectById);
		memberList.get(index).setEmail(email);
		
		
		
		
	}
}