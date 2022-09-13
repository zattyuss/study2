package controller;
//요청 적합한 서비스
//서비스 객체를 직접 생성(강한결합) - 컨트롤러는 서비스 객체에 의존한다.

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
			System.out.println(">> 메뉴선택 <<: ");
			command = scan.nextLine();
			System.out.println("┌─────────┐");
			System.out.println("│ "+ command + " 입력함  │");
			System.out.println("└─────────┘");
		
		switch (command) {
		case "1":
			System.out.println("-----------------");
			System.out.println("┌────────┐");
			System.out.println("│회원가입하기│ ");
			System.out.println("└────────┘");
			service.join();
			break;
		case "2":
			System.out.println("-----------------");
			System.out.println("┌────────┐");
			System.out.println("│회원정보수정│");
			System.out.println("└────────┘");
			break;
		case "3":
			System.out.println("-----------------");
			System.out.println("┌────────┐");
			System.out.println("│회원정보조회│");
			System.out.println("└────────┘");
			break;
		case "4":
			System.out.println("-----------------");
			System.out.println("┌────────┐");
			System.out.println("│모든회원정보│");
			System.out.println("└────────┘");
			List<model.Member> memberList = service.memberList();
			printInfo(memberList);
			service.memberList();
			break;
		case "0":
			System.out.println("-----------------");
			System.out.println("┌────────┐");
			System.out.println("│프로그램종료│");
			System.out.println("└────────┘");
			return;
		default:
			break;
			}
		}
	}

	private void printInfo(List<model.Member> memberList) {
		System.out.println("------------------------------------");
		for(Member member : memberList) {
			System.out.println("┌──────────────────────────┐");
			System.out.println("│회원번호 : " + member.getId()+"		   │");
			System.out.println("│이름 : " + member.getName()+"		   │");
			System.out.println("│비밀번호 : " + member.getPassword()+"		   │");
			System.out.println("│이메일 : " + member.getEmail()+"	   │");
			System.out.println("└──────────────────────────┘");
			System.out.println();
		}
	}

	private void help() {
		System.out.println("┌──────────────────────────┐");
		System.out.println("│     프로그램 종료 : 0번	   │");
		System.out.println("│     회원가입 :    1번	   │");  		
		System.out.println("│     회원정보수정 : 2번	   │");	
		System.out.println("│     회원정보 :    3번	   │");
		System.out.println("│     모든회원정보 : 4번	   │");
		System.out.println("└──────────────────────────┘");
	}
}

