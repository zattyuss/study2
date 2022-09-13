package section08;

public class GameMain {
	public static void main(String[] args) {
		Hero h = new LanceMaster(); // 상위 참조타입
		//부모타입의 참조변수로는 부모타입에 선언된 메소드만 사용할 수 있다.
		h.attack();
		h.move();
		
		// 자식 클래스에 오버라이드 된 메소드가 있다면 
		h.useUlt(); // 오버라이드 된 메소드 사용함!!!!
		
		
		LanceMaster h2 = new LanceMaster(); // 자신의 참조타입
		h2.attack();
		h2.move();
		h2.useUlt();
		h2.infoLanceMaster();
	}
}
