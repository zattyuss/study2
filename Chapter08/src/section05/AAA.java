package section05;

public interface AAA extends BBB, CCC {
	//	public static final ���� 
	//	public abstract ����
	String AAA_CONST = "AAA";
	void testAA(String aa);
	void testAAA(String aaa);
	
	// public ���� ����
	public default void de_testAA() {
		System.out.println("AAA : ������ �޼ҵ�");
		
	}
	public default void de_testAAA() {
		System.out.println("AAA : ������ �޼ҵ�(2)");
		
		
	}
	public default void st_testAA() {
		System.out.println("");
	}
	public default void st_testAAA() {
		System.out.println("");
	}
}
