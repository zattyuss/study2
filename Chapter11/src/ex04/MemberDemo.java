package ex04;

public class MemberDemo {
	public static void main(String[] args) {
		Member member1 = new Member(1, "홍길동", "adfsdfa");
		Address address1 = new Address("고령군", "대가야읍 연조2길 8-8", 40136);
		member1.setAddress(address1);
		printInfo(member1);
		
		Member member2 = new Member(1, "홍길동", "adfsdfa");
		Address address2 = new Address("고령군", "대가야읍 연조2길 8-8", 40136);
		member2.setAddress(address2);
		
		System.out.println(member1.equals(member2));
	}

	private static void printInfo(Member member) {
		System.out.println("================================");
		System.out.println("회원번호 : " + member.getId());
		System.out.println("회원이름 : " + member.getName());
		System.out.println("회원 이메일 : " + member.getEmail());
		Address addr = member.getAddress();
		System.out.println("주소 : " + member.getAddress().getState() + 
								" " + member.getAddress().getCity() +
								" " + member.getAddress().getZip());
		
	}
}
