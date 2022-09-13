package test;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str = "문자열 연산 예시";
			System.out.println("문자열 연산입니다." + str);
			
			int value = 100;
			System.out.println("value 값 : " + value);
			
			//int 타입의 최댓값 wrapper
			System.out.println("int 타입의 최댓값 : "+Integer.MAX_VALUE);
			System.out.println("int 타입의 최솟값 : "+Integer.MIN_VALUE);
			
			System.out.println("byte 타입의 최댓값 : "+Byte.MAX_VALUE);
			System.out.println("byte 타입의 최솟값 : "+Byte.MIN_VALUE);
			
			System.out.println("char 타입의 최댓값 : "+(int)Character.MAX_VALUE);
			System.out.println("char 타입의 최솟값 : "+(int)Character.MIN_VALUE);
			
			System.out.println("short 타입의 최댓값 : "+Short.MAX_VALUE);
			System.out.println("short 타입의 최솟값 : "+Short.MIN_VALUE);
			
			System.out.println("float 타입의 최댓값 : "+Float.MAX_VALUE);
			System.out.println("float 타입의 최솟값 : "+Float.MIN_VALUE);
			
			System.out.println("double 타입의 최댓값 : "+Double.MAX_VALUE);
			System.out.println("double 타입의 최솟값 : "+Double.MIN_VALUE);
	}

}
