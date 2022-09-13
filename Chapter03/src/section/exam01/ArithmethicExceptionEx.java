package section.exam01;

public class ArithmethicExceptionEx {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 0;
		
		
		try {
			int result = num1/num2;
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		
	}
}
