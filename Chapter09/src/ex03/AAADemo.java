package ex03;

public class AAADemo {
	public static void main(String[] args) {
		System.out.println("스태틱 필드 변수에 접근 : " + AAA.CCC.ccc2);
		System.out.println("(정)상수에 접근 : " + AAA.CCC.CONT_CCC);
		AAA.CCC.methodCC();
		
		
		// 정적 멤버 클래스 생성
		AAA.CCC ccc = new AAA.CCC();
		ccc.ccc = 23232;
		System.out.println("인스턴스 필드 변수에 접근 : " + ccc.ccc);
		ccc.methodC();
		
		
		
		
		
		
		
	}
}
