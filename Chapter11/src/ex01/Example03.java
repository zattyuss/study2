package ex01;

public class Example03 {
	public static void main(String[] args) {
		Member member1 = new Member("홍길동");
		Member member2 = new Member("홍길동");
		
		//member1과 member2는 서로 다른 객체이다.
		System.out.println(member1 != member2);
		
		//member1과 member2는 논리적 동등이다
		System.out.println(member1.equals(member2));
		//논리적 동등을 판단할 수 있게 equals메소드를 재정의해야함
		// String 클래스의 equals메소드는 이미 재정의 되어있음
		
		//재정의 전에 동일 방식으로 동작
		System.out.println(member1 == member2);
		System.out.println(member1.equals(member2));
		
	}
}

class Member {
	String name;

	public Member(String name) {
		this.name = name;
	}
	
	
}