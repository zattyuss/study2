package controller;

import java.util.List;
import java.util.Scanner;

import common.FoundNotMemberId;
import model.Member;
import service.MemberService;

public class MemberController {
	Scanner scan = new Scanner(System.in);
	String command;
	
	private MemberService service;

	public MemberController(MemberService service) {
		this.service = service;
	}
	
	public void run() {
		help();
		while(true) {
			System.out.println(">> �޴�����");
			command = scan.nextLine();
			
			switch (command) {
			case "0":
				System.out.println("����");
				break;
			case "1":
				System.out.println("ȸ������");
				break;
			case "2":
				System.out.println("ȸ����������");
				
				break;
			case "3":
				System.out.println("ȸ��������ȸ : ȸ����ȣ�Է� : ");
				String inputId = scan.nextLine();
				Member member = service.findById(inputId);
				if(member != null) 	printInfo(member);									
				break;
			case "4":
				System.out.println("ȸ��������ȸ - �̸��Է� : ");
				String inputName = scan.nextLine();
				List<Member> members = service.findByName(inputName);
				if(members != null) 	printInfo(members);	
				break;
			case "5":
				// ��� ȸ������ ��ȸ
				List<Member> memberList = service.memberList();
				printInfo(memberList);
				break;
			default:
				help();
				break;
			}
			
		}
//		List<Member> memberList = service.memberList();
		
	}
	
	private void memberInfo(Member member) {
		System.out.println("ȸ�� ��ȣ : " +member.getId() );
		System.out.println("ȸ�� �̸� : " + member.getName());
		System.out.println("��й�ȣ : " + member.getPassword());
		System.out.println("�̸��� : " + member.getEmail());
	}
	
	
	
	
	// �����ε�
	private void printInfo(Member member) {
		System.out.println("=====================");
		memberInfo(member);
		System.out.println("=====================");
	}

	private void printInfo(List<Member> memberList) {
		for(Member member : memberList) {
			System.out.println("=====================");
			memberInfo(member);
		}
	}
	private void help() {
		System.out.println("=-=================");
		System.out.println("���α׷� ���� : 0");
		System.out.println("ȸ�� ���� : 1");
		System.out.println("ȸ���������� : 2");
		System.out.println("ȸ��������ȸ : ȸ����ȣ�Է� : 3");	
		System.out.println("ȸ���������� : �̸��Է� : 4");	
		System.out.println("���ȸ��������ȸ : 5");
		System.out.println("=======================");
	}
	
	
	
	}
	
