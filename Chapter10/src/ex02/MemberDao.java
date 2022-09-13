package ex02;

import java.util.ArrayList;
import java.util.List;

public class MemberDao {

		private List<Member> memberList = new ArrayList<Member>();
		
		public MemberDao() {
			memberList.add(new Member(1, "��μ�"));
			memberList.add(new Member(1, "�ڹμ�"));
			memberList.add(new Member(1, "��μ�"));
			memberList.add(new Member(1, "�a�μ�"));
		}
		
		public Member findById(int id) { // ���� 5���� ���޵Ǹ�
			Member member = null;
			for(Member m : memberList) {
				if(m.getId() == id) {
					member = m;
				}
			}
			if(member == null) throw new NotFoundMemberException("ȸ���� ã�� �� ����");
			return member; // null�� �����Ѵ�
		}
		
}
