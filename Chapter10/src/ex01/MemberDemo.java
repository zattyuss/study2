package ex01;

public class MemberDemo {

		public static void main(String[] args) {
			MemberDao dao = new MemberDao();
			MemberService service = new MemberService();
			service.setDao(dao);
			
			service.memberList();
		}
}
