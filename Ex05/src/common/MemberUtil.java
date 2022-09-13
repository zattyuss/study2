package common;

import java.util.List;

import model.Member;

public class MemberUtil {
	//이름으로 찾기
	public static void printInfo(Member member) {
		System.out.println("==================================");
		System.out.println("회원번호 : " + member.getId());
		System.out.println("회원이름 : " + member.getName());
		System.out.println("회원이메일 : " + member.getEmail());
	}
	// 회원 번호로 찾기
	public static void printInfo(List<Member> memberList) {
		for (Member m : memberList) {
			System.out.println("==================================");
			System.out.println("회원번호 : " + m.getId());
			System.out.println("회원이름 : " + m.getName());
			System.out.println("회원이메일 : " + m.getEmail());
		}
	}
	
	public static void help() {
		System.out.println("==================================");
		System.out.println("0. 프로그램 종료");
		System.out.println("1. 모든 회원정보 조회");
		System.out.println("2. 회원번호 조회");
		System.out.println("3. 회원이름으로 조회");
		System.out.println("4. 회원가입");
		System.out.println("5. 회원삭제");
		System.out.println("==================================");
	}

}
