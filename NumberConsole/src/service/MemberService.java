package service;

import java.util.List;
import java.util.Scanner;

import dao.MemberDao;
import model.Member;

// ���� ���� ����(Dao ȣ��)
// DAO��ü�� ���� ���� - ���񽺰�ü�� DAO��ü�� �����Ѵ�.

public class MemberService {
	
	private MemberDao dao;
	private Scanner scan = new Scanner(System.in);
	
	public MemberService(MemberDao dao) {
		this.dao= dao;
	}
	
	public List<Member> memberList() {
		System.out.println("������������������������������������������");
		System.out.println("����� ȸ�������� ��ȸ�մϴ�.��");
		
		List<Member> members = dao.selectAll();
		return members;
	}
	
	public void join() {
		String message = "ȸ������ �޴��� ������";
		boolean check =  proceedCheck(message);
		if(!check) {
			System.out.println("���� �޴��� ���ư��ϴ�.");
			return;
		}
		String name;
		String password;
		String email;
		while(true) {
			System.out.println("�̸��Է� : ");
			name = scan.nextLine();
			System.out.println("��й�ȣ �Է� : ");
			password = scan.nextLine();
			System.out.println("�̸��� �Է� : ");
			email = scan.nextLine();
			confirmInput(name,password,email);
			check = proceedCheck("���� ���� �Է��߽��ϴ�.");
			if(check) break;
		}
		//ȸ����ȣ, �̸�, ��й�ȣ, �̸���
//		System.out.println("ȸ����ȣ �Է� : ");
//		int id = scan.nextInt();
//		scan.nextLine();
		
		Member member = new Member(name, password, email);
		dao.insert(member);
		
		
	}


	

	private void confirmInput(String name, String password, String email) {
		System.out.println(name);
		System.out.println(password);
		System.out.println(email);
	}

	private boolean proceedCheck(String message) {
		System.out.println(message);
		while(true) {
			System.out.println("��������Ͻðڽ��ϱ�? (��/�ƴϿ�)");
			String command = scan.nextLine();
			if(command.equals("��")) {
				return true;
			} else if (command.equals("�ƴϿ�")){
				return true;
			}
		}
		
		
		
		
	}
}
