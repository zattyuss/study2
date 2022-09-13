package app;

import controller.MemberController;
import dao.MemberDao;
import service.MemberService;

public class AppMain {
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		MemberService service = new MemberService(dao);
		MemberController controller = new MemberController(service);
		controller.run();
	}
}
