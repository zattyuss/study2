package service;

import java.util.List;
import java.util.Scanner;

import common.FoundNotMember;
import dao.MemberDao;
import model.Member;

public class MemberService {

	private MemberDao dao;
	private Scanner scan = new Scanner(System.in);

	public MemberService(MemberDao dao) {
		this.dao = dao;
	}

	public List<Member> findAll(){
		return dao.memberList();
	}
	
	public Member findById(String inputId) {
		Member findMember =null;
		try {
			int id = Integer.parseInt(inputId);
			findMember = dao.selectById(id);
			
		} catch (FoundNotMember e) {
			System.out.println(e.getMessage());
		} catch(NumberFormatException e) {
			System.out.println("잘못된 값 입력");
		}
		return findMember;
	}
	
	public List<Member> findByName(String name){
		//예외처리해야함
		List<Member> members = null;
		try {
			members = dao.selectByName(name);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return members;
	}
	
	public void save() {
		System.out.println("이름 입력");
		String name = scan.nextLine();
		System.out.println("비밀번호 입력");
		String password = scan.nextLine();
		System.out.println("이메일 입력");
		String email = scan.next();
		
		Member member = new Member(name, password, email);
		dao.insert(member);
	}
	
	public void remove(int id){
		try {
			dao.delete(id);
			
		} catch (FoundNotMember e) {
			System.out.println(e.getMessage());
		}
	}
	public void modifiy(int id) {
		System.out.println("수정 할 이메일을 입력하세요");
		String email = scan.nextLine();
		dao.update(id, email);
	}
}
