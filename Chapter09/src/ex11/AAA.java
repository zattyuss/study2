package ex11;

public class AAA {
	String str = "AAA클래스 인스턴스 필드 변수";
	
	class BBB{ // 인스턴스 멤버 클래스
		String str = "BBB클래스 인스턴스 필드 변수"; // 인스턴스 필드 변수
		
		void print() {
			String str = "print메소드의 지역변수";
			System.out.println(this.str);
			System.out.println(AAA.this.str);
		}
	}
	public static void main(String[] args) {
		AAA aaa = new AAA(); // 외부클래스 객체먼저 생성 후
		BBB bbb = aaa.new BBB(); // 내부클래스 인스턴스 객체 생성
		bbb.print();
	}
}
