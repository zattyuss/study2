package section01;

public class RemainderOperationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//우측 피연산자로 0을 사용하면 ArithmeticException이 발생한다.
		
// int 타입뿐만 아니라 모든 정수타입에 % 연산자를 사용할 수 있다.
		char ch1 = '가';
		char ch2 = 'A';
		int result1 = ch1%ch2;
		System.out.println("result1:"+result1);
		
		// 피연산자가 음수인 경우 절댓값으로 연산 수행
		int num1 = -10;
		int num2 = -3;
		int result2 = num1/num2;
		System.out.println("result2:"+result2);
	
	}

}
