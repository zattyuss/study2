package denyLogicEx;

public class DenyLogicEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean play = true;
		
		System.out.println("재생 상태 :"+play);
		
		// 대입연산자는 우선순위가 가장 낮다.
		play = !play; // !play연산이 수행되고 대입 연산이 수행된다.
		System.out.println("재생 상태 :"+play);
	}

}
