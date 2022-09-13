package section01;

public class MethodEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("AA메소드 실행");
		methodAA();
		
		System.out.println("메인메소드 종료");
		
	}
	
	public static void methodAA( ) {
		System.out.println("methodAA실행");
		methodBB();
	}
	
	public static void methodBB( ) {
		System.out.println("method실행");
	}
}
