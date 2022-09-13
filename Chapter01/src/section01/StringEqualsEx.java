package section01;

public class StringEqualsEx {
	public static void main(String[] args) {
		String strVa1 = "신민철";
		String strVa2 = "신민철";
		String strVa3 = new String("신민철");
		String strVa4 = new String("신민철");
		isRefEquals(strVa1, strVa2);
		isRefEquals(strVa2, strVa3);
		isRefEquals(strVa3, strVa4);
		
		isValueEquals(strVa1, strVa2);
		isValueEquals(strVa2, strVa3);
		isValueEquals(strVa3, strVa4);
	}
	
	
	public static void isRefEquals(String var1, String var2) {
		if(var1 == var2) {
			System.out.println("두 변수는 참조값이 같다.");
			return;
		}
		System.out.println("두 변수는 참조값이 다르다.");
		
		
		
	}
	public static void isValueEquals(String var1, String var2) {
		if(var1.equals(var2)) {
			System.out.println("두 변수의 문자열이 같다.");
			return;
		}
		System.out.println("두 변수의 문자열이 다르다.");
	}
	
	
}
	