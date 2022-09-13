package section01;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greeting ="사전투표해";
		System.out.println("proceed메소드를 호출합니다.");
		proceed(greeting); //메소드 호출
		System.out.println("메인메소드를 종료합니다.");
	}
	
	public static void proceed(String message) {
		System.out.println("메소드를 호출하면 이 블록을 실행합니다.");
		System.out.println("전달 받은 메시지 출력 : "+ message);
	}
}
