package member2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberDao {
	private static MemberDao dao = new MemberDao();
	private ArrayList<Member> members;
	
	
	private MemberDao() {
		Member member1 = new Member(1, "È«±æµ¿");
		Member member2 = new Member(2, "±è±æµ¿");
		List<Member> list = Arrays.asList(member1, member2);
		members = new ArrayList<Member>(list);
		
	}



	public static MemberDao getInstance() {
		return dao;
	}



	public ArrayList<Member> findAll() {
		return members;
	}



	public void addMember(Member member) {
		members.add(member);
		
	}



	public Member findById(int i) {
		return members.get(i-1);
	}



	public void modifyMember(int i, String name) {
		members.get(i-1).setName(name);
	}
	
}
