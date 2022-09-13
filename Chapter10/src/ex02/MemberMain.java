package ex02;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MemberDao dao = new MemberDao();
		
		
												
		try {
			System.out.println(">> 회원번호 입력 : ");
			String userInput = scan.nextLine();
			int id = Integer.parseInt(userInput);
			Member findMember = dao.findById(100);
			System.out.println("찾은 회원 이름 : " + findMember.getName());		
		} catch (NotFoundMemberException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("다른예외 발생");
		}
	}
		
		
		
		
		
		
		
//		if(findMember != null) {
//			System.out.println("찾은 회원 이름 : " + findMember.getName());
//		}else {
//			System.out.println("존재하지 않는 회원");
//		}
	}

