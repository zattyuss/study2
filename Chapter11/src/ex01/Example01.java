package ex01;

import java.util.Arrays;

public class Example01 {
	public static void main(String[] args) {
		String[] arr1 = {"ȫ","��","��","��"};
		System.out.println(arr1);
		String string = Arrays.toString(arr1);
		System.out.println(Arrays.toString(arr1));
		
		String[][] arr2 = {
				{"��","��","ã","��","��","��","��"},
				{"��","��","ã","��","��","��"}
		};
		System.out.println(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.deepToString(arr2));
	}
}