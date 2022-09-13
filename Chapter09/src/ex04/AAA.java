package ex04;

public class AAA {
	
	void methodA() {
		System.out.println("클래스AAA : methodA 호출");
		class DDD {
			int ddd; // 인스턴스 필드 변수
//			static int ddd2; // 스태틱 필드 변수 불가능
			public final static int CONT_DDD = 100000; // 상수
//			static {} // 스태틱블록 불가능
			public DDD() { // 생성자
				System.out.println("DDD 객체 생성");
			}
			
			//인스턴스 메소드
			void methodD() {
				System.out.println("DDD 클래스 인스턴스 메소드 호출");
			}
			
			//정적(스태틱) 메소드 불가능
//			static void methodD() {}						
		}
		DDD d = new DDD();
		d.ddd = 20;
		System.out.println("인스턴스 필드 변수 : " + d.ddd);
		d.methodD();
		
		
		
										
	}
	void methodAA() {
//		DDD ddd = new DDD();
	}
}
