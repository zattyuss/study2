package common;

import java.util.List;

import model.Member;

public class MemberUtil {
	//�̸����� ã��
	public static void printInfo(Member member) {
		System.out.println("==================================");
		System.out.println("ȸ����ȣ : " + member.getId());
		System.out.println("ȸ���̸� : " + member.getName());
		System.out.println("ȸ���̸��� : " + member.getEmail());
	}
	// ȸ�� ��ȣ�� ã��
	public static void printInfo(List<Member> memberList) {
		for (Member m : memberList) {
			System.out.println("==================================");
			System.out.println("ȸ����ȣ : " + m.getId());
			System.out.println("ȸ���̸� : " + m.getName());
			System.out.println("ȸ���̸��� : " + m.getEmail());
		}
	}
	
	public static void help() {
		System.out.println("==================================");
		System.out.println("0. ���α׷� ����");
		System.out.println("1. ��� ȸ������ ��ȸ");
		System.out.println("2. ȸ����ȣ ��ȸ");
		System.out.println("3. ȸ���̸����� ��ȸ");
		System.out.println("4. ȸ������");
		System.out.println("5. ȸ������");
		System.out.println("==================================");
	}

}
