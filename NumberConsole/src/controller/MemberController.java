package controller;
//��û ������ ����
//���� ��ü�� ���� ����(���Ѱ���) - ��Ʈ�ѷ��� ���� ��ü�� �����Ѵ�.

import java.util.List;
import java.util.Scanner;

import model.Member;
import service.MemberService;

public class MemberController {
	
	private Scanner scan = new Scanner(System.in);
	private String command;
	private MemberService service;
	
	
	public MemberController(MemberService service) {
		this.service = service;
	}

	public  void run() {
		help();
		while(true) {
			System.out.println(">> �޴����� <<: ");
			command = scan.nextLine();
			System.out.println("����������������������");
			System.out.println("�� "+ command + " �Է���  ��");
			System.out.println("����������������������");
		
		switch (command) {
		case "1":
			System.out.println("-----------------");
			System.out.println("��������������������");
			System.out.println("��ȸ�������ϱ⦢ ");
			System.out.println("��������������������");
			service.join();
			break;
		case "2":
			System.out.println("-----------------");
			System.out.println("��������������������");
			System.out.println("��ȸ������������");
			System.out.println("��������������������");
			break;
		case "3":
			System.out.println("-----------------");
			System.out.println("��������������������");
			System.out.println("��ȸ��������ȸ��");
			System.out.println("��������������������");
			break;
		case "4":
			System.out.println("-----------------");
			System.out.println("��������������������");
			System.out.println("�����ȸ��������");
			System.out.println("��������������������");
			List<model.Member> memberList = service.memberList();
			printInfo(memberList);
			service.memberList();
			break;
		case "0":
			System.out.println("-----------------");
			System.out.println("��������������������");
			System.out.println("�����α׷����ᦢ");
			System.out.println("��������������������");
			return;
		default:
			break;
			}
		}
	}

	private void printInfo(List<model.Member> memberList) {
		System.out.println("------------------------------------");
		for(Member member : memberList) {
			System.out.println("��������������������������������������������������������");
			System.out.println("��ȸ����ȣ : " + member.getId()+"		   ��");
			System.out.println("���̸� : " + member.getName()+"		   ��");
			System.out.println("����й�ȣ : " + member.getPassword()+"		   ��");
			System.out.println("���̸��� : " + member.getEmail()+"	   ��");
			System.out.println("��������������������������������������������������������");
			System.out.println();
		}
	}

	private void help() {
		System.out.println("��������������������������������������������������������");
		System.out.println("��     ���α׷� ���� : 0��	   ��");
		System.out.println("��     ȸ������ :    1��	   ��");  		
		System.out.println("��     ȸ���������� : 2��	   ��");	
		System.out.println("��     ȸ������ :    3��	   ��");
		System.out.println("��     ���ȸ������ : 4��	   ��");
		System.out.println("��������������������������������������������������������");
	}
}

