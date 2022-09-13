package test;

import java.util.ArrayList;
import java.util.List;

import model.Member;

public class Test5 {
	public static void main(String[] args) {
		List<Member> members = new ArrayList<Member>();
		
		members.add(new Member(11, "ȫ�浿", "123", "2134231"));
		members.add(new Member(22, "ȫ�浿", "123", "2134231"));
		members.add(new Member(33, "ȫ�浿", "123", "2134231"));
		
		System.out.println(members);
		
		
	}
}
