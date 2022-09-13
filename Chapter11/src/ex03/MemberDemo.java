package ex03;

public class MemberDemo {
	public static void main(String[] args) {
		Member member1 = new Member(1, "이클립스", " gadagsd", "1234");
		Member member2 = new Member(1, "이클립스", " gadagsd", "1234");
		System.out.println(member1.equals(member2));
	}
}
