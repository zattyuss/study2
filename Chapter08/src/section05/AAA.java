package section05;

public interface AAA extends BBB, CCC {
	//	public static final 생략 
	//	public abstract 생략
	String AAA_CONST = "AAA";
	void testAA(String aa);
	void testAAA(String aaa);
	
	// public 생략 가능
	public default void de_testAA() {
		System.out.println("AAA : 디폴드 메소드");
		
	}
	public default void de_testAAA() {
		System.out.println("AAA : 디폴드 메소드(2)");
		
		
	}
	public default void st_testAA() {
		System.out.println("");
	}
	public default void st_testAAA() {
		System.out.println("");
	}
}
