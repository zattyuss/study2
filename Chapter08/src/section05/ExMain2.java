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
				System.out.println("�͸�ü ���� ������ �޼ҵ�");
			}
			
		};
		ccc.testCCC();
		
		CCC ccc2 = () -> System.out.println("���ٽ�");
		ccc2.testCCC();
	}
}
