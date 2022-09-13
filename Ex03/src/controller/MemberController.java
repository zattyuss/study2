package controller;

import java.util.List;
import java.util.Scanner;

import model.Member;
import service.MemberService;

public class MemberController {
	private MemberService service;
	private Scanner scan = new Scanner(System.in);
	private String command;
	
	
	public MemberController(MemberService service) {
		this.service = service;
	}

	public void run() {
		help();
		System.out.println("����");
		while(true) {
			System.out.println(">> �޴����� : ");
			command = scan.nextLine();
			switch (command) {
			case "0":
				System.out.println("���α׷� ����");
				break;
			case "1":
				System.out.println("���ȸ��������ȸ");
				List<Member> memberList = service.findAll();
				printInfo(memberList);
				break;	
			case "2":
				System.out.println(">>ȸ����ȣ�� �Է��ϼ��� : ");
				String inputId = scan.nextLine();
				Member member = service.findById(inputId);
				if(member != null) printInfo(member);
				break;	
			case "3":
				System.out.println(">>ȸ���̸��� �Է��ϼ��� : ");
				String inputName = scan.nextLine();
				List<Member> members = service.findByName(inputName);
				if(members != null) printInfo(members);
				break;	
			case "4":
				System.out.println(">>ȸ������ ����: ");
				service.save();
				break;	
			case "5":
				System.out.println("���� �� ȸ����ȣ �Է� : ");
				String id = scan.nextLine();
				int idValue = Integer.parseInt(id);
				service.remove(idValue);
				break;	
			case "6":
				System.out.println("���� �� ȸ����ȣ �Է� : ");
				String updateId = scan.nextLine();
				service.modifiy(Integer.parseInt(updateId));
				break;	
			default:
				System.out.println("�ùٸ��� ����ϼ�");
				help();
				break;
			}
		}
	}

	private void printInfo(Member m) {
		System.out.println("=======================");
		System.out.println("��ȣ : "+ m.getId());
		System.out.println("�̸� : "+ m.getName());
		System.out.println("�̸��� : " + m.getEmail());
	}

	private void printInfo(List<Member> memberList) {
		for(Member m : memberList) {
			System.out.println("=======================");
			System.out.println("��ȣ : "+ m.getId());
			System.out.println("�̸� : "+ m.getName());
			System.out.println("�̸��� : " + m.getEmail());
		}
	}

	private void help() {
		System.out.println("====================");
		System.out.println("���α׷� ���� : 0 ");
		System.out.println("���ȸ��������ȸ : 1 ");
		System.out.println("ȸ����ȣ�� ������ȸ : 2 ");
		System.out.println("ȸ���̸����� ������ȸ : 3 ");
		System.out.println("ȸ������ : 4 ");
		System.out.println("ȸ������ : 5 ");
		System.out.println("ȸ�� �̸��� ���� : 6 ");
		
		System.out.println("====================");
	}

}