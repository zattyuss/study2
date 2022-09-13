package checkEx;

public class CheckOverflowEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			int result = safeAdd(-210000000, -210000000);
			System.out.println(result);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("메인메소드 종료");
	}

	public static int safeAdd(int left, int right) {
		boolean allpositive = left>0 && right>0;
		boolean allnegative = left<0 && right<0;
		
		boolean maxBounded = allpositive && left > Integer.MAX_VALUE - right;
		boolean minBounded = allnegative && right < Integer.MIN_VALUE - left;
		
		if(maxBounded || minBounded) {
			throw new ArithmeticException("오버플로우 발생");
		}
		return left+right;
	}
	
	
}
