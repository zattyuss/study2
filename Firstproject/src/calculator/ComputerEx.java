package calculator;

public class ComputerEx {
	public static void main(String[] args) {
		
		Computer com = new Computer();
		int total = com.sum(new int[]{1,2,3,4,5});
		System.out.println("합계 : "+ total);
		
		int[] arr1 = {10,20,30,40,50};
		System.out.println("합계2 : " + com.sum(arr1));
		
		
		int result1 = com.sum2(10,20);
		int result2 = com.sum2(10,20,30);
		int result3 = com.sum2(10,20,30,40);
		int result4 = com.sum2(new int[] {1,2,3,4,44,55});
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
	}
}
