package ArrayCreateByxxxx;

import java.util.Arrays;

public class MathScore {
	public static void main(String[] args) {
		
		int[][] arrayInArray = new int[3][4];
		System.out.println(Arrays.deepToString(arrayInArray));
		
		int[][] mathScore = {
				{00,01,02},
				{10,11,12},
				{20,21,22}
		};
		System.out.println(Arrays.deepToString(mathScore));
	}
}
