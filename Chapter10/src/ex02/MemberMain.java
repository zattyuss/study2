package ex02;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MemberDao dao = new MemberDao();
		
		
												
		try {
			System.out.println(">> ȸ����ȣ �Է� : ");
			String userInput = scan.nextLine();
			int id = Integer.parseInt(userInput);
			Member findMember = dao.findById(100);
			System.out.println("ã�� ȸ�� �̸� : " + findMember.getName());		
		} catch (NotFoundMemberException e) {
			System.out.println(e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("�ٸ����� �߻�");
		}
	}
		
		
		
		
		
		
		
//		if(findMember != null) {
//			System.out.println("ã�� ȸ�� �̸� : " + findMember.getName());
//		}else {
//			System.out.println("�������� �ʴ� ȸ��");
//		}
	}
