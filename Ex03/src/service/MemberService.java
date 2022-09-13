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
			System.out.println("�߸��� �� �Է�");
		}
		return findMember;
	}
	
	public List<Member> findByName(String name){
		//����ó���ؾ���
		List<Member> members = null;
		try {
			members = dao.selectByName(name);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return members;
	}
	
	public void save() {
		System.out.println("�̸� �Է�");
		String name = scan.nextLine();
		System.out.println("��й�ȣ �Է�");
		String password = scan.nextLine();
		System.out.println("�̸��� �Է�");
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
		System.out.println("���� �� �̸����� �Է��ϼ���");
		String email = scan.nextLine();
		dao.update(id, email);
	}
}