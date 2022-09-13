package controller;

import java.util.List;
import java.util.Scanner;

import common.MemberUtil;
import dao.NotFoundMemberException;
import model.Member;
import service.MemberService;

public class MemberController {

	private MemberService service;
	private String command;
	private Scanner scan = new Scanner(System.in);

	public MemberController() {
	}

	public void setService(MemberService service) {
		this.service = service;
	}

	public void setScan(Scanner scan) {
		this.scan = scan;
	}

	public MemberController(MemberService service) {
		this.service = service;
	}

	// ���α׷� ���� - �޴�����
	public void run() {
		MemberUtil.help();
		while (true) {

			System.out.println(">> �޴����� : ");
			command = scan.nextLine();
			switch (command) {
			case "0":
				System.out.println("���α׷� ����");
				return; // ����� ����
			case "1":
				proceedFindMemberList();
				break;
			case "2":
				proceedFindMemberById();
				break;
			case "3":
				proceedFindMemberByName();
				break;
			case "4":
				proceedJoin();
				break;
			case "5":
				proceedRemove();
				break;
			default:
				System.out.println("�ùٸ� ���� �Է��ϼ���.");
				MemberUtil.help();
				break;
			}
		}
	}

	private void proceedRemove() {
		try {
			System.out.print(">>������ ȸ����ȣ �Է� : ");
			String inputId = scan.nextLine();
			int id = Integer.parseInt(inputId);
			service.remove(id);
		} catch (NumberFormatException e) {
			System.out.println("���ڷ� �Է��ϼ���");
		} catch (NotFoundMemberException e) {
			System.out.println(e.getMessage());
		}

	}

	// ȸ������
	private void proceedJoin() {

		String name, password, email;
		while (true) {
			System.out.println(">>ȸ������ ����");
			System.out.println(">>�̸� �Է� : ");
			name = scan.nextLine();
			System.out.println(">>��й�ȣ �Է� : ");
			password = scan.nextLine();
			System.out.println(">>�̸��� �Է�");
			email = scan.nextLine();

			System.out.println("===========�Է��� ��==========");
			System.out.println("�̸� : " + name);
			System.out.println("��й�ȣ : " + password);
			System.out.println("�̸��� : " + email);
			System.out.println("��� �����Ͻðڽ��ϱ�? (Ȯ��/���/�ٽ��Է��� �ƹ��ų�)");
			String checkProceed = scan.nextLine();

			if (checkProceed.equals("Ȯ��")) {
				break;
			} else if ((checkProceed.equals("���"))) {
				return;
			}
		}
		Member member = new Member(name, password, email);
		service.join(member);
	}

	// ���ȸ����ȸ
	private void proceedFindMemberList() {
		System.out.println("��� ȸ������ ��ȸ");
		List<Member> memberList = service.findAll();
		MemberUtil.printInfo(memberList);
	}

	// �̸����� ã��
	private void proceedFindMemberByName() {
		while (true) {
			try {
				System.out.println("ȸ�� �̸��� �Է��ϼ��� : ");
				String inputName = scan.nextLine();
				if (inputName.equals("����")) {
					break;
				}
				List<Member> members = service.findByName(inputName);
				MemberUtil.printInfo(members);
			} catch (NotFoundMemberException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// ȸ�����̵�� ã��
	private void proceedFindMemberById() {
		while (true) {
			try {
				System.out.println(">>ȸ�� ��ȣ�� �Է��ϼ��� : ");
				String inputId = scan.nextLine();
				if (inputId.equals("����")) {
					break;
				}
				int id = Integer.parseInt(inputId);
				Member members = service.findById(id);
				MemberUtil.printInfo(members);
			} catch (NotFoundMemberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("���ڷ� �Է��ϼ���");
			}
		}
	}

}
