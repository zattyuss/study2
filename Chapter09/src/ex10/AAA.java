package ex10;

public class AAA {
	
	void methodA(int aaa1) { // 지역변수(매개변수)
		int aaa2 = 100; // 지역변수
		class DDD { // 로컬클래스
			void methodB() {
				System.out.println(aaa1);
				System.out.println(aaa2);
//				aaa1 = 660; // 재할당 불가 final 생략
//				aaa2 = 700; // 재할당 불가 final 생략
				
				
				
				
			}
		}
	}
}
