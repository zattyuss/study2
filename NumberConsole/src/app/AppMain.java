package app;

import controller.MemberController;
import dao.MemberDao;
import service.MemberService;

//프로그램 시작 컨트롤러 호출
//컨트롤러 직접 생성
public class AppMain {
	public static void main(String[] args) {
		
		MemberDao dao = new MemberDao();
		MemberService service = new MemberService(dao);
		MemberController controller = new MemberController(service);
		controller.run();
		
	}
}
