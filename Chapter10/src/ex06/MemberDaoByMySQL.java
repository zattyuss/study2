package ex06;

public class MemberDaoByMySQL implements MemberDao {

	@Override
	public void selectAll() {
		System.out.println("MySQL 데이터베이스 조회");
	}

}
