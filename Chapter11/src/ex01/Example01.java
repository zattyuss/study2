package ex01;

import java.util.Arrays;

public class Example01 {
	public static void main(String[] args) {
		String[] arr1 = {"홍","길","동","전"};
		System.out.println(arr1);
		String string = Arrays.toString(arr1);
		System.out.println(Arrays.toString(arr1));
		
		String[][] arr2 = {
				{"엄","마","찾","아","삼","만","리"},
				{"엄","마","찾","는","둘","리"}
		};
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.deepToString(arr2));
	}
}
