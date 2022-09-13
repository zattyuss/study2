package section01;

public class LongTypeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		long var1 = 2147483647;
		long var2 = -2147483648;
		
//		long var3 = -2147483649;
//		long var4 = 2147483648;
		
		long var3 = 2147483648L;
		long var4 = -2147483649L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var3);
		System.out.println(var4);
	}

}
