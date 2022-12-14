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
			System.out.println(">> 메뉴선택");
			command = scan.nextLine();
			
			switch (command) {
			case "0":
				System.out.println("종료");
				break;
			case "1":
				System.out.println("회원가입");
				break;
			case "2":
				System.out.println("회원정보수정");
				
				break;
			case "3":
				System.out.println("회원정보조회 : 회원번호입력 : ");
				String inputId = scan.nextLine();
				Member member = service.findById(inputId);
				if(member != null) 	printInfo(member);									
				break;
			case "4":
				System.out.println("회원정보조회 - 이름입력 : ");
				String inputName = scan.nextLine();
				List<Member> members = service.findByName(inputName);
				if(members != null) 	printInfo(members);	
				break;
			case "5":
				// 모든 회원정보 조회
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
		System.out.println("회원 번호 : " +member.getId() );
		System.out.println("회원 이름 : " + member.getName());
		System.out.println("비밀번호 : " + member.getPassword());
		System.out.println("이메일 : " + member.getEmail());
	}
	
	
	
	
	// 오버로딩
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
		System.out.println("프로그램 종료 : 0");
		System.out.println("회원 가입 : 1");
		System.out.println("회원정보수정 : 2");
		System.out.println("회원정보조회 : 회원번호입력 : 3");	
		System.out.println("회원정보조정 : 이름입력 : 4");	
		System.out.println("모든회원정보조회 : 5");
		System.out.println("=======================");
	}
	
	
	
	}
	

