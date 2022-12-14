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
		System.out.println("실행");
		while(true) {
			System.out.println(">> 메뉴선택 : ");
			command = scan.nextLine();
			switch (command) {
			case "0":
				System.out.println("프로그램 종료");
				break;
			case "1":
				System.out.println("모든회원정보조회");
				List<Member> memberList = service.findAll();
				printInfo(memberList);
				break;	
			case "2":
				System.out.println(">>회원번호를 입력하세요 : ");
				String inputId = scan.nextLine();
				Member member = service.findById(inputId);
				if(member != null) printInfo(member);
				break;	
			case "3":
				System.out.println(">>회원이름을 입력하세요 : ");
				String inputName = scan.nextLine();
				List<Member> members = service.findByName(inputName);
				if(members != null) printInfo(members);
				break;	
			case "4":
				System.out.println(">>회원가입 선택: ");
				service.save();
				break;	
			case "5":
				System.out.println("삭제 할 회원번호 입력 : ");
				String id = scan.nextLine();
				int idValue = Integer.parseInt(id);
				service.remove(idValue);
				break;	
			case "6":
				System.out.println("수정 할 회원번호 입력 : ");
				String updateId = scan.nextLine();
				service.modifiy(Integer.parseInt(updateId));
				break;	
			default:
				System.out.println("올바르게 사용하셈");
				help();
				break;
			}
		}
	}

	private void printInfo(Member m) {
		System.out.println("=======================");
		System.out.println("번호 : "+ m.getId());
		System.out.println("이름 : "+ m.getName());
		System.out.println("이메일 : " + m.getEmail());
	}

	private void printInfo(List<Member> memberList) {
		for(Member m : memberList) {
			System.out.println("=======================");
			System.out.println("번호 : "+ m.getId());
			System.out.println("이름 : "+ m.getName());
			System.out.println("이메일 : " + m.getEmail());
		}
	}

	private void help() {
		System.out.println("====================");
		System.out.println("프로그램 종료 : 0 ");
		System.out.println("모든회원정보조회 : 1 ");
		System.out.println("회원번호로 정보조회 : 2 ");
		System.out.println("회원이름으로 정보조회 : 3 ");
		System.out.println("회원가입 : 4 ");
		System.out.println("회원삭제 : 5 ");
		System.out.println("회원 이메일 수정 : 6 ");
		
		System.out.println("====================");
	}

}
