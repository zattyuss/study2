package section.exam05;

public class Test00 {
	public static void main(String[] args) {
		String greeting = "안녕하세요";
		System.out.println("proceed메소드를 호출합니다");
		
		Test00.proceed(greeting);
		
		proceed(greeting);
		
		System.out.println("메인메소드를 종료합니다.");
		
	}
	public static void proceed(String message) {
		System.out.println("메소드를 호출하면 이 블럭을 실행합니다.");
		System.out.println("전달 받은 메시지 출력 : "+ message);
	}
}
