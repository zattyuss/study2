package section01;

public class NaNCheckEx {

	public static void main(String[] args) {
		
		//실수타입 래퍼클래스에 정의된 NaN
		System.out.println(Double.NaN);
		
		//실수타입 0.0 또는 0.0f로 나머지 연산을 하는 경우
		int x= 5;
		double d =0.0;
		double result1 = x%d;
		System.out.println("double 타입 : "+ result1); //예외발생X
		
		float f = 0.0f;
		float result2 = x%f;
		System.out.println("float 타입 : "+result2);
	}

}
