package app;

import java.util.Scanner;

import controller.MemberController;
import dao.IMemberDao;
import dao.MemberDao;
import dao.MemberDao2;
import service.MemberService;

public class AppMain {
	public static void main(String[] args) {
		IMemberDao dao = new MemberDao();
		MemberService service = new MemberService(dao);
		MemberController controller = new MemberController(service);
		
		Scanner scan = new Scanner(System.in);// ��ĳ�� ����
		controller.setScan(scan);//��ĳ�� ����
		
		controller.run();// ���α׷� ����
		scan.close(); //��ĳ�� �ݱ�
		System.out.println("���θ޼ҵ� ����");
		
	}
}
