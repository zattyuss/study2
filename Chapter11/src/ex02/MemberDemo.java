package ex02;

public class MemberDemo {
	public static void main(String[] args) {
		Member member1 = new Member(1, "?浿ȫ");
		Member member2 = new Member(1, "?浿ȫ");
		
		System.out.println(member1==member2);
		System.out.println(member1.equals(member2));
		
		User user = new User();
		System.out.println(member1.equals(user));
	}
}

class User{
	int id;
	String name = "ȫ?浿";
}