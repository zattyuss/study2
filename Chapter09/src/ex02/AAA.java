package ex02;

public class AAA {
	
	int a = 10; // 인스턴스 필드 변수
	static int b; // 스태틱 필드 변수
	public final static int C = 1000; //(정)상수
	
	public AAA() { // 생성자
		System.out.println("AAA객체 생성");
	} 
	void methodA() { // 인스턴스 메소드
		System.out.println("중첩클래스 AAA메소드 : methodA");
	} 
	static void methodAA() {} // 스태틱 메소드
	
	class BBB{ // 인스턴스 멤버 클래스
		int aa = 20; // 인스턴스 필드 변수 ok
//		static int bb; // 스태틱 필드 변수 컴파일 에러 
		public final static int CC = 100; // 상수 필드 선언 가능
		
		public BBB() { // 생성자
			System.out.println("BBB객체 생성");
		} 

		//		static {} // 스태틱블록 컴파일 에러
		
		void methodB() { // 인스턴스 메소드 선언 가능 
			System.out.println("내부 클래스BBB 메소드 : methodB");
		}
//		static methodBB() {} // 스태틱 메소드 컴파일 에러
		
		
		
		
		
	}
}
