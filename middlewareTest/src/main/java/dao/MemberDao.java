package dao;

import model.Member;

public class MemberDao {

	
	public Member[] memberList() {
		Member[] members = {
				new Member(1,"니나브","ninav@lostark.com"),
				new Member(2,"바훈투르","vahoontur@lostark.com"),
				new Member(3,"실리안","Silian@lostark.com"),
				new Member(4,"이난나","inanna@lostark.com"),
				
		};
		return members;
	}
	
}
