package member2;

import java.util.ArrayList;
import java.util.Scanner;

public class AppMain {
	static MemberDao dao = MemberDao.getInstance();
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println(">> ��ɾ� �Է� : ");
			String command = scan.nextLine();
		
			
			if(command.equals("���ȸ������")) {
				System.out.println("���ȸ��������ȸ");
				proceedfindAll();
				
			}else if(command.equals("��ȸ")) {
				System.out.println("ȸ��������ȸ");				
				proceedFindById();
				
			}else if(command.equals("����")) {
				System.out.println("ȸ�� ����");
				proceedJoin();
			}else if(command.equals("����")) {
				System.out.println("ȸ����������");
				
			}else if(command.equals("����")) {
				System.out.println("���α׷�����");
				break;
			}else {
				System.out.println("�߸��� ��ɾ� �Է�");
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
		System.out.println("��ȸ�� ȸ�� ��ȣ �Է� : ");
		int id = select.nextInt();
		System.out.println("�Է��� ȸ�� ��ȣ : " + id);
		Member member = dao.findById(id);
		printMemberInfo(member);
		
		
	}
	private static void proceedJoin() {
		Scanner idScan = new Scanner(System.in);
		Scanner nameScan = new Scanner(System.in);
		System.out.println(">> ȸ����ȣ �Է�");
		int id = idScan.nextInt();
		System.out.println(">> ȸ���̸� �Է�");
		String name = nameScan.nextLine();
		dao.addMember(new Member(id, name));
		System.out.println("������ �Ϸ� �Ǿ����ϴ�");
	}



	private static void printMemberInfo(Member member) {
		System.out.println("ȸ�� ��ȣ : "+member.getId());
		System.out.println("ȸ�� �̸� : "+member.getName());
		
	}

}
