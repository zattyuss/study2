package ex07;

public class MemberService {

	private MemberDao dao;
	
	public MemberService(final MemberDao dao) {
		this.dao = dao;
//		dao = new MemberDao("�̷��� �ϴ� ��� �� ����");
	}

	void findAll() {
		dao.selectAll();
	}

	public MemberDao getDao() {
		return dao;
	}
	
	
	
}