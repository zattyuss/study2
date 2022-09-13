package member;

public class MemberDao {
	
	private static MemberDao memberdao = new MemberDao();
	
	private Member[] members = new Member[100];
	
	private MemberDao() {
			members[0] = new Member(1,"니나브");
			members[1] = new Member(2,"바훈투르");
			members[2] = new Member(3,"이난나");
			members[3] = new Member(4,"실리안");
		
	
	}
	
	// 모든 회원 조회
	public Member findById(int id) {
		return this.members[id-1];
	}
	
	//BoardDado 객체 반환
	public static MemberDao getInstance() {
		return memberdao;
	}

	//모든 회원 조회
	public Member[] findAll() {
		return members;
	}
		
		
	
}
