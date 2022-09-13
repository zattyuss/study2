package ex01;

public class MemberService {

		private MemberDao dao;

		public void setDao(MemberDao dao) {
			this.dao = dao;
		}
		
		public void memberList() {
			dao.selectAll();
		}
}
