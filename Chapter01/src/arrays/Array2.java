package arrays;

import java.util.Arrays;

public class Array2 {
	public static void main(String[] args) {
		
		String[] oldStrArr = {"java","mysql","jsp","oracle","spring"};
		String[] newStrArr = new String[6];
		System.arraycopy(oldStrArr, 1, newStrArr, 2, 3);
		
		System.out.println(Arrays.toString(newStrArr));
		
		System.out.println(oldStrArr[1]==newStrArr[2]);
		System.out.println(oldStrArr[2]==newStrArr[3]);
		System.out.println(oldStrArr[3]==newStrArr[4]);
	}
}
