package section01;

public class PromotionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte byteValue = 10;
//		char chValue = byteValue; // 컴파일 에러 : byte타입을 char타입으로 자동 타입 변환할 수 없다.
		int intValue = byteValue; //byte 타입을 int 타입으로 자동 타입 변환
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue; // char 타입은 int 타입으로 자동 타입 변한된다.
		System.out.println("가의 유니코드=" + intValue);
		
		intValue = 500;
		long longValue = intValue; // int 타입을 long 타입으로 자동 타입 변환
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue; // int 타입을 double 타입으로 자동 타입 변환
		System.out.println(intValue);
				
		
	}

}
