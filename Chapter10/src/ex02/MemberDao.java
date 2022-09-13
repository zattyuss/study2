package ex02;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {

		private List<Member> memberList = new ArrayList<Member>();
		
		public MemberDao() {
			memberList.add(new Member(1, "김민수"));
			memberList.add(new Member(1, "박민수"));
			memberList.add(new Member(1, "양민수"));
			memberList.add(new Member(1, "줭민수"));
		}
		
		public Member findById(int id) { // 만약 5번이 전달되면
			Member member = null;
			for(Member m : memberList) {
				if(m.getId() == id) {
					member = m;
				}
			}
			if(member == null) throw new NotFoundMemberException("회원을 찾을 수 없음");
			return member; // null을 리턴한다
		}
		
}
