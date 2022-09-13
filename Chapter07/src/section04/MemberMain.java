package section04;

public class MemberMain {
	public static void main(String[] args) {
		Member member = new Member(1,"ȫ�浿");
		member.setPassword("1234");
		member.setEmail("hong@example.com");
		System.out.println(member);
		System.out.println(member.getClass());
		System.out.println(member.hashCode());
	}
}
