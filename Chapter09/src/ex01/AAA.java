package ex01;

public class AAA {
	
	
	// BBB, CCC : 멤버 클래스
	class BBB{
		// 인스턴스 멤버 클래스
		// AAA클래스의 객체 생성 이후 BBB클래스의 객체생성이 가능함
		public BBB() {
			System.out.println("BBB객체생성");
		}
	}
	
	static class CCC{
		// 정적(스태틱) 멤버 클래스
		//AAA클래스로 접근 후 바로 객체 생성 가능
		public CCC() {
			System.out.println("CCC객체생성");
		}
	}
	
	
	void methodA() {
		System.out.println("methodA 호출");
		class DDD{
			// 로컬 클래스
			// methodA()밖에서 사용 할수 없음
		public DDD() {
			System.out.println("DDD객체생성");
		}	
			
		}
		DDD ddd = new DDD();
	}
	
	void methodB() {
		
	}
	
	
}
