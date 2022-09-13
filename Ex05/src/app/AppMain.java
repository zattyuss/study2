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
		
		Scanner scan = new Scanner(System.in);// 스캐너 생성
		controller.setScan(scan);//스캐너 주입
		
		controller.run();// 프로그램 실행
		scan.close(); //스캐너 닫기
		System.out.println("메인메소드 종료");
		
	}
}
