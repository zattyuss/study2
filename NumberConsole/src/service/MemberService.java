package service;

import java.util.List;
import java.util.Scanner;

import dao.MemberDao;
import model.Member;

// 실제 로직 수행(Dao 호출)
// DAO객체를 직접 생성 - 서비스객체는 DAO객체에 의존한다.

public class MemberService {
	
	private MemberDao dao;
	private Scanner scan = new Scanner(System.in);
	
	public MemberService(MemberDao dao) {
		this.dao= dao;
	}
	
	public List<Member> memberList() {
		System.out.println("┌───────────────────┐");
		System.out.println("│모든 회원정보를 조회합니다.│");
		
		List<Member> members = dao.selectAll();
		return members;
	}
	
	public void join() {
		String message = "회원가입 메뉴를 선택함";
		boolean check =  proceedCheck(message);
		if(!check) {
			System.out.println("이전 메뉴로 돌아갑니다.");
			return;
		}
		String name;
		String password;
		String email;
		while(true) {
			System.out.println("이름입력 : ");
			name = scan.nextLine();
			System.out.println("비밀번호 입력 : ");
			password = scan.nextLine();
			System.out.println("이메일 입력 : ");
			email = scan.nextLine();
			confirmInput(name,password,email);
			check = proceedCheck("위와 같이 입력했습니다.");
			if(check) break;
		}
		//회원번호, 이름, 비밀번호, 이메일
//		System.out.println("회원번호 입력 : ");
//		int id = scan.nextInt();
//		scan.nextLine();
		
		Member member = new Member(name, password, email);
		dao.insert(member);
		
		
	}


	

	private void confirmInput(String name, String password, String email) {
		System.out.println(name);
		System.out.println(password);
		System.out.println(email);
	}

	private boolean proceedCheck(String message) {
		System.out.println(message);
		while(true) {
			System.out.println("계속진행하시겠습니까? (넹/아니용)");
			String command = scan.nextLine();
			if(command.equals("넹")) {
				return true;
			} else if (command.equals("아니용")){
				return true;
			}
		}
		
		
		
		
	}
}
