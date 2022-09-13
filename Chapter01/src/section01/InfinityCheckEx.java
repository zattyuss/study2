package section01;

public class InfinityCheckEx {

	public static void main(String[] args) {
		
		//래퍼객체
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		
		
		int x = 5;
		double d = 0;
		double result = x/d;
		System.out.println("double 타입 : "+result);
		
		int x2 = 5;
		float d2 = 0;
		float result2 = x2/d2;
		System.out.println("float 타입 : "+result2);
	}

}
