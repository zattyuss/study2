package section01;

public class OperationsPromotionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		// byte byteValue3 = byteValue1 + byteValue2; //컴파일 에러
		int intValue1 = byteValue1 + byteValue2; // 연산과정에서 int로 자동 타입 변환 된다
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		// char charValue3 = charValue1 + charValue2; //컴파일 에러
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.err.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10 / 4.0; //컴파일 에러 : 4.0은 double타입이다
		double doubleValue = (double)intValue5 / 4.0;
		System.out.println(doubleValue);
	}

}
