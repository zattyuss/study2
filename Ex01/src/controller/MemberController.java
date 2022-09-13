package controller;
//��Ʈ�ѷ� ��ü�� ���� ��ü�� �����Ѵ�. 
//= ��Ʈ�ѷ� ��ü�� ���� ��ü�� ����Ѵ�. 
//= ��Ʈ�ѷ� Ŭ������ �ʵ�� ���� Ÿ���� �ʵ尡 �´�.
//= ������ �Ǵ� ���͸� ���Ͽ� ���� ��ü�� ���Թ޴´�.
//= ���θ޼ҵ忡�� ���񽺰�ü�� �谳������ �����Ѵ�.

import java.util.List;
import java.util.Scanner;

import model.Member;
import service.MemberService;

public class MemberController {
	
	MemberService service;
	Scanner scan = new Scanner(System.in);
	String command;
	

	public MemberController(MemberService service) {
		this.service = service;
	
	}
	
	public void run() {
		help();
		while(true) {
			System.out.println(">> �޴����� << : ");
			command = scan.nextLine();
			
			
			switch (command) {
			case "1":
				System.out.println("ȸ������");
				break;
			case "2":
				System.out.println("����");
				break;
			case "3":
				System.out.println("ȸ��������ȸ");
				break;
			case "4":
				System.out.println("���ȸ��������ȸ");
				List<Member> memberList = service.memberList();
				printInfo(memberList);
				break;
			case "5":
				System.out.println("����");
				return;
			default:
				help();
				break;
			}
		}
	}

	private void help() {
		System.out.println("------------------------------------");
		System.out.println("ȸ������ : 1");
		System.out.println("ȸ���������� : 2");
		System.out.println("ȸ��������ȸ : 3");
		System.out.println("���ȸ���������� : 4");
		System.out.println("���� : 0");
		System.out.println("------------------------------------");
		
	}
	
	private void printInfo(List<Member> memberList) {
		System.out.println("================================");
		for(Member member : memberList) {
			
			System.out.println("ȸ����ȣ : " + member.getId());
			System.out.println("�̸� : " + member.getName());
			System.out.println("�̸��� : " + member.getEmail());
			System.out.println();
		}
		System.out.println("==================================");
	}
	

}
