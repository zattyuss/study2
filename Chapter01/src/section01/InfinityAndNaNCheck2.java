package section01;

public class InfinityAndNaNCheck2 {

	public static void main(String[] args) {
		double result1 = 5/0.0;
		double result2 = 5%0.0;
		double result3 = 10%4.5;
		
		isNanOrInfinite(result1);
		isNanOrInfinite(result2);
		isNanOrInfinite(result3);
	}
	
	public static void isNanOrInfinite(double result) {
		if(Double.isInfinite(result) || Double.isNaN(result)) {
			System.out.println("연산을 수행할 수 없습니다.");
			return; //아래 메소드 블록을 실행하지 않고 메소드를 탈출한다.
		}
		System.out.println("연산된 결과는 " + result + "입니다.");
	}
	

}
