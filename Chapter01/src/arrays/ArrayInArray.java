package arrays;

import java.util.Arrays;

public class ArrayInArray {
	public static void main(String[] args) {
		int[][] test1 = new int[3][6];
		
		int[][] test2 = {
				{1,2,3,4,5,6},
				{11,22,33,55,66},
				{12,13,16,17}
				
		};
		System.out.println(Arrays.toString(test2));
		System.out.println(Arrays.deepToString(test2));
	}
}
