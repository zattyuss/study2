package dao;

import java.util.ArrayList;
import java.util.List;

import model.Member;

//객체 생성, 객체간의 의존관계를 설정 (조립)
// DAO객체생성, 서비스객체 생성, 컨트롤러 객체 생성
public class MemberDao {

	private List<Member> memberList = new ArrayList<Member>();
	
	public MemberDao() {
		memberList.add(new Member(1, "길동1", "235", "1111@11.com"));
		memberList.add(new Member(1, "길동2", "235", "2222@22.com"));
		memberList.add(new Member(1, "길동3", "235", "3333@33.com"));
		memberList.add(new Member(1, "길동4", "235", "4444@44.com"));
		memberList.add(new Member(1, "길동5", "235", "5555@55.com"));
		
	}
	
	
	public List<Member> selectAll() {
		return memberList;
	}
	
}
