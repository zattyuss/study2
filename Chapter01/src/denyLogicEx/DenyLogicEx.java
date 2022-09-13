package denyLogicEx;

public class DenyLogicEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value = 10;
		
		//비교연산자는 논리연산자보다 우선순위가 높다.
		// 따라서 !value > 20 처럼 쓰지 않도록 한다.
		if(!(value > 20)) {
			System.out.println("value값은 20보다 크지 않다.");
		}
	}

}
