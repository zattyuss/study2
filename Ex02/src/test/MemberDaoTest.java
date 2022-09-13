package test;

import dao.MemberDao;
import model.Member;

public class MemberDaoTest {
	public static void main(String[] args) {
		MemberDao dao = new MemberDao();
		Member selectById = dao.selectById(1);
		System.out.println(selectById.getName());
		
		Member selectById2 = dao.selectById(2);
		System.out.println(selectById.getName());
		
	}
}
