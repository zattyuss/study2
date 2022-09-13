package member2;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {
	static MemberDao dao = MemberDao.getInstance();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println(">> 명령어 입력 : ");
			String command = scan.nextLine();
		
			
			if(command.equals("모든회원정보")) {
				System.out.println("모든회원정보조회");
				proceedfindAll();
				
			}else if(command.equals("조회")) {
				System.out.println("회원정보조회");				
				proceedFindById();
				
			}else if(command.equals("가입")) {
				System.out.println("회원 가입");
				proceedJoin();
			}else if(command.equals("삭제")) {
				System.out.println("회원정보삭제");
				
			}else if(command.equals("종료")) {
				System.out.println("프로그램종료");
				break;
			}else {
				System.out.println("잘못된 명령어 입력");
			}
		}
	}
	private static void proceedfindAll() {
		ArrayList<Member> members = dao.findAll();
		System.out.println("===========================");
		for(Member m : members) {
			printMemberInfo(m);
		}
		System.out.println("===========================");
		
	}
	private static void proceedFindById() {
		Scanner select = new Scanner(System.in);
		System.out.println("조회할 회원 번호 입력 : ");
		int id = select.nextInt();
		System.out.println("입력한 회원 번호 : " + id);
		Member member = dao.findById(id);
		printMemberInfo(member);
		
		
	}
	private static void proceedJoin() {
		Scanner idScan = new Scanner(System.in);
		Scanner nameScan = new Scanner(System.in);
		System.out.println(">> 회원번호 입력");
		int id = idScan.nextInt();
		System.out.println(">> 회원이름 입력");
		String name = nameScan.nextLine();
		dao.addMember(new Member(id, name));
		System.out.println("가입이 완료 되었습니다");
	}



	private static void printMemberInfo(Member member) {
		System.out.println("회원 번호 : "+member.getId());
		System.out.println("회원 이름 : "+member.getName());
		
	}

}
