package ex07;

public class AppMain {
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		MemberService service = new MemberService(dao);
		service.findAll();
		System.out.println(service.getDao().test);
		
		
		
	}
}
