package ex07;

public class MemberDao {

	String test;
	
	public MemberDao() {
		
	}
	
	
	public MemberDao(String test) {
		this.test = test;
	}


	public void selectAll() {
		System.out.println("모든회원정보조회");
	}

}
