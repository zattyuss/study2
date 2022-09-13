package section01;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 0;
		
		try {
			int result = num1/num2;
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		System.out.println("안녕?");
		
	}

}
