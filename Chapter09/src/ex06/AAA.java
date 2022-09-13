package ex06;

public class AAA { // 내부 클래스
	
	int aaa = 10; // 외부클래스의 인스턴스 필드 변수
	static int aa = 100; //외부클래스의 스태틱 필드 변수
	void methodA() {
		System.out.println("외부클래스 인스턴스 메소드 호출");
	}
	
	static void methodAA(){
		System.out.println("내부클래스 스태틱 메소드 호출");
	}
	
	class BBB{ // 내부 클래스 : 인스턴스 멤버 클래스
		void methodB() {
			System.out.println(aaa);
			System.out.println(aa);
			methodA();
			methodAA();
		}
	}
	
	static class CCC{ // 내부클래스 : 스태틱 멤버 클래스
		void methodC() {
//			System.out.println(aaa); // 외부클래스의 인스턴스 필드 접근 불가
			System.out.println(aa); // 외부클래스의 스태틱 필드 변수 접근
//			methodA(); // 외부클래스의 인스턴스 메소드로 접근 불가
			methodAA(); // 외부클래스의 스태틱 메소드 접근
		}
		static void methodCC() { // 내부 클래스의 스태틱 메소드에서
//			System.out.println(aaa); // 외부클래스의 인스턴스 필드 접근 불가
			System.out.println(aa); // 외부클래스의 스태틱 필드 변수 접근
//			methodA(); // 외부클래스의 인스턴스 메소드로 접근 불가
			methodAA(); // 외부클래스의 스태틱 메소드 접근
		}
		
	}
	
	
}
