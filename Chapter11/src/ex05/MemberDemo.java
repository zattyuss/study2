package ex05;

import java.util.HashMap;
import java.util.Map;

public class MemberDemo {
	public static void main(String[] args) {
		Member member1 = new Member(1, "?ڱ???");
		Member member2 = new Member(2, "??????");
		Member member3 = new Member(3, "??????");
		System.out.println(member1.hashCode());
		System.out.println(member3.hashCode());
		System.out.println(member2.hashCode());
		
		Map<Member, String> map = new HashMap<Member, String>();
		map.put(member1, "????????");
		map.put(member2, "????????");
		map.put(member3, "????????");
		System.out.println(map);
		
		
		
		String name1 = map.get(member1);
		System.out.println(name1);
		System.out.println(map.get(member2));
		System.out.println(map.get(member3));
		
		System.out.println(map.get(new Member(1, "?ڱ???")));
		System.out.println(map.get(new Member(2, "??????")));
		System.out.println(map.get(new Member(3, "??????")));
		
		
	}
}
