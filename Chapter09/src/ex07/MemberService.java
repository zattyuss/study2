package ex07;

public class MemberService {

	private MemberDao dao;
	
	public MemberService(final MemberDao dao) {
		this.dao = dao;
//		dao = new MemberDao("이런짓 하는 사람 꼭 있음");
	}

	void findAll() {
		dao.selectAll();
	}

	public MemberDao getDao() {
		return dao;
	}
	
	
	
}
