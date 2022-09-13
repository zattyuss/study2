package section.exam10;

public class ComputerEx {
	public static void main(String[] args) {
		Computer com = new Computer();
		
		int[] values = {10,11,22};
		System.out.println(com.sum1(values));
		
		int result = com.sum1(new int[] {10,11,20});
		System.out.println(result);
		
		int result1 = com.sum2();
		int result2 = com.sum2(1);
		int result3 = com.sum2(1,2);
		int result4 = com.sum2(1,2,3);
		System.out.println(result1);
		System.out.println(result2);
	}
}
