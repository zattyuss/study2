package section01;

public class PrimitiveType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수타입
		byte byteValue = 100; //바이트 타입
		char chValue = 'F'; //캐릭터 타입
		short shValue = 100; // 숏 타입
		int intValue = 124; // 인트 타입
		long longValue = 1535; //롱 타입
		
		System.out.println(byteValue+10);
		System.out.println(chValue);
		System.out.println(shValue*2);
		System.out.println(intValue+26);
		System.out.println(longValue-1534);
		
		System.out.println("=========구분선=========");
		
		// 실수 타입
		float floatvalue1 = 10.111f;
		float floatvalue2 = 3.14F;  //생략 불가능
		double doublevalue1 = 3.1415920;
		double doublevalue2 = 3.141592d;
		double doublevalue3 = 3.141592; //생략 가능
		
		System.out.println(floatvalue1+11.889);
		System.out.println(floatvalue2+2);
		System.out.println(doublevalue1+3.14);
		System.out.println(doublevalue2*123);
		System.out.println(doublevalue3-2.456465);
		
		System.out.println("=========구분선=========");
		//논리 타입
		boolean booleanvalue1 = true;
		boolean booleanvalue2 = false;
		
		System.out.println(booleanvalue1);
		System.out.println(booleanvalue2);
	}

}
