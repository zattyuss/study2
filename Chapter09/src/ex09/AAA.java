package ex09;

public class AAA {
	int aaa = 10; // 외부클래스의 인스턴스 필드
	static int aa = 100; // 외부클래스의 스태틱 필드
	
	void methodA() { // 외부클래스의 인스턴스 메소드
		System.out.println("외부 클래스의 인스턴스 메소드");
	}
	static void methodAA() { // 외부클래스의 스태틱 메소드
		System.out.println("외부클래스의 스태틱 메소드");
	}
	void methodD() { // 로컬클래스가 존해하는 메소드
		class DDD{ // 내부클래스 : 로컬클래스
			void methodD() { // 로컬클래스의 인스턴스 메소드
				// 외부클래스의 모든 필드, 메소드에 접근할 수 잇따.
				System.out.println(aaa);
				System.out.println(aa);
				methodA();
				methodAA();
			}
		}
		new DDD().methodD();
	}	
	
	public static void main(String[] args) {
		AAA aaa = new AAA();
		aaa.methodD();
	}
	
	
	
	
}
