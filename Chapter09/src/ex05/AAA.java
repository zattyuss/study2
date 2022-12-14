package ex05;

public class AAA {
	
	BBB bbb = new BBB("인스턴스 필드로 선언");
	CCC ccc = new CCC("인스턴스 필드로 선언");
	
	// 인스턴스 멤버 클래스는 스태틱 필드로 선언할 수 없다.
//	static BBB bbb1 = new BBB("인스턴스 필드로 선언");
	
	// 스태틱 멤버 클래스는 인스턴스필드, 스태틱 필드 모두 선언 가능하다.
	static CCC ccc1 = new CCC("인스턴스 필드로 선언");
	
	static {
//		BBB b = new BBB(); 
		CCC c = new CCC("스태틱 블록에 선언");
	}
	
	void methodA() { //인스턴스 메소드 : 인스턴스 멤버클래스, 스태틱 멤버 클래스 모두 사용가능
		System.out.println("=======================인스턴스 메소드 호출=================================");
		BBB bbb = new BBB("인스턴스 메소드에서 객체생성");
		CCC ccc = new CCC("인스턴스 메소드에서 객체생성");
		System.out.println("=======================인스턴스 메소드 호출=================================");
	}
	
	static void methodAA() {
		System.out.println("=======================인스턴스 메소드 호출=================================");
//		BBB bbb = new BBB("인스턴스 메소드에서 객체생성");
		CCC ccc = new CCC("인스턴스 메소드에서 객체생성");
		System.out.println("=======================인스턴스 메소드 호출=================================");
	}
	
	
	class BBB{  // 인스턴스 멤버 클래스
		public BBB(String message) {
			System.out.println("인스턴스 멤버 클래스 BBB 객체 생성 : " + message);
		}
	}
	
	static class CCC{ // 스태틱 멤버 클래스
		public CCC(String message) {
			System.out.println("스태틱 멤버 클래스 CCC 객체 생성 : " + message);
		}
	}
	
	
}
