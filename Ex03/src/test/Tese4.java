package test;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public class Tese4 {
	private static List<Member> memberList;

	public static void main(String[] args) {
		List<Member> members = new ArrayList<Member>();
		
		members.add(new Member(1, "��´�1", "�� �����ʹ�", "����1?"));
		members.add(new Member(2, "��´�2", "�� �����ʹ�", "����2?"));
		members.add(new Member(3, "��´�3", "�� �����ʹ�", "����3?"));
		
		System.out.println(members);
		
		Member member = members.get(1);
		System.out.println("ȸ����ȣ : " + member.getId());
		System.out.println("�̸� : " + member.getName());
		System.out.println("�̸��� : " + member.getEmail());
		
		System.out.println("��üȸ���� : " + members.size()+"��");
		
		int index = members.size()-1;
		System.out.println("���� �ֱٿ� ������ ȸ�� : " + members.size()+ "��");
		
	}
}