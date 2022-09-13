package section01;

public class SingOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = -100; // 리터럴앞에 부호연산자를 붙여 음수 표현
		int result1 = +x; // 부호유지
		int result2 = -x; // 부호변경
		
		System.out.println("result1="+result1);
		System.out.println("result2="+result2);
		
		// byte타입 변수, short타입 변수에 부호연산자를 작용하면
		// 연산의 결과는 int 타입이된다.
		short s = 100;
//		short result3 = -s; // 컴파일 에러
//      short result3 = +s; // 컴파일 에러
		int result3 = -s;
		System.out.println("result3="+result3);
	}

}
