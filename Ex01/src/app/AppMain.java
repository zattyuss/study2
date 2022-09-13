package app;

import controller.MemberController;
import dao.MemberDao;
import service.MemberService;

//객체 생성, 객체간의 의존관계를 설정 (조합)
//DAO객체생성, 서비스객체 생성, 컨트롤러 객체 생성
public class AppMain {
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		MemberService service = new MemberService(dao);
		MemberController controller = new MemberController(service);
		
		controller.run();
	}
}
