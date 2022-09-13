package ArrayCreateByxxxx;

import java.util.Arrays;

public class ArrayCreateByNewEx2 {
	public static void main(String[] args) {
		
		int[] intArr =new int[4];
		intArr[0] = 10;
		intArr[1] = 11;
		intArr[2] = 12;
		intArr[3] = 13;
		
		System.out.println(Arrays.toString(intArr));
		int[] intArr2= {10,11,12,13};
		System.out.println(Arrays.toString(intArr2));
	}
}
