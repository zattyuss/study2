package section05;

public interface ExMain2 {
	public static void main(String[] args) {
		CCC ccc = new CCC() {
			
			
			public int test = 1000;
			
			
			
			
			
			@Override
			public void testCCC() {
				System.out.println(test);
				System.out.println("CCCCCCCCCCCCC");
				testEE();
			}
			public void testEE() {
				System.out.println("익명객체 내부 임의의 메소드");
			}
			
		};
		ccc.testCCC();
		
		CCC ccc2 = () -> System.out.println("람다식");
		ccc2.testCCC();
	}
}
