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

	// 프로그램 시작 - 메뉴선택
	public void run() {
		MemberUtil.help();
		while (true) {

			System.out.println(">> 메뉴선택 : ");
			command = scan.nextLine();
			switch (command) {
			case "0":
				System.out.println("프로그램 종료");
				return; // 종료는 리턴
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
				System.out.println("올바른 값을 입력하세요.");
				MemberUtil.help();
				break;
			}
		}
	}

	private void proceedRemove() {
		try {
			System.out.print(">>삭제할 회원번호 입력 : ");
			String inputId = scan.nextLine();
			int id = Integer.parseInt(inputId);
			service.remove(id);
		} catch (NumberFormatException e) {
			System.out.println("숫자로 입력하세요");
		} catch (NotFoundMemberException e) {
			System.out.println(e.getMessage());
		}

	}

	// 회원가입
	private void proceedJoin() {

		String name, password, email;
		while (true) {
			System.out.println(">>회원가입 선택");
			System.out.println(">>이름 입력 : ");
			name = scan.nextLine();
			System.out.println(">>비밀번호 입력 : ");
			password = scan.nextLine();
			System.out.println(">>이메일 입력");
			email = scan.nextLine();

			System.out.println("===========입력한 값==========");
			System.out.println("이름 : " + name);
			System.out.println("비밀번호 : " + password);
			System.out.println("이메일 : " + email);
			System.out.println("계속 진행하시겠습니까? (확인/취소/다시입력은 아무거나)");
			String checkProceed = scan.nextLine();

			if (checkProceed.equals("확인")) {
				break;
			} else if ((checkProceed.equals("취소"))) {
				return;
			}
		}
		Member member = new Member(name, password, email);
		service.join(member);
	}

	// 모든회원조회
	private void proceedFindMemberList() {
		System.out.println("모든 회원정보 조회");
		List<Member> memberList = service.findAll();
		MemberUtil.printInfo(memberList);
	}

	// 이름으로 찾기
	private void proceedFindMemberByName() {
		while (true) {
			try {
				System.out.println("회원 이름을 입력하세요 : ");
				String inputName = scan.nextLine();
				if (inputName.equals("이전")) {
					break;
				}
				List<Member> members = service.findByName(inputName);
				MemberUtil.printInfo(members);
			} catch (NotFoundMemberException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	// 회원아이디로 찾기
	private void proceedFindMemberById() {
		while (true) {
			try {
				System.out.println(">>회원 번호를 입력하세요 : ");
				String inputId = scan.nextLine();
				if (inputId.equals("이전")) {
					break;
				}
				int id = Integer.parseInt(inputId);
				Member members = service.findById(id);
				MemberUtil.printInfo(members);
			} catch (NotFoundMemberException e) {
				System.out.println(e.getMessage());
			} catch (NumberFormatException e) {
				System.out.println("숫자로 입력하세요");
			}
		}
	}

}
