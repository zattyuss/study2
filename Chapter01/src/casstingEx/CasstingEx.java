package casstingEx;

public class CasstingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		// double -> int 강제타입변환
		double doubleValue = 3.14;
		intValue = (int) doubleValue; //double > int 강제타입변환이 필요
		System.out.println(intValue); //데이터 손실 발생
		
				
	}

}
