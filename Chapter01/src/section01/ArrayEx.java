package section01;

import java.util.Arrays;

public class ArrayEx {
	public static void main(String[] args) {
		
		String[] oldstrArr= {"java", "mysql", "jsp" , "oracle","spring"};
		String[] newStrArr = new String[6];
		
		System.arraycopy(oldstrArr, 1, newStrArr, 2, 3 );
		System.out.println(Arrays.toString(newStrArr));
		
		System.out.println(oldstrArr[1]==newStrArr[2]);
		System.out.println(oldstrArr[2]==newStrArr[3]);
		System.out.println(oldstrArr[3]==newStrArr[4]);
		
	}
}
