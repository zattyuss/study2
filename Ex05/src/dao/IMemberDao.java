package dao;

import java.util.List;

import model.Member;

public interface IMemberDao {

	List<Member> memberList();
	
	Member selectById(int id);
	
	List<Member> selectByName(String name);
	
	void insert(Member member);
	
	 void delete(int id);
	
	void update(int id, String email);
	
	
	
}
