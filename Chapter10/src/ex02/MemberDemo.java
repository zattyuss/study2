package ex02;

import java.util.ArrayList;
import java.util.List;

public class MemberDemo {
	
	public static void main(String[] args) {
		List<String> members = new ArrayList<String>();
		members.add("ȫ�浿");
		members.add("�ʱ浿");
		members.add("��浿");
		
		String name1 = members.get(0);
		System.out.println(name1);
		String name2 = members.get(1);
		System.out.println(name2);
		String name3 = members.get(2);
		System.out.println(name3);
		String name4 = members.get(3);
		System.out.println(name4);
	}
}
