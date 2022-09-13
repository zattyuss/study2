package ex03;

public class AAA {
	
	// 정적 멤버 클래스
	static class CCC{
		int ccc; // 필드 변수
		static int ccc2; // 스태틱 필드 변수
		public static final int CONT_CCC; // 상수 필드
		
		static { //스태틱 필드 변수만 가능
//			ccc = 10; // 인스턴스 필드 변수 초괴화 컴파일 에러
			ccc2 = 1000; // 스태틱 필드 초기화
			CONT_CCC = 1000000; // 상수 쵝화
//			methodC(); // 인스턴스 메소드 호출 불가능
			methodCC(); 
		}
		public CCC() {
			System.out.println("CCC 객체 생성");
		}
		
		void methodC() {
			System.out.println("인스턴스 메소드");
		}
		static void methodCC() {
			System.out.println("정적 메소드");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
