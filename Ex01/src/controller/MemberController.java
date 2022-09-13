package controller;
//컨트롤러 객체는 서비스 객체에 의존한다. 
//= 컨트롤러 객체가 서비스 객체를 사용한다. 
//= 컨트롤러 클래스의 필드로 서비스 타입의 필드가 온다.
//= 생성자 또는 세터를 통하여 서비스 객체를 주입받는다.
//= 메인메소드에서 서비스객체를 배개변수로 전달한다.

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
			System.out.println(">> 메뉴선택 << : ");
			command = scan.nextLine();
			
			
			switch (command) {
			case "1":
				System.out.println("회원가입");
				break;
			case "2":
				System.out.println("수정");
				break;
			case "3":
				System.out.println("회원정보조회");
				break;
			case "4":
				System.out.println("모든회원정보조회");
				List<Member> memberList = service.memberList();
				printInfo(memberList);
				break;
			case "5":
				System.out.println("종료");
				return;
			default:
				help();
				break;
			}
		}
	}

	private void help() {
		System.out.println("------------------------------------");
		System.out.println("회원가입 : 1");
		System.out.println("회원정보수정 : 2");
		System.out.println("회원정보조회 : 3");
		System.out.println("모든회원정보수정 : 4");
		System.out.println("종료 : 0");
		System.out.println("------------------------------------");
		
	}
	
	private void printInfo(List<Member> memberList) {
		System.out.println("================================");
		for(Member member : memberList) {
			
			System.out.println("회원번호 : " + member.getId());
			System.out.println("이름 : " + member.getName());
			System.out.println("이메일 : " + member.getEmail());
			System.out.println();
		}
		System.out.println("==================================");
	}
	

}
