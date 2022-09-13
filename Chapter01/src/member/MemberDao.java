package member;

public class MemberDao {
	
	private static MemberDao memberdao = new MemberDao();
	
	private Member[] members = new Member[100];
	
	private MemberDao() {
			members[0] = new Member(1,"�ϳ���");
			members[1] = new Member(2,"��������");
			members[2] = new Member(3,"�̳���");
			members[3] = new Member(4,"�Ǹ���");
		
	
	}
	
	// ��� ȸ�� ��ȸ
	public Member findById(int id) {
		return this.members[id-1];
	}
	
	//BoardDado ��ü ��ȯ
	public static MemberDao getInstance() {
		return memberdao;
	}

	//��� ȸ�� ��ȸ
	public Member[] findAll() {
		return members;
	}
		
		
	
}
