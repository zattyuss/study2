package dao;

import model.Member;

public class MemberDao {

	
	public Member[] memberList() {
		Member[] members = {
				new Member(1,"�ϳ���","ninav@lostark.com"),
				new Member(2,"��������","vahoontur@lostark.com"),
				new Member(3,"�Ǹ���","Silian@lostark.com"),
				new Member(4,"�̳���","inanna@lostark.com"),
				
		};
		return members;
	}
	
}
