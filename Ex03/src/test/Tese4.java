package test;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public class Tese4 {
	private static List<Member> memberList;

	public static void main(String[] args) {
		List<Member> members = new ArrayList<Member>();
		
		members.add(new Member(1, "잠온다1", "집 가고싶다", "갈까1?"));
		members.add(new Member(2, "잠온다2", "집 가고싶다", "갈까2?"));
		members.add(new Member(3, "잠온다3", "집 가고싶다", "갈까3?"));
		
		System.out.println(members);
		
		Member member = members.get(1);
		System.out.println("회원번호 : " + member.getId());
		System.out.println("이름 : " + member.getName());
		System.out.println("이메일 : " + member.getEmail());
		
		System.out.println("전체회원수 : " + members.size()+"명");
		
		int index = members.size()-1;
		System.out.println("가장 최근에 가입한 회원 : " + members.size()+ "명");
		
	}
}
