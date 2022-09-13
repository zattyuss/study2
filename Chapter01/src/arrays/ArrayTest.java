package arrays;

import java.util.Arrays;

public class ArrayTest {
	public static void main(String[] args) {
		int[] scores1 = {10,11,12,13};
		int[] scores2 = new int[] {100,200,300,400,500};
		
		System.out.println(scores1[0]);
		System.out.println(scores2[2]);
//		System.out.println(scores1[4]);
		System.out.println(scores1);
		System.out.println(Arrays.toString(scores1));
		
		int[] test1 = new int[6];
		System.out.println(Arrays.toString(test1));
		
	}
}
